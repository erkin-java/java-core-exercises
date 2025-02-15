package begins;
 import java.util.Scanner;

public class Begin29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double pi = 3.14;

        double radian = (a * pi) / 180;

        System.out.println(radian);

        scanner.close();
    }
}
