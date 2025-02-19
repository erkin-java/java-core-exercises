package cases;
import java.util.Scanner;

public class Case05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Amaliyot raqamini kiriting (1 - qo'shish, 2 - ayirish, 3 - ko'paytirish, 4 - bo'lish): ");
        int N = scanner.nextInt();
        System.out.print("A raqamini kiriting: ");
        double A = scanner.nextDouble();
        System.out.print("B raqamini kiriting: ");
        double B = scanner.nextDouble();

        double natija = 0;

        switch (N) {
            case 1:
                natija = A + B;
                System.out.println("Natija (A + B): " + natija);
                break;
            case 2:
                natija = A - B;
                System.out.println("Natija (A - B): " + natija);
                break;
            case 3:
                natija = A * B;
                System.out.println("Natija (A * B): " + natija);
                break;
            case 4:
                if (B != 0) {
                    natija = A / B;
                    System.out.println("Natija (A / B): " + natija);
                } else {
                    System.out.println("Xatolik: B nolga teng bo'lishi mumkin emas.");
                }
                break;
            default:
                System.out.println("Noto'g'ri amaliyot raqami kiritildi.");
        }

        scanner.close();
    }
}
