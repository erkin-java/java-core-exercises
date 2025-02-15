package integers;

import java.util.Scanner;

public class Integer02 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print(" kg kiriting: ");
            int m = scanner.nextInt();

            int tonna = m / 1000;

            System.out.println(tonna + "tonna ");

            scanner.close();
        }
    }
