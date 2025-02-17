package booleans;

import java.util.Scanner;

public class Boolean03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A sonini kiriting: ");
        int A = scanner.nextInt();

        if (A % 2 == 0) {
            System.out.println("Taklif to'g'ri: A soni juft.");
        } else {
            System.out.println("Taklif noto'g'ri: A soni juft emas.");
        }

        scanner.close();
    }
}

