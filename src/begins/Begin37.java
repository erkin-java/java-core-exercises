package begins;
 import java.util.Scanner;

public class Begin37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double V1 = scanner.nextDouble();
        double V2 = scanner.nextDouble();
        double S = scanner.nextDouble();
        double T = scanner.nextDouble();

        double newDistance = Math.abs(S - Math.abs(V1 - V2) * T);

        System.out.println(newDistance);

    }
}

