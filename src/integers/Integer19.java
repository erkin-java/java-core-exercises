package integers;

import java.util.Scanner;

public class Integer19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kun boshidan o'tgan soniyalarni kiriting: ");
        int seconds = scanner.nextInt();

        int fullMinutes = seconds / 60;

        System.out.println("Kun boshidan o'tgan to'liq daqiqalar miqdori: " + fullMinutes);

        scanner.close();
    }
}
