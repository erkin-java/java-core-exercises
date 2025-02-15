package begins;
 import java.util.Scanner;

public class begin15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double S = scanner.nextDouble();
        double pi = 3.14;

        double D = Math.sqrt((4 * S) / pi);
        double L = pi * D;

        System.out.println( D + " " + L);

        scanner.close();
    }
}

