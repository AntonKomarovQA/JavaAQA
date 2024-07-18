package Practika2_0.models;



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
    public String toString() {
        return "Korgi" +
                " name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", color='" + getColor() + '\'' +
                ", type='" + getType() + '\'' +
                '}';
    }
    @Override
    public void speeRun(int a) {
        System.out.println("Skorost " +getType());
    }
}
