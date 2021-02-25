public class MyFirstGame {
    public static void main(String[] args) {
        System.out.println(getNumber());
    }

    public static int getNumber() {
        int compNumber = 50; // Переменная компа
        int playerNumber = 49; // Переменная которой угадываем число, его менять с каждым ходом
        if (compNumber > playerNumber) {
            System.out.println("Введенное вами число меньше того, что загадал компьютер");
            return playerNumber++;
        } else if (compNumber < playerNumber) {
            System.out.println("Введенное вами число больше того, что загадал компьютер");
            return playerNumber--;
        } else {
            System.out.println("Вы угадали!");
            return playerNumber;
        }
    }
}