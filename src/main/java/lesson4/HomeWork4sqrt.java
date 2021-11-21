package lesson4;

public class HomeWork4sqrt {

    public static void main(String[] args) {
        int number = 25;
        if (number < 0) {
            System.out.println("Число " + number + " отрицательное! Введите положительное число.");
        } else {
            System.out.println("Квадратный корень числа " + number + " = " + sqrt(number));
        }
    }

    public static int sqrt(int value) {
        int resalt;
        for (int i = value; i > 0; i--) {
            resalt = (i * i);
            if (resalt == value) {
                return i;
            }
        }
        return value;
    }
}
