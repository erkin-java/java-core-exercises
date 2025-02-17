package booleans;

import java.util.Scanner;

public class Boolean17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Musbat butun sonni kiriting: ");
        int N = scanner.nextInt();

        if (N >= 100 && N <= 999 && N % 2 == 1) {
            System.out.println("Taklif to'g'ri: Son uch xonali toq sondir.");
        } else {
            System.out.println("Taklif noto'g'ri: Son uch xonali toq son emas.");
        }

        scanner.close();
    }
}
