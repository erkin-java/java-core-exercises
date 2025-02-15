package begins;
 import java.util.Scanner;

public class Begin18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double AC = Math.abs(C - A);
        double BC = Math.abs(B - C);
        double product = AC * BC;

        System.out.println(product);

        scanner.close();
    }
}