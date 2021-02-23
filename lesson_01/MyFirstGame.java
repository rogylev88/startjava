public class MyFirstGame {
    public static void main(String[] args) {
        System.out.println(gameNumber());
    }
    public static Integer gameNumber () {
            // int a = 0; // Начальное значение диапазона - "от"
        // int b = 100; // Конечное значение диапазона - "до"
        // int randomNumber = a + (int) (Math.random() * b); // Задаем рандомность числу
        int compNumber = 50; // Переменная компа
        int playerNumber = 49; // Переменная которой угадываем число, его менять с каждым ходом

            
            if (compNumber > playerNumber) {
            System.out.println("Введенное вами число меньше того, что загадал компьютер");
            playerNumber++;
            return playerNumber;

        } else if (compNumber < playerNumber) {
            System.out.println("Введенное вами число больше того, что загадал компьютер");
            playerNumber--;
            return playerNumber;

        } else {
            System.out.println("Вы угадали!");
            
        }
        
}
}