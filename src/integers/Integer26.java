package integers;

import java.util.Scanner;

public class Integer26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int startingDay = 2;
        int weekDay = ((K + startingDay - 2) % 7) + 1;
        System.out.println(weekDay);
        scanner.close();
    }
}
