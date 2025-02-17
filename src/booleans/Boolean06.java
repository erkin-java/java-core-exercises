package booleans;

import java.util.Scanner;

public class Boolean06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A sonini kiriting: ");
        int A = scanner.nextInt();

        System.out.print("B sonini kiriting: ");
        int B = scanner.nextInt();

        System.out.print("C sonini kiriting: ");
        int C = scanner.nextInt();

        if (A < B && B< C) {
            System.out.println(" A < B < C tengsizliklardan kamida biri bajarilgan.");
        } else {
            System.out.println(" A < B < C tengsizliklaridan hech biri bajarilmagan.");
        }

        scanner.close();
    }
}
