package Practika;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        Random random = new Random();

        // Создание и добавление 5 случайных объектов Dog в список
        for (int i =0; i<5; i++){
            String name = Dog.getRandomName(random); // случайное имя
            int age = random.nextInt(10);
            DogType type = Dog.getRandonType(random); // случайный тип
            dogs.add(new Dog(name,age,type));
        }
        // Вывод содержимого списка
        for (Dog dog : dogs){
            System.out.println(dog);
        }


        final int dayYear = 365;
        // в течении 1 года выбирается случайная собака и выполняется случайное действие
        for (int day = 1; day<dayYear; day++){
            if (day % 7 ==0){
                Dog selectDog = dogs.get(random.nextInt(dogs.size()));
                Dog.selectRandom();

            }
        }
    }

}
