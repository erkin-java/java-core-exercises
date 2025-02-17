package booleans;

import java.util.Scanner;

public class Boolean19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A sonini kiriting: ");
        int A = scanner.nextInt();

        System.out.print("B sonini kiriting: ");
        int B = scanner.nextInt();

        System.out.print("C sonini kiriting: ");
        int C = scanner.nextInt();

        if (A != B || A != C || B != C) {
            System.out.println("Taklif to'g'ri: Uchta berilgan sonlar orasida kamida bir juft qarama qarshilik  bor.");
        } else {
            System.out.println("Taklif noto'g'ri: Uchta berilgan sonlar orasida  bir juft qarama qarshilik yo'q.");
        }

        scanner.close();
    }
}
