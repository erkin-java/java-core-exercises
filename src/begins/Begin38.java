package begins;
 import java.util.Scanner;

public class Begin38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();

        if (A != 0) {
            double x = -B / A;
            System.out.println( x);
        } else {
            System.out.println("A nolga teng bo‘lishi mumkin emas!");
        }

        scanner.close();
    }
}
