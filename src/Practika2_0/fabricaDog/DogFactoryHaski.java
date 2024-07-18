package Practika2_0.fabricaDog;

import Practika2_0.models.Dogs;
import Practika2_0.models.Haski;

import java.util.Random;

//случайное создание Собаки Хаски
public class DogFactoryHaski extends BaseDogFactory {
    Random random = new Random();

    @Override
    public Dogs getInstanse() {
        return new Haski(getRandomName(),getRandomAge(),getRandomColor());
    }

    //переопределение метода getRandomName изBaseDogFactory и назначение и выбор случайного имени
    @Override
    protected String getRandomName() {
        String[] name = {"Bob", "Lak", "Kes", "Buch", "Ice"};
        return name[random.nextInt(name.length)];
    }

    //переопределение метода getRandomName изBaseDogFactory и назначение случайного возраста
    @Override
    protected int getRandomAge() {
        return random.nextInt(12);
    }

    @Override
    protected String getRandomColor() {
        String[] color = {"blackH", "blueH", "whiteH"};
        return color[random.nextInt(color.length)];
    }

}

