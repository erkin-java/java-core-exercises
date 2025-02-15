package begins;
 import java.util.Scanner;

public class Begin28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();

        double A2 = A * A;      // A2
        double A3 = A2 * A;     // A3
        double A5 = A3 * A2;    // A5
        double A10 = A5 * A5;   // A10
        double A15 = A10 * A5;  // A15

        System.out.println(A2 + " " + A3 + " " + A5 + " " + A10 + " " + A15);

        scanner.close();
    }
}
