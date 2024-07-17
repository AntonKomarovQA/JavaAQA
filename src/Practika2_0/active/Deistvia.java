package Practika2_0.active;

import java.util.Random;

// интерфейс с действиями
public interface Deistvia {
    Random random = new Random();
    //Довольная собака или нет
     void dovolstvia();
    //Все собаки издают голос
     void lay();
    //Собаки отдыхают
     void relax();
    //Собаки делают кусь
     void kus();
    //Каждая собака бежит с разной скоростью
     void speeRun(int a) ;

     // Метод для случайного действия
     static void selectRandom(Deistvia dog) {
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
