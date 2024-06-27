package Java;

public class CarWithEnum {
    private String carName;
    private TypeCar type;
    private int doorCount;
    private String color;

    public CarWithEnum(String carName, TypeCar type, int doorCount, String color) {
        this.carName = carName;
        this.type = type;
        this.doorCount = doorCount;
        this.color = color;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public TypeCar getType() {
        return type;
    }

    public void setType(TypeCar type) {
        this.type = type;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
