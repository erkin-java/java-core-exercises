package booleans;

import java.util.Scanner;

public class Boolean16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Musbat butun sonni kiriting: ");
        int N = scanner.nextInt();

        if (N >= 10 && N <= 99 && N % 2 == 0) {
            System.out.println("Taklif to'g'ri: Son ikki xonali juft sondir.");
        } else {
            System.out.println("Taklif noto'g'ri: Son ikki xonali juft son emas.");
        }

        scanner.close();
    }
}
