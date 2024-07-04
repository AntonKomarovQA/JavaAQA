package Practika;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        Random random = new Random();

        // Создание и добавление 5 случайных объектов Dog в список
        for (int i = 0; i < 30; i++) {
            String name = Dog.getRandomName(random); // случайное имя
            int age = Dog.getRandomAge(random);// случайный age
            DogType type = Dog.getRandonType(random); // случайный тип
            dogs.add(new Dog(name, age, type));
        }
        int colvoDog = dogs.size();

        final int dayYear = 365;
        final int dayNedela = 7;

        // в течении 1 года выбирается случайная собака и выполняется случайное действие
        for (int day = 1; day < dayYear; day++) {
            if (day % dayNedela == 0) {
                if (dogs.isEmpty()) {
                    System.out.println("Все собаки умерли");
                    break;
                }
                Dog.selectRandom(dogs);
            }
            //Каждый 30 день пополняется 1 собака
            if (day % 30 == 0) {
                Dog.comeDog(dogs);
            }
        }


//        // Подсчет количества разных типов собак
        Map<DogType, Long> dogTypesCount = dogs.stream()
                .collect(Collectors.groupingBy(Dog::getType, Collectors.counting()));

//        // Вывод результатов
        for (Map.Entry<DogType, Long> entry : dogTypesCount.entrySet()) {
            System.out.println("Порода собак: "+ entry.getKey() + ": кол-во " + entry.getValue());
        }

        System.out.println("Количество стаи собак в начале года "+colvoDog + " Спустя год " + dogs.size());
    }
}
