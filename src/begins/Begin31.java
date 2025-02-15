package begins;
 import java.util.Scanner;

public class Begin31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double F = scanner.nextDouble();

        double T = (5.0 / 9) * (F - 32);

        System.out.println( T);

        scanner.close();
    }
}