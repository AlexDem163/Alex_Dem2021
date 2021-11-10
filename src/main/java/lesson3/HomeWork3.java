package lesson3;

public class HomeWork3 {

    public static void main(String[] args) {

        double a, b, c;
        a = 0;
        b = -6;
        c = 9;

        if (a == 0) {
            System.out.println("Первый коэффициент квадратного уравнения не может быть 0.");
        }
        double d = b * b - (4 * a * c);
        if (d < 0) {
            System.out.println("Нет действительных решений уравнения");
        }
        if (d == 0) {
            double x12 = -b / (2 * a);
            System.out.println("Уравнение имеет одно решение - " + x12);
        }
        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (b + Math.sqrt(d)) / (2 * a);
            System.out.println("Уравнение имеет два решения: " + x1 + " " + x2);
        }
            System.out.println("Дискриминант " + d);
        }
    }
