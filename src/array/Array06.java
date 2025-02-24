package array;

import java.util.Scanner;

public class Array06 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("N ni kiriting: ");
            int N = scanner.nextInt();

            if (N > 0) {
                int[] oddNumbers = new int[N];

                for (int i = 0; i < N; i++) {
                    oddNumbers[i] = 2 * i + 1;
                }

                System.out.print("Massiv: ");
                for (int num : oddNumbers) {
                    System.out.print(num + " ");
                }
            } else {
                System.out.println("N > 0 bo'lishi kerak.");
            }

            scanner.close();
        }
    }

