package lesson3;

public class HomeWork3 {

    public static void main(String[] args) {
        double a = -1;
        double b = 2;
        double c = -1;
        oddsABC(a, b, c);
    }

    public static void oddsABC(double a, double b, double c) {
        double d = (b * b - (4 * a * c));
        if (a == 0) {
            System.out.println("Первый коэффициент квадратного уравнения не может быть 0.");
        } else if (d > 0) {
            double x1 = (-b - Math.sqrt(d)) / (2 * a);
            double x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Уравнение имеет два решения: " + x1 + " " + x2);
        } else if (d == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет одно решение - " + x);
        } else if (d < 0) {
            System.out.println("Нет действительных решений уравнения");
        }
    }
}