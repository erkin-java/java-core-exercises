package string;

import java.util.Scanner;
public class String01 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Belgini kiriting: ");
            char character = scanner.next().charAt(0);

            int digitValue = (int) character;

            System.out.println("Berilgan belgi: " + character);
            System.out.println("Raqamli qiymati: " + digitValue);

            scanner.close();
        }
    }

