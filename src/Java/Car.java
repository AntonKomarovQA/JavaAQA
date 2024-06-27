package Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car {
    String name;
    int fuel;

    public Car(String name , int fuel){
        this.name = name;
        this.fuel = fuel;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return fuel == car.fuel && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, fuel);
    }

    public static List<Car> getCarName(){
        List<Car> cars = new ArrayList<Car>(){{
            add(new Car("Tesla",0));
            add(new Car("BMW",10));
            add(new Car("Exeed",30));
            add(new Car("LADA",50));
        }};
        return cars;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", fuel=" + fuel +
                '}';
    }
}
