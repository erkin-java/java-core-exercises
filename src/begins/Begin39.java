package begins;
 import java.util.Scanner;

public class Begin39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double D = B * B - 4 * A * C;

        if (D > 0 && A != 0) {
            double sqrtD = Math.sqrt(D);
            double x1 = (-B - sqrtD) / (2 * A);
            double x2 = (-B + sqrtD) / (2 * A);

            if (x1 > x2) {
                double temp = x1;
                x1 = x2;
                x2 = temp;
            }

            System.out.println( x1 + " " + x2);
        } else {
            System.out.println("Noto‘g‘ri ma’lumotlar kiritildi!");
        }

        scanner.close();
    }
}
