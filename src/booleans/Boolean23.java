package booleans;

import java.util.Scanner;

public class Boolean23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A sonini kiriting: ");
        int A = scanner.nextInt();

        System.out.print("B sonini kiriting: ");
        int B = scanner.nextInt();

        System.out.print("C sonini kiriting: ");
        int C = scanner.nextInt();

        System.out.print("D sonini kiriting: ");
        int D = scanner.nextInt();

        if (A == D  && B ==  C  ) {
            System.out.println("Raqam chapdan o'ngga ham, o'ngdan chapga ham teng o'qiladi");
        } else {
            System.out.println("Raqam chapdan o'ngga ham, o'ngdan chapga ham teng o'qilmaydi ");
        }

        scanner.close();
    }
}
