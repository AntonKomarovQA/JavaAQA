package Practika2_0.fabricaDog;

import java.util.Random;

//случайное создание Собак Лайку
public class DogFactoryLaika implements BaseDogFactory{
        Random random = new Random();
        @Override
    public String getRandomName() {
        String [] name  = {"Djo", "Gav", "Ini", "Irl"};
        return name[random.nextInt(name.length)];
    }

    @Override
    public int getRandomAge() {
        return random.nextInt(12);
    }

    @Override
    public String getRandomColor() {
        String [] color  = {"red", "black", "yellow", "blue", "green","white"};
        return color[random.nextInt(color.length)];
    }
    }

