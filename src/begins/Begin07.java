package begins;
 import java.util.Scanner;

public class Begin07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Aylana radiusini kiriting (r): ");
        double r = scanner.nextDouble();

        double L = 2 * 3.14 * r;

        double s = 3.14 * (r * r);

        System.out.println("Aylananing uzunligi: " + L);
        System.out.println("Aylananing maydoni: " + s);
    }
}
