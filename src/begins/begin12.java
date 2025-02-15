package begins;
 import java.util.Scanner;

public class begin12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a oyoq uzunligini kiriting: ");
        double a = scanner.nextDouble();

        System.out.print("b oyoq uzunligini kiriting: ");
        double b = scanner.nextDouble();

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        double perimeter = a + b + c;

        System.out.println("To'g'ri burchakli uchburchakning gipotenuzasi: " + c);
        System.out.println("To'g'ri burchakli uchburchakning perimetri: " + perimeter);

        scanner.close();
    }
}