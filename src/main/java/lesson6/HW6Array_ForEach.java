package lesson6;

import java.util.Arrays;

public class HW6Array_ForEach {

    public static void main(String[] args) {
        int[] array = new int[]{23, 68, 93, 5, 2, 23, 44, 16, 39, 77};
        System.out.println("Наибольший элемент в массиве " + maxSymbol(array) + ".");
        System.out.println("----------");
        System.out.println("(2-й способ) Наибольший элемент в массиве " + maxSymbol2(array) + ".");
        System.out.println("----------");
        System.out.println("Наименьший элемент в массиве " + minSymbol(array) + ".");
        System.out.println("----------");
        System.out.println("(2-й способ) Наименьший элемент в массиве " + minSymbol2(array) + ".");
        System.out.println("----------");
        System.out.println("Среднее значение элементов в массиве " + averageSymbol(array) + ".");
        System.out.println("----------");
        System.out.print("Массив состоит из следующих элементов: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + "|");
        }
    }

    public static int maxSymbol(int[] array) {
        int max = array[0];
        for (int symbol : array) {
            if (symbol > max) {
                max = symbol;
            }
        }
        return max;
    }

    public static int minSymbol(int[] array) {
        int min = array[0];
        for (int symbol : array) {
            if (symbol < min) {
                min = symbol;
            }
        }
        return min;
    }

    public static double averageSymbol(int[] args) {
        double otherSimbol = 0;
        for (int symbol : args) {
            otherSimbol += symbol;
        }
        return (otherSimbol / args.length);
    }

    public static int maxSymbol2(int[] array) {
        Arrays.sort(array);
        return array[(array.length - 1)];
    }

    public static int minSymbol2(int[] array) {
        Arrays.sort(array);
        return array[0];
    }
}

