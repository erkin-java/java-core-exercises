package integers;

import java.util.Scanner;

public class Integer04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A sonini kiriting (A > B): ");
        int A = scanner.nextInt();

        System.out.print("B sonini kiriting: ");
        int B = scanner.nextInt();

        int numberOfSegments = A / B;

        System.out.println("A segmentiga joylashtirilgan B segmentlarining soni: " + numberOfSegments);

        scanner.close();
    }
}
