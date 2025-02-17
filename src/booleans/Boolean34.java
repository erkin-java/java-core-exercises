package booleans;

import java.util.Scanner;

public class Boolean34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if ((x + y) % 2 == 0) {
            System.out.println("YES"); // Oq rang
        } else {
            System.out.println("NO");  // Qora rang
        }

        scanner.close();
    }
}
