package begins;
 import java.util.Scanner;

public class begin16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();

        double distance = Math.abs(x2 - x1);

        System.out.println(distance);

        scanner.close();
    }
}