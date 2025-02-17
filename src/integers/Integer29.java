package integers;

import java.util.Scanner;

public class Integer29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("To'rtburchakning A uzunligi: ");
        int A = scanner.nextInt();
        System.out.print("To'rtburchakning B uzunligi: ");
        int B = scanner.nextInt();
        System.out.print("Kvadratning yon uzunligi (C): ");
        int C = scanner.nextInt();

        int numSquares = (A / C) * (B / C);
        int unusedArea = (A * B) - (numSquares * C * C);
        System.out.println("To'rtburchak ustiga joylashtirilgan kvadratlar soni: " + numSquares);
        System.out.println("Foydalanilmagan maydon: " + unusedArea);
    }
}
