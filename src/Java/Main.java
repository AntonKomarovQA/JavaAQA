package Java;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Nissan",40);
        Car car2 = new Car("Nissan",40);
        boolean isSame = car.equals(car2);

        boolean isModelSame = car.getName().equals(car2.getName());
        System.out.println(isSame);
        System.out.println(isModelSame);

    }
}