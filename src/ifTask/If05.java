package ifTask;
import java.util.Scanner;

public class If05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinchi sonni kiriting: ");
        int son1 = scanner.nextInt();

        System.out.print("Ikkinchi sonni kiriting: ");
        int son2 = scanner.nextInt();

        System.out.print("Uchinchi sonni kiriting: ");
        int son3 = scanner.nextInt();
        int musbatSonlar = 0;
        int manfiySonlar = 0;


        if (son1 > 0) musbatSonlar++;
        else if (son1 < 0) manfiySonlar++;

        if (son2 > 0) musbatSonlar++;
        else if (son2 < 0) manfiySonlar++;

        if (son3 > 0) musbatSonlar++;
        else if (son3 < 0) manfiySonlar++;
        System.out.println("Musbat sonlar miqdori: " + musbatSonlar);
        System.out.println("Manfiy sonlar miqdori: " + manfiySonlar);
    }
}
