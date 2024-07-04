package Practika2_0;

import static Practika2_0.Deistvia.random;

/* Реализовать семейство псов, где будет 3 типа собак
    Изначально в семействе 30 собак
    Нужно сделать так что бы в течении 1 года выбиралась случайная собака и выполняла случайное действие
    Каждый 30 день в семействе должна пополняться 1 собака
    Нужно вывести на экран сколько псов было до и сколько стало после
    Использовать класс Random
 */
public abstract class Dogs implements Randomaizer {
    protected  String name;
    protected  int age;
    protected  String color;

    // Создаю конструктор с собаками
    Dogs(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

/*    //метод голоса
    abstract void golos();

    //метод получения случайного имени
    abstract String getRandomName(Random random);

    //метод получения случайного age
    abstract int getRandomAge();

    //метод получения случайного color
    abstract String getRandomColor(Random random);

    //метод собака довольна или нет
    public boolean dovolstvia;
*/
    @Override
    public String toString() {
        return "Dogs{" +
                "name= " + name + '\'' +
                " age= " + age +
                " color= " + color + '}';
    }

    // Метод для случайного действия
    public static void selectRandom(Deistvia dog) {
        int actionIndex = random.nextInt(6);

        switch (actionIndex) {
            case 0 -> dog.lay();
            case 1 -> dog.relax();
            case 2 -> dog.kus();
            case 3 -> dog.speeRun(random.nextInt(10));
            case 4 -> dog.dovolstvia(random);
        }
    }
    //Получение случайной собаки с Именем , возрастом , цветом
    public static Dogs getRandom() {
        Dogs tempDog = null;
        int randomNumber = random.nextInt(3); //генерирую случайную собаку
        switch (randomNumber) {
            case 0 -> {
                Haski haski = new Haski("", 0, ""); // создаю пустой обьект(собаки)
                String name = haski.getRandomName(random);
                int age = haski.getRandomAge();
                String color = haski.getRandomColor(random);
                tempDog = new Haski(name, age, color);
            }
            case 1 -> {
                Korgi korg = new Korgi("", 0, "");
                String nameKorgi = korg.getRandomName(random);
                int ageKorgi = korg.getRandomAge();
                String colorKorig = korg.getRandomColor(random);
                tempDog = new Korgi(nameKorgi, ageKorgi, colorKorig);
            }
            case 2 -> {
                Laika laika = new Laika("", 0, "");
                String namelaika = laika.getRandomName(random);
                int ageLaika = laika.getRandomAge();
                String colorLaika = laika.getRandomColor(random);
                tempDog = new Laika(namelaika, ageLaika, colorLaika);
            }
        }
        return tempDog;
    }

    public abstract String getType() ;
}
