package string;

import java.util.Scanner;
public class String04 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("N ni kiriting: ");
            int N = scanner.nextInt();

            if (N >= 1 && N <= 26) {
                for (int i = 0; i < N; i++) {
                    char letter = (char) ('A' + i);
                    System.out.print(letter + " ");
                }
            } else {
                System.out.println("N qiymati noto'g'ri, 1 ≤ N ≤ 26 oraliqda bo'lishi kerak.");
            }

            scanner.close();
        }

}
