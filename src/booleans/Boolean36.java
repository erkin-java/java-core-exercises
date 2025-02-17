package booleans;

import java.util.Scanner;

public class Boolean36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x1, y1, x2, y2: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        boolean result = (x1 != x2 && y1 == y2) || (y1 != y2 && x1 == x2);


        if (result) {
            System.out.println("HA");
        } else {
            System.out.println("YO'Q");
        }
    }
}
