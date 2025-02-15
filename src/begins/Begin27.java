package begins;
 import java.util.Scanner;

public class Begin27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();

        double A2 = A * A;  // A²
        double A4 = A2 * A2; // A⁴
        double A8 = A4 * A4; // A⁸

        System.out.println(A2 + " " + A4 + " " + A8);

        scanner.close();
    }
}

