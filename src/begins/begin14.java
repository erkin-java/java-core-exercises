package begins;
 import java.util.Scanner;

public class begin14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double L = scanner.nextDouble();
        double pi = 3.14;

        double R = L / (2 * pi);
        double S = pi * R * R;

        System.out.println( R + " " +S);

        scanner.close();
    }
}
