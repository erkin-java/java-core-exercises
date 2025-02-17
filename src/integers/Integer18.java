package integers;

import java.util.Scanner;

public class Integer18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("butun sonni kiriting: ");
        int number = scanner.nextInt();

        int ming = (number / 1000) % 10;

        System.out.println("Berilgan sonning minglik raqami: " + ming);

        scanner.close();
    }
}
