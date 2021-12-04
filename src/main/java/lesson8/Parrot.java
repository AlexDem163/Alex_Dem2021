package lesson8;

public class Parrot extends Animal {

    public Parrot(String name, int age, boolean sex) {
        super(name, age, sex);
    }

    public void twoPaws() {
        System.out.println("У попугая две ноги и клюв");
    }
}
