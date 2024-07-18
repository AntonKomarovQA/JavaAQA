package Practika2_0.models;

/* Реализовать семейство псов, где будет 3 типа собак
    Изначально в семействе 30 собак
    Нужно сделать так что бы в течении 1 года выбиралась случайная собака и выполняла случайное действие
    Каждый 30 день в семействе должна пополняться 1 собака
    Нужно вывести на экран сколько псов было до и сколько стало после
    Использовать класс Random
 */

public abstract class Dogs implements Deistvia  {
    private   String name;
    private  int age;
    private  String color;
    private  String type;

    // Создаю конструктор с собаками
    Dogs(String name, int age, String color,String type){
        this.name = name;
        this.age = age;
        this.color = color;
        this.type = type;
    }
    // Создаю конструктор дефолтный
    public Dogs() {
    }
    // Корректный вывод в консоли

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }
    public String getType() {
        return type ;
    }
}
