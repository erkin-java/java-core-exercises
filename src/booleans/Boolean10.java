package booleans;

import java.util.Scanner;

public class Boolean10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A sonini kiriting: ");
        int A = scanner.nextInt();

        System.out.print("B sonini kiriting: ");
        int B = scanner.nextInt();

        if ((A % 2 != 0 && B % 2 == 0) || (A % 2 == 0 && B % 2 != 0)) {
            System.out.println("kamida bittasi toq");
        } else {
            System.out.println("toq emas.");
        }

        scanner.close();
    }
}
