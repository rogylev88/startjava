public class Calculator {
    public static void main(String[] args) {
        char sign = '^';
        double b = 10;
        double c = 5;

        if (sign == '+') {
            System.out.println(b + c);
        } else if (sign == '-') {
            System.out.println(b - c);
        } else if (sign == '*') {
            System.out.println(b * c);
        } else if (sign == '/') {
            System.out.println(b / c);
        } else if (sign == '^') {
            double result = 1;
            for (int i = 1; i <= c; i++) {
                result *= b;
            }
            System.out.println(result);
        } else if (sign == '%') {
            System.out.println(b % c);
        }
    }
}