package begins;

import java.util.Scanner;

public class Begin01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kvadratning tomoni a ni kiriting: ");
        double a = scanner.nextDouble();
        double perimeter = 4 * a;

        System.out.println("Kvadratning perimetri: " + perimeter);

    }
}
