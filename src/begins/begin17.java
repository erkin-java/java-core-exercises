package begins;
 import java.util.Scanner;

public class begin17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double AC = Math.abs(C - A);
        double BC = Math.abs(C - B);
        double sum = AC + BC;

        System.out.println( AC+ " "+ BC + " " +sum);

        scanner.close();
    }
}