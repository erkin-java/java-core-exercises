package integers;

import java.util.Scanner;

public class Integer12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Uch xonali butun sonni kiriting: ");
        int number = scanner.nextInt();

        int one = number % 10;
        int tens = (number / 10) % 10;
        int hundred = number / 100;

        int reversedNumber = (one* 100) + (tens * 10) + hundred;

        System.out.println("Berilgan sonning o'ngdan chapga o'qilgan shakli: " + reversedNumber);

        scanner.close();
    }
}
