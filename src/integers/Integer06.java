package integers;

import java.util.Scanner;

public class Integer06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ikki xonali butun sonni kiriting: ");
        int number = scanner.nextInt();

        int tensPlace = number / 10;

        int onesPlace = number % 10;

        System.out.println("O'nlik raqam: " + tensPlace);
        System.out.println("Birlik raqam: " + onesPlace);

        scanner.close();
    }
}

