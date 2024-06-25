package Java;

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
}
