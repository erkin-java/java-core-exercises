package booleans;

import java.util.Scanner;

public class Boolean11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A sonini kiriting: ");
        int A = scanner.nextInt();

        System.out.print("B sonini kiriting: ");
        int B = scanner.nextInt();

        if (A % 2 == B % 2) {
            System.out.println("Taklif to'g'ri: A va B raqamlari teng paritetga ega.");
        } else {
            System.out.println("Taklif noto'g'ri: A va B raqamlari teng paritetga ega emas.");
        }

        scanner.close();
    }
}
