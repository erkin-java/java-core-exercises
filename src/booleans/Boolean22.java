package booleans;

import java.util.Scanner;

public class Boolean22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A sonini kiriting: ");
        int A = scanner.nextInt();

        System.out.print("B sonini kiriting: ");
        int B = scanner.nextInt();

        System.out.print("C sonini kiriting: ");
        int C = scanner.nextInt();

        if ((A < B && A < C && B < C) || (A > B && A > C && B > C)) {
            System.out.println("Raqamning barcha raqamlari o'sish yoki kamayish tartibida");
        } else {
            System.out.println("Raqamning barcha raqamlari o'sish yoki kamayish tartibida emas ");
        }

        scanner.close();
    }

}
