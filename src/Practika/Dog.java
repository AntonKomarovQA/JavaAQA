package Practika;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dog {
    private String name;
    private int age;
    private DogType type;

    static void lay() {
        System.out.println("Gav Gav");
    }

    static void relax() {
        System.out.println("Spit");
    }

    static void kus() {
        System.out.println("Kusaet");
    }

    static void run() {
        System.out.println("Beg");
    }

    //Собака убивается
    static void rip(List<Dog> dog, Dog dogs) {
        dog.remove(dogs);
        System.out.println("Ymer pes" + " Осталось собак " + dog.size());
    }

    //Пополнение собак на одну
    static void comeDog(List<Dog> dog) {
        Random random = new Random();
        dog.add(new Dog((getRandomName(random)), getRandomAge(random), getRandonType(random)));
        System.out.println("Pes + " +"Пополнение в стае собак "+dog.size());
    }

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

    // Метод для получения случайного name собаки
    protected static String getRandomName(Random random) {
        String[] types = {"Bob", "Lak", "Kes", "Buch", "Ice"};
        return types[random.nextInt(types.length)];
    }

    // Метод для получения случайного age
    protected static int getRandomAge(Random random) {
        return random.nextInt(12);
    }

    // Метод для получения случайного типа собаки
    protected static DogType getRandonType(Random random) {
        String[] types = {"LAIKA", "PITBUL", "HASKI", "KORGI"};
        return DogType.valueOf(types[random.nextInt(types.length)]);
    }

    // Метод для случайного действия
    static void selectRandom(List<Dog> dog) {
        Random random = new Random();
        int actionIndex = random.nextInt(6);

        switch (actionIndex) {
            case 0:
                Dog.lay();
                break;
            case 1:
                Dog.relax();
                break;
            case 2:
                Dog.kus();
                break;
            case 3:
                Dog.run();
                break;
            case 4:
                Dog.rip(dog, dog.get(random.nextInt(dog.size())));
                break;
            case 5:
                Dog.comeDog(dog);
                break;
        }
    }
}
