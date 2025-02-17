package integers;

import java.util.Scanner;

public class Integer30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int century = (year - 1) / 100 + 1;
        System.out.println(century);
        scanner.close();
    }
}
