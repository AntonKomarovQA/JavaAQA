package Practika2_0.active;

import Practika2_0.models.Deistvia;
import Practika2_0.models.Dogs;

import java.util.List;
import java.util.Random;

//В данном интерфейсе случайно выполняется 1 действие каждые 7 дней и каждый 30 день случайная собака выполняет случайное действие
public class RandomActive {
    final int dayYear = 365;
    final int dayNedela = 7;
    private final Random random = new Random();
    private final RandomNewDog gen;

    public RandomActive(RandomNewDog gen) {
        this.gen = gen;
    }

    // в течении 1 года выбирается случайная собака и выполняется случайное действие
    public void performRandom(List<Dogs> dogs) {
        for (int day = 1; day <= dayYear; day++) {
            if (day % dayNedela == 0) {
                Deistvia randomDog = dogs.get(random.nextInt(dogs.size()));
                selectRandom(randomDog);
            }
            // Каждый 30 день пополняется 1 собака
            if (day % 30 == 0) {
                dogs.add(gen.getRandomDog());
            }
        }
    }

    // Метод для случайного действия
    private static void selectRandom(Deistvia dog) {
        Random random = new Random();
        int actionIndex = random.nextInt(5);

        switch (actionIndex) {
            case 0 -> dog.lay();
            case 1 -> dog.relax();
            case 2 -> dog.kus();
            case 3 -> dog.speeRun(random.nextInt(10));
            case 4 -> dog.dovolstvia();
        }
    }
}