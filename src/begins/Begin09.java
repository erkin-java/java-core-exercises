package begins;
 import java.util.Scanner;

public class Begin09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a sonini kiriting: ");
        double a = scanner.nextDouble();

        System.out.print("b sonini kiriting: ");
        double b = scanner.nextDouble();

        double geometric = Math.sqrt(a * b);

        System.out.println("a va b sonlarining geometrik o'rtachasi: " + geometric);

        scanner.close();
    }
}
