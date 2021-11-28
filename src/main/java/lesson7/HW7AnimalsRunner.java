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

        Dogs[] dogss = new Dogs[]{bobik, sharik, gav};
        for (Dogs dogs : dogss) {
            if (300 <= dogs.run) {
                System.out.println("Собака " + dogs.name + " пробежит 300");
                if (300 <= dogs.swim) {
                    System.out.println("Собака " + dogs.name + " проплывет 300");
                }
            }
        }

        Cats[] catss = new Cats[]{kyzya, kiti, bandit};
        for (Cats cats : catss) {
            if (300 <= cats.run) {
                System.out.println("Кошка " + cats.name + " пробежит 300");
                if (300 <= cats.swim) {
                    System.out.println("Кошка " + cats.name + " проплывет 300");
                }
            }
        }

        Beavers1[] beavers1s = new Beavers1[]{chroom, rio, horoHoro};
        for (Beavers1 beaver : beavers1s) {
            if (300 <= beaver.run) {
                System.out.println("Бобр " + beaver.name + " пробежит 300");
                if (300 <= beaver.swim) {
                    System.out.println("Бобр " + beaver.name + " проплывет 300");
                }
            }
        }

    }
}

