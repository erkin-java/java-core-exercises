package fors;

import java.util.Scanner;

public class For20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n:");
        long n = scanner.nextLong();

        long fact = 1;
        long sum = 0;

        for (int i = 1; i <= n; i++) {
            fact *= i;
            sum += fact;
        }

        System.out.println("Sum of factorials: " + sum);
    }
}
