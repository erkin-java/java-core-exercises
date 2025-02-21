package string;

import java.util.Scanner;
public class String11 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Bo'sh bo'lmagan satrni kiriting: ");
            String input = scanner.nextLine();

            if (!input.isEmpty()) {
                StringBuilder result = new StringBuilder();

                for (int i = 0; i < input.length(); i++) {
                    result.append(input.charAt(i));
                    if (i < input.length() - 1) {
                        result.append(" ");
                    }
                }

                System.out.println("Natija: " + result.toString());
            } else {
                System.out.println("Satr bo'sh bo'lishi mumkin emas.");
            }

            scanner.close();
        }



}
