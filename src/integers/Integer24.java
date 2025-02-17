package integers;

import java.util.Scanner;

public class Integer24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yilning K-kunini kiriting (1-365): ");
        int K = scanner.nextInt();


        int weekDay = (K + 1) % 7;

        System.out.println("Yilning " + K + "-kuni: " + weekDay);

        scanner.close();
    }
}
