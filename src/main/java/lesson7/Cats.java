package lesson7;

public class Cats {
    String name; // null
    int age; // 0
    int run; // 0
    int swim; // 0

    public Cats() {
    }

    public Cats(String name, int age, int run, int swim) {
        this.name = name;
        this.age = age;
        this.run = run;
        this.swim = swim;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRun() {
        return run;
    }

    public int getSwim() {
        return swim;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }
}
