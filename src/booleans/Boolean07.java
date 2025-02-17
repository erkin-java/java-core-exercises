package booleans;

import java.util.Scanner;

public class Boolean07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A sonini kiriting: ");
        int A = scanner.nextInt();

        System.out.print("B sonini kiriting: ");
        int B = scanner.nextInt();

        System.out.print("C sonini kiriting: ");
        int C = scanner.nextInt();

        if ((A < B && B < C) || (C < B && B < A)) {
            System.out.println(" B soni A va  C o'rtasida tengsizliklardan kamida biri bajarilgan.");
        } else {
            System.out.println(" B soni A va  C o'rtasida tengsizliklaridan hech biri bajarilmagan.");
        }

        scanner.close();
    }
}
