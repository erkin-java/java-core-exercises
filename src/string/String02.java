package string;

import java.util.Scanner;
public class String02 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("N ni kiriting: ");
            int N = scanner.nextInt();

            if (N >= 32 && N <= 126) {
                char character = (char) N;
                System.out.println("Raqamli qiymat: " + N);
                System.out.println("Belgisi: " + character);
            } else {
                System.out.println("Berilgan N soni oraliqda emas.");
            }

            scanner.close();
        }


}
