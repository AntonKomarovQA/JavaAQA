package Practika2_0.fabricaDog;

import Practika2_0.models.Dogs;

import java.util.Random;

public abstract class  BaseDogFactory {

    public abstract Dogs getInstanse();

    //public abstract Dogs getInstance();
    protected abstract String getRandomName(); // cлучайное имя
    protected abstract int getRandomAge(); // cлучайное возраст
    protected abstract String getRandomColor(); // cлучайный цвет


}
