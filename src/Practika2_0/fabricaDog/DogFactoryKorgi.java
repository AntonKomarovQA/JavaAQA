package Practika2_0.fabricaDog;

import Practika2_0.models.Dogs;
import Practika2_0.models.Korgi;

import java.util.Random;

//случайное создание Собаки Корги
public class DogFactoryKorgi extends BaseDogFactory {
    Random random = new Random();

    @Override
    public Dogs getInstanse() {
        return new Korgi(getRandomName(),getRandomAge(),getRandomColor());
    }

    //получение имени
    @Override
    protected String getRandomName() {
        String[] name = {"Bandi", "Ted", "Rich", "Pux"};
        return name[random.nextInt(name.length)];
    }

    //получение возраста
    @Override
    protected int getRandomAge() {
        return random.nextInt(12);
    }

    //получение цвета
    @Override
    protected String getRandomColor() {
        String[] color = {"yellow", "white"};
        return color[random.nextInt(color.length)];
    }
}

