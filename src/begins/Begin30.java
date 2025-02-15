package begins;
 import java.util.Scanner;

public class Begin30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double pi = 3.14;

        double degree = (a * 180) / pi;

        System.out.println(degree);

        scanner.close();
    }
}

