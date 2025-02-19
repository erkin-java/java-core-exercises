package ifTask;
import java.util.Scanner;

public class If09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A ni kiriting: ");
        double A = scanner.nextDouble();

        System.out.print("B ni kiriting: ");
        double B = scanner.nextDouble();

        if (A > B) {
            double temp = A;
            A = B;
            B = temp;
        }

        System.out.println("A ning yangi qiymati: " + A);
        System.out.println("B ning yangi qiymati: " + B);

        scanner.close();
    }
}
