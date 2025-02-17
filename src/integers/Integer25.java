package integers;

import java.util.Scanner;

public class Integer25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();

        int weekDay = (K + 4 - 1) % 7;
        System.out.println(weekDay);
        scanner.close();
    }
}
