package integers;

import java.util.Scanner;

public class Integer21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kun boshidan o'tgan soniya kiriting: ");
        int s = scanner.nextInt();

        int soat = s % 60 ;


        System.out.println("Kun boshidan o'tgan minutning to'liq soniya  miqdori: " + soat);

        scanner.close();
    }
}
