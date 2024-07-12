package Practika2_0.models;

import java.util.Random;

public class Korgi extends Dogs {

    //Конструктор Корги
    public Korgi(String name, int age, String color) {
        super(name, age, color,"Korgi");
    }

//    @Override
//    public boolean dovolstvia(Random random) {
//        boolean happy = random.nextBoolean();
//        System.out.println("Korgi dovolen "+ happy);
//        return happy;
//    }
//
//    @Override
//    public void lay() {
//        System.out.println("Golos Korgi");
//    }
//
//    @Override
//    public void relax() {
//        System.out.println("Golos Korgi");
//    }
//
//    @Override
//    public void kus() {
//        System.out.println("Golos Korgi");
//    }
//
//    @Override
//    public int speeRun(int a) {
//        System.out.println("Skorost Korgi " + random.nextInt(a+5));
//        return a;
//    }
}
