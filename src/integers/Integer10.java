package integers;

import java.util.Scanner;

public class Integer10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Uch xonali butun sonni kiriting: ");
        int number = scanner.nextInt();

        int ten  = (number / 10) %10;
        int one = number  % 10;

        System.out.println("onlik raqam: " + ten);
        System.out.println("birlik raqam: " + one);

        scanner.close();
    }
}
