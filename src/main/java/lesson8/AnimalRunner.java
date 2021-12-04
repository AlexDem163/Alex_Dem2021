package lesson8;

public class AnimalRunner {

    public static void main(String[] args) {
        Animal boosinka = new Cat("Бусинка", 5, false);
        Dog shram = new Dog("Шрам", 3, true);
        boosinka.beOlder();
        shram.changeName("Персик");
        boosinka.changeName("Сибун");
        boosinka.setAge(4);
        boosinka.changeSex();
        System.out.println(boosinka);
        System.out.println(shram);
        Animal[] beast = new Animal[]{boosinka, shram};
        for (Animal animal : beast) {
            animal.setAge(5);
        }
        System.out.println("--------");
        System.out.println(boosinka);
        System.out.println(shram);
        System.out.println("--------");
        ((Cat) boosinka).sleepAlways();
        shram.likesToPlay();
    }
}
