package Practika;

/* Реализовать семейство псов, где будет 3 типа собак
    Изначально в семействе 30 собак
    Нужно сделать так что бы в течении 1 года выбиралась случайная собака и выполняла случайное действие
    Каждый 30 день в семействе должна пополняться 1 собака
    Нужно вывести на экран сколько псов было до и сколько стало после
    Использовать класс Random
 */

public class Dog {
    private String name;
    private final int age;
    private final DogType type;

    public Dog(String name, int age, DogType type) {
        this.name = name;
        this.age = age;
        this.type = type;

    }

    @Override
    public String toString() {
        return "Dog " + "name= " + name + ", age= " + age +
                ", type= " + type;
    }

    public String getName() {
        return name;
    }

    public DogType getType() {
        return type;
    }

}
