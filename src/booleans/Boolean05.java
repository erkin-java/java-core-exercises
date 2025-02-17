package booleans;

import java.util.Scanner;

public class Boolean05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A sonini kiriting: ");
        int A = scanner.nextInt();

        System.out.print("B sonini kiriting: ");
        int B = scanner.nextInt();

        if (A >= 0 || B < -2) {
            System.out.println(" A ≥ 0 yoki B < −2 tengsizliklardan kamida biri bajarilgan.");
        } else {
            System.out.println(" A ≥ 0 yoki B < −2 tengsizliklaridan hech biri bajarilmagan.");
        }

        scanner.close();
    }
}
