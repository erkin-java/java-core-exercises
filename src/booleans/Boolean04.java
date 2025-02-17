package booleans;

import java.util.Scanner;

public class Boolean04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A sonini kiriting: ");
        int A = scanner.nextInt();

        System.out.print("B sonini kiriting: ");
        int B = scanner.nextInt();

        if (A > 2 && B <= 3) {
            System.out.println("Taklif to'g'ri: A > 2 va B ≤ 3 tengsizliklari ikkalasi ham bajarilgan.");
        } else {
            System.out.println("Taklif noto'g'ri: A > 2 va B ≤ 3 tengsizliklaridan kamida biri bajarilmagan.");
        }

        scanner.close();
    }
}
