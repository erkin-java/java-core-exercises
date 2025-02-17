package booleans;

import java.util.Scanner;

public class Boolean12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A sonini kiriting: ");
        int A = scanner.nextInt();

        System.out.print("B sonini kiriting: ");
        int B = scanner.nextInt();

        System.out.print("C sonini kiriting: ");
        int C = scanner.nextInt();

        if (A > 0 && B > 0 && C > 0) {
            System.out.println(" musbat");
        } else {
            System.out.println("musbat emas");
        }

        scanner.close();
    }
}
