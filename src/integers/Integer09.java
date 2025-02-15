package integers;

import java.util.Scanner;

public class Integer09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Uch xonali butun sonni kiriting: ");
        int number = scanner.nextInt();

        int hundred = number / 100;

        System.out.println("Yuzlik raqam: " + hundred);

        scanner.close();
    }
}
