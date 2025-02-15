package begins;
 import java.util.Scanner;

public class Begin35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // V - qayiqning tezligi (km/soat)
        // U - daryo oqimi tezligi (km/soat)
        // T1 - ko'lda yurish vaqti (soat)
        // T2 - daryoda oqimga qarshi yurish vaqti (soat)
        double V = scanner.nextDouble();
        double U = scanner.nextDouble();
        double T1 = scanner.nextDouble();
        double T2 = scanner.nextDouble();

        double S1 = V * T1;
        double S2 = (V - U) * T2;
        double S = S1 + S2;

        System.out.println( S);

        scanner.close();
    }
}
