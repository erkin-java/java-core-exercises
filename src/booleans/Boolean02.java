package booleans;

import java.util.Scanner;

public class Boolean02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A sonini kiriting: ");
        int A = scanner.nextInt();

        if (A % 2 == 1) {
            System.out.println("Taklif to'g'ri: A soni toq.");
        } else {
            System.out.println("Taklif noto'g'ri: A soni toq emas.");
        }

        scanner.close();
    }
}
