package Practika2_0.fabricaDog;

import java.util.Random;

//случайное создание Собаки Хаски
public class DogFactoryHaski implements BaseDogFactory{
        Random random = new Random();

       //переопределение метода getRandomName изBaseDogFactory и назначение и выбор случайного имени
        @Override
        public String getRandomName() {
            String [] name  = {"Bob", "Lak", "Kes", "Buch", "Ice"};
            return name[random.nextInt(name.length)];
        }
       //переопределение метода getRandomName изBaseDogFactory и назначение случайного возраста
        @Override
        public int getRandomAge() {
            return random.nextInt(12);
        }

        @Override
        public String getRandomColor() {
            String [] color  = {"blackH", "blueH", "whiteH"};
            return color[random.nextInt(color.length)];
        }

    }

