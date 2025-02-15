package integers;

import java.util.Scanner;

public class Integer07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ikki xonali butun sonni kiriting: ");
        int number = scanner.nextInt();

        int tensPlace = number / 10;

        int onesPlace = number % 10;

        int yigindi = onesPlace + tensPlace;

        int kopaytma = onesPlace * tensPlace;


        System.out.println("yigindisi: " + yigindi);
        System.out.println("kopaytma: " + kopaytma);

        scanner.close();
    }
}
