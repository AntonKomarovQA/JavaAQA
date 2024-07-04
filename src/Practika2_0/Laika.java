package Practika2_0;

import java.util.Random;

public class Laika extends Dogs implements Deistvia{
    Laika(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public String getType() {
        return "Laika";
    }


    @Override
    public boolean dovolstvia(Random random) {
        boolean happy = random.nextBoolean();
        System.out.println("Laika dovolen "+ happy);
        return happy;
    }

    @Override
    public void lay() {
        System.out.println("Golos Laika");
    }

    @Override
    public void relax() {
        System.out.println("Golos Laika");
    }

    @Override
    public void kus() {
        System.out.println("Golos Laika");
    }

    @Override
    public int speeRun(int a) {
        System.out.println("Skorost Laika " + random.nextInt(a+5));
        return a;
    }


    @Override
    public String getRandomName(Random random) {
        String [] name  = {"Djo", "Gav", "Ini", "Irl"};
        return name[random.nextInt(name.length)];
    }

    @Override
    public int getRandomAge() {
        return random.nextInt(12);
    }

    @Override
    public String getRandomColor(Random random) {
        String [] color  = {"red", "black", "yellow", "blue", "green","white"};
        return color[random.nextInt(color.length)];
    }


}
