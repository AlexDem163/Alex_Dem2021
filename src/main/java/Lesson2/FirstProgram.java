package Lesson2;

public class FirstProgram {

    public static void main(String[] args) {

        int itog = summa(3, 5);
        System.out.println("Результат суммы чисел: " + itog);
        long otherItog = summa(8, 45);
        System.out.println("Результат другой суммы чисел: " + otherItog);

        long minusItog = minus(45, 10);
        System.out.println("Результат разности чисел: " + minusItog);

        double resaltVolume = sphereVolume(3);
        System.out.println("Объем сферы: " + resaltVolume);

    }

    /**
     * Метод будет складываь два аргумента и возвращать результат
     *
     * @param arg1 первй аргумент
     * @param arg2 второй аргумент
     * @return результат сложения 2-х чисел
     */
    public static int summa(int arg1, int arg2) {
        int result = arg1 + arg2;
        // это однострочный коментарий
        /* это многострочный коментарий,
        его нужно открыть и закрыть */
        return result;
    }

    public static int minus(int arg1, int arg2) {
        return arg1 - arg2;
    }

    public static double sphereVolume(int arg1) {
        return (4 * 3.14 * arg1 * arg1) / 3;
    }
}
