package Practika2_0;

import java.util.Random;

public class Haski extends Dogs implements Deistvia {

    //Конструктор Хаски
    Haski(String name, int age, String color) {
        super(name, age, color);
    }

    //метод радости пса
    @Override
    public boolean dovolstvia(Random random) {
        boolean happy = random.nextBoolean();
        System.out.println("Haski dovolen "+ happy);
        return happy;
    }
    //метод голоса пса
    @Override
    public void lay() {
        System.out.println("Golos Haski");
    }
    //метод что песель отдыхает
    @Override
    public void relax() {
        System.out.println("Haski relaks");
    }

    @Override
    public void kus() {
        System.out.println("Haski delaet kus");
    }

    // speedHaski
    @Override
    public int speeRun(int a) {
        System.out.println("Skorost Haski " + random.nextInt(a+5));
        return a;
    }



    @Override
    public int getRandomAge() {
        return random.nextInt(12);
    }

    @Override
    public String getRandomName(Random random) {
        String [] name  = {"Bob", "Lak", "Kes", "Buch", "Ice"};
        return name[random.nextInt(name.length)];
    }

    @Override
    public String getRandomColor(Random random) {
        String [] color  = {"blackH", "blueH", "whiteH"};
        return color[random.nextInt(color.length)];
    }

    @Override
    public String getType() {
        return "Haski";
    }
}
