package begins;
 import java.util.Scanner;

public class begin03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("To'rtburchakning a tomonini kiriting: ");
        double a = scanner.nextDouble();
        System.out.print("To'rtburchakning b tomonini kiriting: ");
        double b = scanner.nextDouble();

        double area = a * b;

        double perimeter = 2 * (a + b);

        System.out.println("To'rtburchakning maydoni: " + area);
        System.out.println("To'rtburchakning perimetri: " + perimeter);


    }
}
