package cases;

import java.util.Scanner;
public class Case08 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int D = scanner.nextInt();
            int M = scanner.nextInt();
            int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            if (D == 1) {
                if (M == 1) {
                    D = 31;
                    M = 12;
                } else {
                    M--;
                    D = daysInMonth[M - 1]; }
            } else {
                D--;
            }

            System.out.println(D + " " + M);

            scanner.close();
        }
    }


