package Practika;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dog {
    private String name;
    private int age;
    private DogType type;

    static void lay(){
        System.out.println("Gav Gav");
    }
    static void relax(){
        System.out.println("Spit");
    }
    static void kus(){
        System.out.println("Kusaet");
    }
    static void run(){
        System.out.println("Beg");
    }
    static void rip(){
        List<Dog> dogs = new ArrayList<>();
        dogs.remove(dogs);
        System.out.println("ymer pes");
    }
    static void comeDog(){
        System.out.println("pes +");
    }

    public Dog(String name, int age, DogType type) {
        this.name = name;
        this.age = age;
        this.type = type;

    }

     @Override
     public String toString() {
         return "Dog " + "name= " + name + ", age= " + age +
                 ", type= " + type  ;
     }

    // Метод для получения случайного name собаки
    protected static String getRandomName(Random random){
        String[] types = { "Bob", "Lak", "Kes","Buch","Ice"};
        return types[random.nextInt(types.length)];
    }
    // Метод для получения случайного типа собаки
    protected static DogType getRandonType(Random random){
        String[] types = { "LAIKA", "PITBUL", "HASKI", "KORGI"};
        return DogType.valueOf(types[random.nextInt(types.length)]);
    }

    static void selectRandom(List<Dog> dog){
        Random random = new Random();
        int actionIndex = random.nextInt(6);

        switch (actionIndex){
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
                Dog.rip();
                dog.remove(dog);
                break;
                case 5:
                Dog.comeDog();
                break;
        }
    }


 }
