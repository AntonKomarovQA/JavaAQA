package Practika2_0.fabricaDog;

import Practika2_0.models.Dogs;
import Practika2_0.models.Haski;
import Practika2_0.models.Korgi;
import Practika2_0.models.Laika;

import static Practika2_0.active.Deistvia.random;

public interface RandomNewDog {
    //Создание случайной собаки с Именем , возрастом , цветом
    static Dogs getRandom(BaseDogFactory factory) {
        String name = factory.getRandomName();
        int age = factory.getRandomAge();
        String color = factory.getRandomColor();
        int randomNumber = random.nextInt(3); //генерирую случайную собаку
        switch (randomNumber) {
            case 0 -> {
                return new Haski(name, age, color);
            }
            case 1 -> {
                return new Korgi(name, age, color);
            }
            case 2 -> {
                return new Laika(name, age, color);
            }
            default -> {
                return null; // Это на случай, если randomNumber не в диапазоне 0-2
            }
        }
    }
}



