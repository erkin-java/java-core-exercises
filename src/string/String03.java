package string;

import java.util.Scanner;
public class String03 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("C belgisi ni kiriting: ");
            char c = scanner.next().charAt(0);

            char previousChar = (char) (c - 1);  // C dan oldingi belgi
            char nextChar = (char) (c + 1);      // C dan keyingi belgi

            System.out.println("Oldingi belgi: " + previousChar);
            System.out.println("Keyingi belgi: " + nextChar);

            scanner.close();
        }
    }

