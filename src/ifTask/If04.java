package ifTask;
import java.util.Scanner;

public class If04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinchi sonni kiriting: ");
        int son1 = scanner.nextInt();

        System.out.print("Ikkinchi sonni kiriting: ");
        int son2 = scanner.nextInt();

        System.out.print("Uchinchi sonni kiriting: ");
        int son3 = scanner.nextInt();

        int musbatSonlar = 0;
        if (son1 > 0 ) musbatSonlar++;
        if (son2 > 0) musbatSonlar++;
        if (son3 > 0) musbatSonlar++;

        System.out.println("Musbat sonlar miqdori: " + musbatSonlar);
    }
}
