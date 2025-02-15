package begins;
 import java.util.Scanner;

public class Begin33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // X - kg shirinlik, A -  narxi, Y -  kg
        double X = scanner.nextDouble();
        double A = scanner.nextDouble();
        double Y = scanner.nextDouble();

        double P1 = A / X;
        double PY = P1 * Y;

        System.out.println(P1 + " " + PY);

        scanner.close();
    }
}
