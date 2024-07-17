package Practika2_0.models;

import Practika2_0.active.Deistvia;

import java.util.Random;

public class Haski extends Dogs implements Deistvia {

    //Конструктор Хаски
    public Haski(String name, int age, String color) {
        super(name, age, color,"Haski");
    }

    @Override
    public void dovolstvia() {
        System.out.println(getType()+" dovolen");
    }

    @Override
    public void lay() {
        System.out.println(getType()+" golos");
    }

    @Override
    public void relax() {
        System.out.println(getType()+" is relaxing");
    }

    @Override
    public void kus() {
        System.out.println(getName()+" is bitting");
    }

    @Override
    public void speeRun(int a) {
        System.out.println(getName()+ " running at "+ a);
    }
}
