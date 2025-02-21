package string;

import java.util.Scanner;
public class String08 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("N ni kiriting (N > 0): ");
            int N = scanner.nextInt();
            System.out.println("C belgisi ni kiriting: ");
            char C = scanner.next().charAt(0);

            if (N > 0) {
                StringBuilder result = new StringBuilder();

                for (int i = 0; i < N; i++) {
                    result.append(C);
                }

                System.out.println("Natija: " + result.toString());
            } else {
                System.out.println("N > 0 bo'lishi kerak.");
            }

            scanner.close();
        }


}
