import java.util.Scanner;


public class CalculatorTest {
    public static void main(String[] args) {
//метод main и отвечать за создание объектов, их инициализацию, ввод математического выражения и запуск вычислений
        Scanner scan = new Scanner (System.in);
        System.out.println("Введите первое число:");
        double b = scan.nextDouble();
        System.out.println("Введите знак математической операции:");
        char sign = scan.next().charAt(0);
        System.out.println("Введите второе число:");
        double c = scan.nextDouble();
    }
}