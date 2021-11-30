package lesson8;

public class Dag extends Animal{

    public Dag(String name, int age, boolean sex) {
        super(name, age, sex);
    }

    public void likesToPlay() {
        System.out.println("Собака любит играть!");
    }
}
