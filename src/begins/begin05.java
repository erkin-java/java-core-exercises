package begins;
 import java.util.Scanner;

public class begin05 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Aylana a tomoni: ");
            int a = scanner.nextInt();


            int kub = a * a * a;
            int sirt = 6 * (a * a);

            System.out.println("Kubning hajmi: " + kub);
            System.out.println("Kubning sirt maydoni: " + sirt);

        }
    }
