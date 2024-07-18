package Practika2_0.fabricaDog;

import Practika2_0.models.Dogs;
import Practika2_0.models.Laika;

import java.util.Random;

//случайное создание Собак Лайку
public class DogFactoryLaika extends BaseDogFactory {
    Random random = new Random();

    // создание новой случайно собаки
    @Override
    public Dogs getInstanse() {
        return new Laika(getRandomName(),getRandomAge(),getRandomColor());
    }

    @Override
    protected String getRandomName() {
        String[] name = {"Djo", "Gav", "Ini", "Irl"};
        return name[random.nextInt(name.length)];
    }

    @Override
    protected int getRandomAge() {
        return random.nextInt(12);
    }

    @Override
    protected String getRandomColor() {
        String[] color = {"red", "black", "yellow", "blue", "green", "white"};
        return color[random.nextInt(color.length)];
    }
}

