package Java;

public class StreamClaasExample {
    public static void main(String[] args) {
        CarWithEnum bmw = new CarWithEnum("BMW x5",TypeCar.CROSSOVER,4,"Red");
        CarWithEnum bmw1 = new CarWithEnum("BMW x5",TypeCar.CROSSOVER,4,"Red");
        CarWithEnum bmw2 = new CarWithEnum("BMW x5",TypeCar.CROSSOVER,4,"Red");
        if (bmw.getType().equals(TypeCar.SEDAN)){
            System.out.println("Не седан");
        }else {
            System.out.println("Cedan");
        }
    }

}
