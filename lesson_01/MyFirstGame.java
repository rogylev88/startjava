public class MyFirstGame {
    public static void main(String[] args) {
        System.out.println(getNumber());
    }

    public static int getNumber() {
        // Переменная компа
        int compNumber = 10;
        // Переменная которой угадываем число, его менять с каждым ходом
        int playerNumber = 49;
        if (compNumber > playerNumber) {
            while (playerNumber < compNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
                playerNumber++;
            }
            return playerNumber;
        } else if (compNumber < playerNumber) {
            while (playerNumber > compNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
                playerNumber--;
            }
            return playerNumber;
        } else {
            System.out.println("Вы угадали!");
            return playerNumber;
        }
    }
}