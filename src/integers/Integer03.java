package integers;

import java.util.Scanner;
public class Integer03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("bayt: ");
        int k = scanner.nextInt();

        int kb = k / 1024;

        System.out.println("kilobayt: " + kb);

        scanner.close();
    }
}
