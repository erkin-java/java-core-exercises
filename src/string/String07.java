package string;

import java.util.Scanner;

public class String07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bo'sh bo'lmagan satrni kiriting: ");
        String input = scanner.nextLine();

        if (!input.isEmpty()) {
            char firstChar = input.charAt(0);
            char lastChar = input.charAt(input.length() - 1);

            System.out.println("Birinchi belgining raqamli qiymati: " + (int) firstChar);
            System.out.println("Oxirgi belgining raqamli qiymati: " + (int) lastChar);
        } else {
            System.out.println("Satr bo'sh bo'lmasligi kerak.");


        }
    }



}
