package string;

import java.util.Scanner;

public class String12 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Bo'sh bo'lmagan satrni kiriting: ");
            String input = scanner.nextLine();

            System.out.println("N ni kiriting (N > 0): ");
            int N = scanner.nextInt();

            if (N > 0) {
                StringBuilder result = new StringBuilder();

                for (int i = 0; i < input.length(); i++) {
                    result.append(input.charAt(i));

                    if ((i + 1) % N == 0 && i != input.length() - 1) {
                        result.append("*");
                    }
                }

                System.out.println("Natija: " + result.toString());
            } else {
                System.out.println("N > 0 bo'lishi kerak.");
            }

            scanner.close();
        }


}
