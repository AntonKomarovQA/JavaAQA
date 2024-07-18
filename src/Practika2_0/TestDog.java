package Practika2_0;


import Practika2_0.active.RandomActive;
import Practika2_0.active.RandomNewDog;
import Practika2_0.models.Dogs;

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
        RandomNewDog gen = new RandomNewDog();

        for (int i = 0; i < 30; i++) {
              dogs.add(gen.getRandomDog());
        }
        // view ListDogs
        for (Dogs dogs1 : dogs) {
            System.out.println(dogs1);
        }



        System.out.println(dogs.size());

        // Подсчет количества разных типов собак
        Map<String,Long> dogsLongMap = dogs.stream()
                .collect(Collectors.groupingBy(Dogs::getType, Collectors.counting()));
        //Вывод результатов
        for (Map.Entry<String, Long> entry: dogsLongMap.entrySet()){
            System.out.println("Порода собак: "+ entry.getKey()+ " : кол-во "+entry.getValue());
        }
        RandomActive rA = new RandomActive(gen);
        rA.performRandom(dogs);
    }
}