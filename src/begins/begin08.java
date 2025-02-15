package begins;
 import java.util.Scanner;

public class begin08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Aylana radiusini kiriting a: ");
        double a = scanner.nextDouble();
        System.out.print("Aylana radiusini kiriting b: ");
        double b = scanner.nextDouble();

        double ortacha = (a + b) / 2;


        System.out.println("ortachasi: " + ortacha);
    }
}
