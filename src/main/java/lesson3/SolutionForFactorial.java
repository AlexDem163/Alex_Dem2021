package lesson3;

public class SolutionForFactorial {

    public static void main(String[] args) {
        int number = -5;
        System.out.println("Факториал числа " + number + " = " + factorial(number));
        System.out.println("Факториал числа (второй способ) " + number + " = " + factorialByRecurs(number));
    }

    public static int factorial(int value) {
        int resalt = 1;
        if (value < 0){
            // что-то пошло не так при расчете
            return -1;
        } else if (value != 0) {
            for (int i = 1; i <= value; i++) {
                resalt *= i;
            }
        }
            return resalt;
    }

    public static int factorialByRecurs(int value) {
        if (value == 0) {
            return 1; // 0! = 1
        } else if (value <0) {
            return -1;
        } else {
            return value * factorialByRecurs(value - 1);
        }
    }
}
