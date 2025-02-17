package integers;

import java.util.Scanner;

public class Integer27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int startingDay = 6;  //shanba
        int weekDay = ((K + startingDay - 2) % 7) + 1;
        System.out.println(weekDay);
        scanner.close();
    }
}
