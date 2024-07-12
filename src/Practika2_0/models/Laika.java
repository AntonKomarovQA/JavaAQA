package Practika2_0.models;

import java.util.Random;

public class Laika extends Dogs {
    //Конструктор Корги
    public Laika(String name, int age, String color) {
        super(name, age, color,"Laika");
    }

//    @Override
//    public boolean dovolstvia(Random random) {
//        boolean happy = random.nextBoolean();
//        System.out.println("Laika dovolen "+ happy);
//        return happy;
//    }
//
//    @Override
//    public void lay() {
//        System.out.println("Golos Laika");
//    }
//
//    @Override
//    public void relax() {
//        System.out.println("Golos Laika");
//    }
//
//    @Override
//    public void kus() {
//        System.out.println("Golos Laika");
//    }
//
//    @Override
//    public int speeRun(int a) {
//        System.out.println("Skorost Laika " + random.nextInt(a+5));
//        return a;
//    }
}
