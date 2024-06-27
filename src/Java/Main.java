package Java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

//        Car car = new Car("Nissan",40);
//        Car car2 = new Car("Nissan",40);
//        boolean isSame = car.equals(car2);

//        boolean isModelSame = car.getName().equals(car2.getName());
//        System.out.println(isSame);
//        System.out.println(isModelSame);

        Set<String> names = new HashSet<>();
        names.add("Lada");
        names.add("Lada110");
        names.add("Lada 6");
        names.add("Lada 7 ");
        for (String name : names) {
            if (name.equals("Lada 7 ")){
                System.out.println("Найден верный элемент");
            }
        }
        System.out.println(names);

        List<Car> cars = Car.getCarName() ;
        List<Car> carNewList = new ArrayList<>();
        for (Car c : cars){
            if (c.getFuel()>15){
                carNewList.add(c);
            }
        }
        System.out.println(carNewList);
    }
}