package string;


import java.util.Scanner;
public class String06 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("C belgisi ni kiriting: ");
            char C = scanner.next().charAt(0);

            if (Character.isDigit(C)) {
                System.out.println("raqam");
            } else if (Character.isUpperCase(C)) {
                System.out.println("kapital");
            } else if (Character.isLowerCase(C)) {
                System.out.println("kichik");
            } else {
                System.out.println("Noma'lum belgi");
            }

            scanner.close();
        }
    }

