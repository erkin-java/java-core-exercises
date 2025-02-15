package integers;

import java.util.Scanner;

public class Integer08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ikki xonali butun sonni kiriting: ");
        int number = scanner.nextInt();

        int tensPlace = number / 10;

        int onesPlace = number % 10;

        int swappedNumber = (onesPlace * 10) + tensPlace;

        System.out.println("Raqamlarni almashtirgan holda yangi son: " + swappedNumber);

        scanner.close();
    }
}
