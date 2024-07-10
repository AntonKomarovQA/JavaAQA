package Practika;

import java.util.List;
import java.util.Random;

//Активные действия собак
public class DogActivities {
    Random random = new Random();
    final int dayYear = 365;
    final int dayNedela = 7;
    private DogFactory df = new DogFactory(); // Создаем один экземпляр DogFactory

    //методы с активностями собак
    private static void lay(Dog dog) {
        System.out.println(dog.getType()+" "+dog.getName() + " Gav Gav");
    }

    //метод отдых
    private static void relax(Dog dog) {
        System.out.println(dog.getType() + " Spit");
    }

    //метод кус
    private static void kus() {
        System.out.println("Kusaet");
    }

    //метод бега
    private static void run(Dog dog) {
        System.out.println(dog.getName() + " Beg");
    }

    //метод смерти собаки
    private static void rip(Dog dogToRemove, List<Dog> allDog) {
        if (dogToRemove != null && allDog.contains(dogToRemove)) { // Проверка, что собака существует в списке
            allDog.remove(dogToRemove);// Удаление элемента по индексу
            System.out.println("Ymer pes " + dogToRemove.getName() + " typa " + dogToRemove.getType() + " Осталось собак " + allDog.size());
        } else {
            System.out.println("Неверный индекс для удаления");
        }
    }

    //метод Пополнения собак на одну
    private void comeDog(List<Dog> allDog) {
        // Создаем новый объект Dog с случайным типом
        Dog newDog = df.newInstanceDog();
        allDog.add(newDog);
        System.out.println(newDog.getType()+" name new dog " + newDog.getName()  + " Пополнение в стае собак " + +allDog.size());
    }

    // Метод для случайного действия
    private void selectRandom(Dog dog, List<Dog> allDog) {
        Random random = new Random();
        int actionIndex = random.nextInt(6);

        switch (actionIndex) {
            case 0:
                lay(dog);
                break;
            case 1:
                relax(dog);
                break;
            case 2:
                kus();
                break;
            case 3:
                run(dog);
                break;
            case 4:
                // Теперь мы должны передать индекс для удаления в метод rip
                int randomDathIndex = random.nextInt(allDog.size());
                Dog dogToRip = allDog.get(randomDathIndex);
                rip(dogToRip, allDog);
                break;
            case 5:
                comeDog(allDog);
                break;
        }
    }

    // в течении 1 года выбирается случайная собака и выполняется случайное действие
    public void randomActivDog(List<Dog> dogs) {
        for (int day = 1; day <= dayYear; day++) {
            if (day % dayNedela == 0) {
                if (dogs.isEmpty()) {
                    System.out.println("Все собаки умерли");
                    break;
                }
                int randomIndex = random.nextInt(dogs.size()); // Генерируем случайный индекс
                Dog selectDog = dogs.get(randomIndex); // Получаем случайную собаку по индексу
                selectRandom(selectDog, dogs); // Выполняем случайное действие для выбранной собаки
            }
//            //Каждый 30 день пополняется 1 собака
            if (day % 30 == 0) {
                comeDog(dogs);
            }
        }
    }
}