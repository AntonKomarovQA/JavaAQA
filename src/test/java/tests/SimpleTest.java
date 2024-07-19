package tests;

import com.fasterxml.jackson.databind.ObjectMapper;
import listener.RetryListener;
import models.Cat;
import models.Dog;
import models.People;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;
import utilits.JsonHelper;

import java.io.File;
import java.io.IOException;
import java.util.stream.Stream;

public class SimpleTest {
    private static Stream<Arguments> testPeople() {  // создался статичный метод
        return Stream.of(
                Arguments.of(new People("stas", 18, "male")),
                Arguments.of(new People("masha", 20, "female")),
                Arguments.of(new People("misha", 21, "male"))
        );
    }
    @AfterAll
    public static void saveFailed(){
        RetryListener.saveFailedTest();
    }
    @Test
    @Disabled
    public void testTwoLessThanThree() {
        int a = 2;
        int b = 3;
        Assertions.assertTrue(a > b, "Число " + a + " Больше чем " + b);

    }

    @Test
    @DisplayName("Результат сложения")
    @Disabled
    void twoLessThanThree() {
        int a = 3;
        int b = 2;
        int sum = a + b;
        Assertions.assertEquals(5, sum);
    }


    @ParameterizedTest // пример параметризированного теста
    @CsvFileSource(resources = "/people", delimiter = ',') // был создан file people где были указаны тестовые данные
    public void setPeople(String name, String age, String sex) {
        System.out.println(name + " " + age + " " + sex);
        Assertions.assertTrue(name.contains("s")); // имя содержит букву s
    }

    @ParameterizedTest
    @MethodSource("testPeople")
    // MethodSource позволяет взаимодействовать с Обьектами в (теле передаем метод с обьектами)
    public void setPeople1(People p) {
        System.out.println(p.getName() + " " + p.getAge() + " " + p.getSex());
        Assertions.assertTrue(p.getName().contains("s")); // имя содержит букву s
    }

    @Test
    public void calculator2() {
        Assertions.assertEquals(4, 2 + 2);
    }

    //new Test Jacson
    @Test
    public void testJacson() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("src\\test\\resources\\stas.json"); // путь к файлу
        People p = objectMapper.readValue(file, People.class); // преобразование файла в Обьект
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getSex());

        //Новый обьект и нвоый тест
        File fileCat = new File("src\\test\\resources\\cat.json"); // путь к файлу
        Cat c = objectMapper.readValue(fileCat, Cat.class); // преобразование файла в Обьект
        System.out.println(c);

        People sasha = new People("Sasha",10,"femele"); // преобразование новосозданного Обьекта в json
        String json = objectMapper.writeValueAsString(sasha);
        System.out.println(json);
    }
    //new Test Jacson c помощью утилиты которую сам прописал JsonHelp
    @Test
    public void testJacsonWhitHelper() throws IOException {

        Cat c = JsonHelper.fromJsonFile("src\\test\\resources\\cat.json",Cat.class); // преобразование файла в Обьект
        People p = JsonHelper.fromJsonFile("src\\test\\resources\\stas.json",People.class); // преобразование файла в Обьект
        System.out.println(c);
        System.out.println(p);

        System.out.println(JsonHelper.toJson(c));
        System.out.println(JsonHelper.toJson(p));
    }

    //new Test Lombok
    @Test
    public void testLombok() {

        Cat cat2 = new Cat("Myrsik","Russ");
        Cat c = new Cat("barsik1","Egipet");
        Cat cat = new Cat();
        Cat cat3 = Cat.builder()
                .name("Boris").type("Latvia")
                .build();
        Cat cat4 = Cat.builder()
                .name("Boris")
                .build();

        cat.setName("kot");
        cat.setType("Egipet2");
        System.out.println(c);
        System.out.println(cat);
        System.out.println(cat2);
        System.out.println(cat3);
        System.out.println(cat4);
        System.out.println(cat3.equals(cat4));

    }

    //new Test Lombok дополнительные класс Dog
    @Test
    public void testLombokBulder() {

        Dog dog = Dog.builder()
                .age(5)
                .name("Barsgik")
                .isWhite(true)
                .model("Russian").build();

        System.out.println(dog);

    }
}
