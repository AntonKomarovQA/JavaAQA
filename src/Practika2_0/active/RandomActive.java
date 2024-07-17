package Practika2_0.active;

import Practika.Dog;
import Practika.DogFactory;
import Practika2_0.fabricaDog.DogFactoryHaski;
import Practika2_0.fabricaDog.RandomNewDog;
import Practika2_0.models.Dogs;

import java.util.List;
import java.util.Random;

//В данном интерфейсе случайно выполняется 1 действие каждые 7 дней и каждый 30 день случайная собака выполняет случайное действие
public interface RandomActive {
        final int dayYear = 365;
        final int dayNedela = 7;
        Random random = new Random();

        // в течении 1 года выбирается случайная собака и выполняется случайное действие
        static void performRandom(List<Dogs> dogs) {
                for (int day = 1; day <= dayYear; day++) {
                        if (day % dayNedela == 0) {
                                Dogs randomDog = dogs.get(random.nextInt(dogs.size()));
                                if (randomDog instanceof Deistvia){
                                Deistvia.selectRandom((Deistvia) randomDog);
                        }
                        }
                        // Каждый 30 день пополняется 1 собака
                        if (day % 30 == 0) {
                                DogFactoryHaski dogFactoryH = new DogFactoryHaski();
                                dogs.add(RandomNewDog.getRandom(dogFactoryH));
                        }
                }
        }
}