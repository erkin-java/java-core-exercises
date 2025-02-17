package integers;

import java.util.Scanner;

public class Integer20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kun boshidan o'tgan soniya kiriting: ");
        int s = scanner.nextInt();

        int soat = s / 3600;

        System.out.println("Kun boshidan o'tgan to'liq soatlar miqdori: " + soat);

        scanner.close();
    }
}
