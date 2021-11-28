package lesson7;

public class HumanRanner {

    public static void main(String[] args) {
        Human me = new Human();
        me.name = "Alex";
        me.surname = "Dem";
        me.age = 37;
        me.height = 174;
        me.weight = 80;
        me.hasQrCode = true;

        Human nataliaIvanovna = new Human();
        nataliaIvanovna.name = "Natalia";
        nataliaIvanovna.surname = "Ivanova";
        nataliaIvanovna.age = 25;
        nataliaIvanovna.height = 165;
        nataliaIvanovna.weight = 55;
        nataliaIvanovna.hasQrCode = false;

        Human incognito = new Human("Unknown", "Unknown", -1, -1, -1, null);

        Human vasyaPupkin = new Human("Vasya", "Pupkin", 50);

        System.out.println(me == vasyaPupkin);
        System.out.println(me == me);

        Human[] humans = new Human[] {me, vasyaPupkin, incognito, nataliaIvanovna};
        for (Human human: humans){
            if (50 == human.age){
                System.out.println("Человек с именем " + human.name + " и фамилия " + human.surname + " имеет возраст 50.");
            }
        }

        me.beOlder();
        System.out.println("Мне на следующий год исполнится " + me.getAge());

        me.setName("Ivan");
        System.out.println("Теперь тебя зовут " + me.getName());
    }
}
