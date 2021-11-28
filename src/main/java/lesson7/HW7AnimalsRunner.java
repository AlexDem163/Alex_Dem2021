package lesson7;

import java.util.Scanner;

public class HW7AnimalsRunner {

    public static void main(String[] args) {
        Dogs bobik = new Dogs("Bobik", 4, 500, 200);

        Dogs sharik = new Dogs("Sharik", 2, 300, 500);

        Dogs gav = new Dogs();
        gav.name = "Gav";
        gav.age = 6;
        gav.run = 200;
        gav.swim = 150;

        Cats kyzya = new Cats();
        kyzya.setName("Kyzya");
        kyzya.setAge(2);
        kyzya.setRun(300);
        kyzya.setSwim(50);

        Cats bandit = new Cats("bandit", 3, 200, 30);

        Cats kiti = new Cats("Kiti", 5, 100, 10);

        Beavers1 chroom = new Beavers1("Chroom", 3, 200, 600);
        Beavers1 rio = new Beavers1("Rio", 2, 150, 400);
        Beavers1 horoHoro = new Beavers1("HoroHoro", 3, 400, 800);

    }

    public static void runSwim(int run) {
        System.out.println("Введите длину участка по земле, целое число!");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("Ожидается целое число. Повторите попытку!");
            scanner.next();
        }
        int index = scanner.nextInt();
        System.out.println("Препятствие по суше" + index);
    }
}
