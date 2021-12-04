package lesson8;

public class Dog extends Animal {

    public Dog(String name, int age, boolean sex) {
        super(name, age, sex);
    }

    public void likesToPlay() {
        System.out.println("Собака любит играть!");
    }
}
