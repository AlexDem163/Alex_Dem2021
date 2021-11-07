public class FirstProgram {

    public static void main(String[] args) {
        System.out.println("Привет, мир123!");
        System.out.println();
        int itog = summa(3, 5);
        System.out.println ("Результат суммы чисел: " + itog);
        System.out.println();
        long otherItog = summa(8, 45);
        System.out.println ("Результат другой суммы чисел: " + otherItog);
    }

    /**
     * Метод будет складываь два аргумента и возвращать результат
     * @param arg1 первй аргумент
     * @param arg2 второй аргумент
     * @return результат слодения 2-х чисел
     */
    public static int summa(int arg1, int arg2) {
       int result = arg1 + arg2;
       // это однострочный коментарий
        /* это многострочный коментарий,
        его нужно открыть и закрыть */
        return result;
    }
}
