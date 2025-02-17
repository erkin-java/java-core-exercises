package integers;

import java.util.Scanner;
public class Integer28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = scanner.nextInt();
        int weekDay = ((K + N - 2) % 7) + 1;
        System.out.println(weekDay);
        scanner.close();
    }
}
