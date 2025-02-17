package booleans;

import java.util.Scanner;

public class Boolean09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A sonini kiriting: ");
        int A = scanner.nextInt();

        System.out.print("B sonini kiriting: ");
        int B = scanner.nextInt();

        if (A % 2 == 1  || B % 2 == 1) {
            System.out.println("toq");
        } else {
            System.out.println("toq emas.");
        }

        scanner.close();
    }
}
