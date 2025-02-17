package cases;

import java.util.Scanner;

public class Case01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1 dan 7 gacha bo'lgan butun sonni kiriting: ");
        int kun = scanner.nextInt();

        switch (kun) {
            case 1:
                System.out.println("Dushanba");
                break;
            case 2:
                System.out.println("Seshanba");
                break;
            case 3:
                System.out.println("Chorshanba");
                break;
            case 4:
                System.out.println("Payshanba");
                break;
            case 5:
                System.out.println("Juma");
                break;
            case 6:
                System.out.println("Shanba");
                break;
            case 7:
                System.out.println("Yakshanba");
                break;
            default:
                System.out.println("Noto'g'ri son kiritildi. Iltimos, 1 dan 7 gacha bo'lgan son kiriting.");
                break;
        }

        scanner.close();
    }
}
