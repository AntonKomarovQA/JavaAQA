package Practika2_0;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import java.util.stream.Collectors;

public class TestDog {
    private static Random random = new Random();

    public static void main(String[] args) {
        List<Dogs> dogs = new ArrayList<>();
        // Создание и добавление 10 случайных объектов Dog в список
        for (int i = 0; i < 30; i++) {
            dogs.add(Dogs.getRandom());
        }
        final int dayYear = 365;
        final int dayNedela = 7;

        // в течении 1 года выбирается случайная собака и выполняется случайное действие
        for (int day = 1; day < dayYear; day++) {
            if (day % dayNedela == 0) {
                Dogs randomDog = dogs.get(random.nextInt(dogs.size()));
                    Dogs.selectRandom((Deistvia) randomDog);
                }

            // Каждый 30 день пополняется 1 собака
            if (day % 30 == 0) {
                dogs.add(Dogs.getRandom());
            }
        }

        // view ListDogs
        for (Dogs dogs1 : dogs) {
            System.out.println(dogs1);
        }

        System.out.println(dogs.size());

        // Подсчет количества разных типов собак
        Map<String,Long> dogsLongMap = dogs.stream()
                .collect(Collectors.groupingBy(Dogs::getType, Collectors.counting()));
        // Вывод результатов
        for (Map.Entry<String, Long> entry: dogsLongMap.entrySet()){
            System.out.println("Порода собак: "+ entry.getKey()+ " :кол-во "+entry.getValue());
        }
    }


}