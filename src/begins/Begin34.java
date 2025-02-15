package begins;
 import java.util.Scanner;

public class Begin34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // X - kg shokolad, A - shokolad narxi
        // Y - kg shakar konfeti, B - shakar konfeti narxi
        double X = scanner.nextDouble();
        double A = scanner.nextDouble();
        double Y = scanner.nextDouble();
        double B = scanner.nextDouble();

        double P_shokolad = A / X;
        double P_konfet = B / Y;
        double K = P_shokolad / P_konfet;

        System.out.println( P_shokolad + " " + P_konfet + " " + K);

        scanner.close();
    }
}
