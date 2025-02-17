package integers;

import java.util.Scanner;

public class Integer16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Uch xonali butun sonni kiriting: ");
        int number = scanner.nextInt();

        int one = number % 10;
        int ten = (number / 10) % 10;
        int hundred = number / 100;

        int reversedNumber = (hundred * 100) + (one * 10) + ten;

        System.out.println("Berilgan sonning o'ngdan chapga o'qilgan shakli: " + reversedNumber);

        scanner.close();
    }
}
