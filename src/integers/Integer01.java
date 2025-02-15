package integers;

import java.util.Scanner;

public class Integer01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masofani santimetrda kiriting: ");
        int L = scanner.nextInt();

        int Meters = L / 100;

        System.out.println("Masofaning to'liq metrlari: " + Meters);

        scanner.close();
    }
}

