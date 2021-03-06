package lesson8;

public abstract class Animal {

    private String name;
    private int age;
    private boolean sex; // true - male, false - female

    public Animal(String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void changeName(String newName) {
        this.name = newName;
    }

    public void changeSex() {
        this.sex = !sex;
    }

    public void beOlder() {
        this.age++;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex ? "Самец" : "Самка";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + getSex() +
                '}';
    }
}
