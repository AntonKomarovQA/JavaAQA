package Practika2_0.models;

import Practika2_0.active.Deistvia;

import java.util.Random;

public class Korgi extends Dogs implements Deistvia {

    //Конструктор Корги
    public Korgi(String name, int age, String color) {
        super(name, age, color,"Korgi");
    }

    @Override
    public void dovolstvia() {

    }

    @Override
    public void lay() {
        System.out.println("Golos "+getType());
    }

    @Override
    public void relax() {
        System.out.println("Golos "+getType());
    }

    @Override
    public void kus() {
        System.out.println("Golos "+getType());
    }

    @Override
    public void speeRun(int a) {
        System.out.println("Skorost " +getType() + random.nextInt(a+5));
    }
}
