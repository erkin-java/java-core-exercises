package array;

import java.util.Scanner;
public class Array16 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("N ni kiriting: ");
            int N = scanner.nextInt();

            if (N > 0) {
                double[] A = new double[N];

                System.out.println("Massiv elementlarini kiriting:");
                for (int i = 0; i < N; i++) {
                    A[i] = scanner.nextDouble();
                }

                System.out.println("Chiqarish:");
                for (int i = 0; i < N / 2; i++) {
                    System.out.print(A[i] + ", " + A[N - 1- i]);
                    if (i != (N / 2 - 1)) {
                        System.out.print(", ");
                    }
                }

                if (N % 2 != 0) {
                    System.out.print(", " + A[N / 2]);
                }
            } else {
                System.out.println("N > 0 bo'lishi kerak.");
            }

            scanner.close();
        }
    }
