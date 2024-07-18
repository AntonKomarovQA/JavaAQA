package Practika2_0.models;



public class Laika extends Dogs implements Deistvia {
    //Конструктор Корги
    public Laika(String name, int age, String color) {
        super(name, age, color,"Laika");
    }

    @Override
    public void dovolstvia() {
        System.out.println(getType()+ " dovolen ");

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
        return "Laika" +
                " name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", color='" + getColor() + '\'' +
                ", type='" + getType() + '\'' +
                '}';
    }
    @Override
    public void speeRun(int a) {
        System.out.println("Skorost "+getType() );
    }
}
