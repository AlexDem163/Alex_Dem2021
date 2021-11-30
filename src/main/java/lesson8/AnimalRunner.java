package lesson8;

public class AnimalRunner {

    public static void main(String[] args) {
        Animal boosinka = new Cat("Бусинка", 5, false);
        Dag shram = new Dag("Шрам", 3, true);
        boosinka.beOlder();
        shram.chengeName("Персик");
        boosinka.chengeName("Сибун");
        boosinka.setAge(4);
        boosinka.chengeSex();
        System.out.println(boosinka);
        System.out.println(shram);
        Animal[] beast = new Animal[] {boosinka, shram};
        for (Animal animal: beast){
            animal.setAge(5);
        }
        System.out.println("--------");
        System.out.println(boosinka);
        System.out.println(shram);
        System.out.println("--------");
        ((Cat)boosinka).sleepAlways();
        shram.likesToPlay();
    }
}
