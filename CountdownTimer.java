import java.util.Scanner;

public class CountdownTimer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите продолжительность таймера в секундах: ");
        int seconds = scanner.nextInt();

        if (seconds <= 0) {
            System.out.println("Некорректный ввод. Введите положительное число.");
            return;
        }

        countdownTimer(seconds);
    }

    private static void countdownTimer(int seconds) {
        try {
            for (int i = seconds; i >= 0; i--) {
                Thread.sleep(1000); // Приостанавливаем выполнение на 1 секунду
                System.out.print("\rОсталось времени: " + i + " сек");
            }
            System.out.println("\nВремя вышло!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
