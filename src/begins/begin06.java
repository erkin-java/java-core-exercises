package begins;
 import java.util.Scanner;

public class begin06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Aylana a tomoni: ");
        int a = scanner.nextInt();
        System.out.print("Aylana b tomoni: ");
        int b = scanner.nextInt();
        System.out.print("Aylana c tomoni: ");
        int c = scanner.nextInt();


        int V = a * b * c;
        int s = 2 * (a * b + b * c + a * c) ;

        System.out.println("Kubning hajmi: " + V);
        System.out.println("Kubning sirt maydoni: " + s);

    }
}