package lesson8;

public class Cat extends Animal {

    public Cat(String name, int age, boolean sex) {
        super(name, age, sex);
    }

    public void sleepAlways() {
        System.out.println("Кошка может спать всегда");
    }
}
