public class Calculator {
    public static void main(String[] args) {
        char sign = '^';
        double b = 10;
        double c = 5;
        double result = 1;
        if(sign == '+') {
            result = b + c;
            System.out.println(result);
        }
        else if(sign == '-') {
            result = b - c;
            System.out.println(result);
        }
        else if(sign == '*') {
            result = b * c;
            System.out.println(result);
        }
        else if(sign == '/') {
            result = b / c;
            System.out.println(result);
        }
        else if(sign == '^') {
            result =Math.pow(b, c);
            System.out.println(result);
        }
        else if(sign == '%') {
            result = b % c;
            System.out.println(result);}
        }
}