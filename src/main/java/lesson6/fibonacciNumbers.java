package lesson6;

import java.util.Scanner;

public class fibonacciNumbers {

    public static void main(String[] args) {
        System.out.println("Введите какой элемент ряда Фибоначчи вывести на экран.");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()){
            System.out.println("Ожидается целое число. Повторите попытку!");
            scanner.next();
        }
        int index = scanner.nextInt();
        System.out.println("Введено целое значение " + index);
        System.out.println("Элемент ряда Фибоначи с номером " + index + " = " + fibonacciNumbers(index));
    }
// Метод для расчета запрошенного элемента в ряде Фибоначчи.
    public static int fibonacciNumbers(int value) {
        int[] array = new int[100];
        int result = 0;
        array[0] = 0;
        array[1] = 1;
        int index = 2;
        if (value < index) {
            result = array[(value-1)];
        } else {
            for (int j = (index+1); j == value; j++){
                array[(index+1)] = (Math.abs(array[(index-3)]) + Math.abs(array[(index-2)]));
                index = j;
                return result = Math.abs(array[index]);
            }
        }
        return result;
    }
   }
