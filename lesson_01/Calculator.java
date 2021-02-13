public class Calculator {
    public static void main(String[] args) {
        char a = '%';
        int b = 10;
        int c = 5;
        int result = 1;
        if(a == '+') {
            result = b+c;
            System.out.println(result);}

        else if(a == '-') {
            result = b-c;
            System.out.println(result);}

        else if(a == '*') {
            result = b*c;
            System.out.println(result);}

        else if(a == '/') {
            result = b/c;
            System.out.println(result);}

        else if(a == '^') {
            result =(100 * b) / (c * c);
            System.out.println(result);}


        else if(a == '%') {
            result = b%c;
            System.out.println(result);}
        }
}