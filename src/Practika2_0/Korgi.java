package Practika2_0;

import java.util.Random;

public class Korgi extends Dogs implements Deistvia{

    Korgi(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public String getType() {
        return "Korgi";
    }

    //получение имени
    @Override
    public String getRandomName(Random random) {
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
    public String getRandomColor(Random random) {
        String [] color  = {"yellow", "white"};
        return color[random.nextInt(color.length)];
    }


    @Override
    public boolean dovolstvia(Random random) {
        boolean happy = random.nextBoolean();
        System.out.println("Korgi dovolen "+ happy);
        return happy;
    }

    @Override
    public void lay() {
        System.out.println("Golos Korgi");
    }

    @Override
    public void relax() {
        System.out.println("Golos Korgi");
    }

    @Override
    public void kus() {
        System.out.println("Golos Korgi");
    }

    @Override
    public int speeRun(int a) {
        System.out.println("Skorost Korgi " + random.nextInt(a+5));
        return a;
    }
}
