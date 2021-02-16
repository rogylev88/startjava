public class MyFirstGame {
    public static void main(String[] args) {
        int a = 0; // Начальное значение диапазона - "от"
        int b = 100; // Конечное значение диапазона - "до"
        int randomNumber = a + (int) (Math.random() * b); // Задаем рандомность числу
        int number = 50; // Переменная которой угадываем число

        if (randomNumber > number) {
            System.out.println("Введенное вами число больше того, что загадал компьютер");

        } else if(randomNumber < number) {
            System.out.println("Введенное вами число меньше того, что загадал компьютер");

        } else if(randomNumber != number) {
            return;

        } else  {
            System.out.println("Вы угадали!");
        }
    }
}