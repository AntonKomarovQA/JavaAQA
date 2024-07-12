package Practika2_0.models;

import Practika2_0.active.Deistvia;

import java.util.Random;

public class Haski extends Dogs {

    //Конструктор Хаски
    public Haski(String name, int age, String color) {
        super(name, age, color,"Haski");
    }

//    //метод радости пса
//    @Override
//    public boolean dovolstvia(Random random) {
//        boolean happy = random.nextBoolean();
//        System.out.println("Haski dovolen "+ happy);
//        return happy;
//    }
//    //метод голоса пса
//    @Override
//    public void lay() {
//        System.out.println("Golos Haski");
//    }
//    //метод что песель отдыхает
//    @Override
//    public void relax() {
//        System.out.println("Haski relaks");
//    }
//
//    @Override
//    public void kus() {
//        System.out.println("Haski delaet kus");
//    }
//
//    // speedHaski
//    @Override
//    public int speeRun(int a) {
//        System.out.println("Skorost Haski " + random.nextInt(a+5));
//        return a;
//    }

}
