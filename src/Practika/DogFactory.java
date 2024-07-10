package Practika;

import java.util.Random;

//генерация cлучайных собак
public class DogFactory {
    private final Random random = new Random();

    public Dog newInstanceDog() {
        String name = getRandomName();
        int age = getRandomAge();
        DogType type = getRandonType();
        return new Dog(name, age, type);
    }

    // Метод для получения случайного name собаки
    private String getRandomName() {
        String[] types = {"Bob", "Lak", "Kes", "Buch", "Ice"};
        return types[random.nextInt(types.length)];
    }

    // Метод для получения случайного age
    private int getRandomAge() {
        return random.nextInt(12);
    }

    // Метод для получения случайного типа собаки
    private DogType getRandonType() {
        String[] types = {"LAIKA", "PITBUL", "HASKI", "KORGI"};
        return DogType.valueOf(types[random.nextInt(types.length)]);
    }
}
