public class Calculator {

        double b = 1;
        char sign = '+';
        double c = 1;
//класс Calculator будет содержать код, отвечающий за проверку математического знака и сами вычисления
    void run() {
    switch (sign) {
        case '+' :
            System.out.println(b + c);
            break;
        case '-' :
            System.out.println(b - c);
            break;
        case '*' :
            System.out.println(b * c);
            break;
        case '/' :
            System.out.println(b / c);
            break;
        case '^' :
            double result = 1;
            for (int i = 1; i <= c; i++) {
                result *= b;
            }
            System.out.println(result);
            break;
        case '%' :
            System.out.println(b % c);
            break;
    }
    }
}
