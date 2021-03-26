public class CalculatorTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите первое число:");
        double b = scanner.nextDouble();
        System.out.println("Введите знак математической операции:");
        char sign = scanner.next().charAt(0);
        System.out.println("Введите второе число:");
        double c = scanner.nextDouble();
    }
}