package Practika2_0.fabricaDog;

import java.util.Random;

//случайное создание Собаки Корги
public class DogFactoryKorgi implements BaseDogFactory{
        Random random = new Random();
    //получение имени
    @Override
    public String getRandomName() {
        String [] name  = {"Bandi", "Ted", "Rich", "Pux"};
        return name[random.nextInt(name.length)];
    }
    //получение возраста
    @Override
    public int getRandomAge() {
        return random.nextInt(12);
    }
    //получение цвета
    @Override
    public String getRandomColor() {
        String [] color  = {"yellow", "white"};
        return color[random.nextInt(color.length)];
    }
    }

