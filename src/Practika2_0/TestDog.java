package Practika2_0;


import Practika.DogFactory;
import Practika2_0.active.Deistvia;
import Practika2_0.active.RandomActive;
import Practika2_0.fabricaDog.DogFactoryHaski;
import Practika2_0.fabricaDog.DogFactoryKorgi;
import Practika2_0.fabricaDog.DogFactoryLaika;
import Practika2_0.fabricaDog.RandomNewDog;
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
        DogFactoryHaski dogFHaski = new DogFactoryHaski();
        DogFactoryKorgi dogFKorgi = new DogFactoryKorgi();
        DogFactoryLaika dogfLaika = new DogFactoryLaika();

        for (int i = 0; i < 30; i++) {
            int randomNumber = random.nextInt(3);
            switch (randomNumber){
                case 0 -> dogs.add(RandomNewDog.getRandom(dogFHaski));
                case 1 -> dogs.add(RandomNewDog.getRandom(dogFKorgi));
                case 2 -> dogs.add(RandomNewDog.getRandom(dogfLaika));
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
        //Вывод результатов
        for (Map.Entry<String, Long> entry: dogsLongMap.entrySet()){
            System.out.println("Порода собак: "+ entry.getKey()+ " : кол-во "+entry.getValue());
        }

        RandomActive.performRandom(dogs);
    }
}