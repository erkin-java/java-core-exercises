package cases;

import java.util.Scanner;

public class Case03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1 dan 12 gacha bo'lgan oy sonini kiriting: ");
        int oy = scanner.nextInt();

        switch (oy) {
            case 12:
            case 1:
            case 2:
                System.out.println("Qish");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Bahor");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yoz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Kuz");
                break;
            default:
                System.out.println("Noto'g'ri oy soni kiritildi. Iltimos, 1 dan 12 gacha bo'lgan son kiriting.");
                break;
        }

        scanner.close();
    }
}