package cases;

import java.util.Scanner;

public class Case04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("oy sonini kiriting: ");
        int oy = scanner.nextInt();

        int kunlar = 0;

        switch (oy) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                kunlar = 31;
                break;
            case 2:
                kunlar = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                kunlar = 30;
                break;
            default:
                System.out.println("Noto'g'ri oy soni kiritildi. Iltimos, 1 dan 12 gacha bo'lgan son kiriting.");
                return;
        }

        System.out.println("Oyda kunlar soni: " + kunlar);

        scanner.close();
    }
}
