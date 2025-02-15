package begins;
 import java.util.Scanner;

public class Begin13 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Tashqi aylana radiusi R1: ");
            double R1 = scanner.nextDouble();
            System.out.print("Ichki aylana radiusi R2: ");
            double R2 = scanner.nextDouble();

            double pi = Math.PI;
            double S1 = pi * R1 * R1;
            double S2 = pi * R2 * R2;
            double S3 = S1 - S2;
            System.out.println("Tashqi aylananing maydoni S1: " + S1);
            System.out.println("Ichki aylananing maydoni S2: " + S2);
            System.out.println("Aylanalar bilan chegaralangan halqaning maydoni S3: " + S3);
        }
    }
