package Practika2_0.active;


import Practika2_0.fabricaDog.DogFactoryHaski;
import Practika2_0.fabricaDog.DogFactoryKorgi;
import Practika2_0.fabricaDog.DogFactoryLaika;
import Practika2_0.models.Dogs;
import java.util.Random;

public class RandomNewDog {
    private final Random random = new Random();
    private final DogFactoryHaski dogFHaski = new DogFactoryHaski();
    private final DogFactoryKorgi dogFKorgi = new DogFactoryKorgi();
    private final DogFactoryLaika dogfLaika = new DogFactoryLaika();

    //Создание случайной собаки с Именем , возрастом , цветом
    public Dogs getRandomDog() {
        int randomNumber = random.nextInt(3); //генерирую случайную собаку
        switch (randomNumber) {
            case 0 -> {
                return dogFHaski.getInstanse();
            }
            case 1 -> {
                return dogFKorgi.getInstanse();
            }
            case 2 -> {
                return dogfLaika.getInstanse();
            }
            default -> {
                return null; // Это на случай, если randomNumber не в диапазоне 0-2
            }
        }
    }
}



