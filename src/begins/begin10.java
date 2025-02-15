package begins;
 import java.util.Scanner;

public class begin10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a sonini kiriting: ");
        double a = scanner.nextDouble();

        System.out.print("b sonini kiriting: ");
        double b = scanner.nextDouble();

        double sumSquares = (a * a) + (b * b);

        double difference = a - b;

        double product = a * b;

        double division = a / b;

        System.out.println("a va b ning kvadratlari yig'indisi: " + sumSquares);
        System.out.println("a va b ning ayirmasi: " + difference);
        System.out.println("a va b ning ko'paytmasi: " + product);
        System.out.println("a va b ning qismi: " + division);
        scanner.close();
    }
}