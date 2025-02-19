package cases;

import java.util.Scanner;
public class Case09 {

       public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

            int D = scanner.nextInt();
            int M = scanner.nextInt();

            int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            if (D == daysInMonth[M - 1]) {
                if (M == 12) {
                    D = 1;
                    M = 1;
                } else {
                    M++;
                    D = 1;
                }
            } else {
                D++;
            }

            System.out.println(D + " " + M);

            scanner.close();
        }
    }


