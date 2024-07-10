package Practika;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>(); // Создание пустого списка с собаками
        DogFactory dF = new DogFactory(); // Генерация случайных собак
        DogActivities dA = new DogActivities(); // Класс с активностями собак
        // Создание и добавление 30 случайных объектов Dog в список
        for (int i = 0; i <= 30; i++) {
            dogs.add(dF.newInstanceDog());
        }
        int colvoDog = dogs.size();
        dA.randomActivDog(dogs); // активные случайные действия

        // Подсчет количества разных типов собак
        Map<DogType, Long> dogTypesCount = dogs.stream()
                .collect(Collectors.groupingBy(Dog::getType, Collectors.counting()));

        // Вывод результатов
        for (Map.Entry<DogType, Long> entry : dogTypesCount.entrySet()) {
            System.out.println("Порода собак: " + entry.getKey() + ": кол-во " + entry.getValue());
        }

        System.out.println("Количество стаи собак в начале года " + colvoDog + " Спустя год " + dogs.size());
    }
}