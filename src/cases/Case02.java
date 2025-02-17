package cases;

import java.util.Scanner;

public class Case02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("bahoni kiriting: ");
        int kun = scanner.nextInt();

        switch (kun) {
            case 1:
                System.out.println("yomon");
                break;
            case 2:
                System.out.println("qoniqarsiz");
                break;
            case 3:
                System.out.println("o'rtacha");
                break;
            case 4:
                System.out.println("yaxshi");
                break;
            case 5:
                System.out.println("a'lo");
                break;
            default:
                System.out.println("xato");
                break;
        }

        scanner.close();
    }
}
