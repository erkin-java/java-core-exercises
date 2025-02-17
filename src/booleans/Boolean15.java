package booleans;

import java.util.Scanner;

public class Boolean15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A sonini kiriting: ");
        int A = scanner.nextInt();

        System.out.print("B sonini kiriting: ");
        int B = scanner.nextInt();

        System.out.print("C sonini kiriting: ");
        int C = scanner.nextInt();

        int musbat = 0;

        if (A > 0) musbat++;
        if (B > 0) musbat++;
        if (C > 0) musbat++;

        if (musbat == 2) {
            System.out.println("Taklif to'g'ri: A, B, va C raqamlaridan aynan ikkitasi musbat.");
        } else {
            System.out.println("Taklif noto'g'ri: A, B, va C raqamlaridan aynan ikkitasi musbat emas.");
        }

        scanner.close();
    }
}
