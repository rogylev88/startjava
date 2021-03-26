public class Calculator {

        double b = 1;
        char sign = '+';
        double c = 1;


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
