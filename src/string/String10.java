package string;

import java.util.Scanner;
public class String10 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Satrni kiriting: ");
            String input = scanner.nextLine();

            StringBuilder reversed = new StringBuilder(input);
            System.out.println("Teskari tartibda: " + reversed.reverse().toString());

            scanner.close();
        }
    }
