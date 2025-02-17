package integers;

import java.util.Scanner;

public class Integer17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("butun sonni kiriting: ");
        int number = scanner.nextInt();

        int hundredsPlace = (number / 100) % 10;

        System.out.println("Berilgan sonning yuzlik raqami: " + hundredsPlace);

        scanner.close();
    }
}

