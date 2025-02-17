package integers;

import java.util.Scanner;

public class Integer11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Uch xonali butun sonni kiriting: ");
        int number = scanner.nextInt();

        int one = number % 10;

        int ten = (number / 10) % 10;

        int hundred = number /100;

        int yigindi = one + ten + hundred;
        int kopaytma = one * ten * hundred;

        System.out.println("yigindi: " + yigindi);
        System.out.println("kopaytmasi: " + kopaytma);

        scanner.close();
    }
}

