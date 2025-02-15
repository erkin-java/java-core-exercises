package begins;
 import java.util.Scanner;

public class Begin32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double T_C = scanner.nextDouble();

        double T_F = (9.0 / 5) * T_C + 32;

        System.out.println( T_F);

        scanner.close();
    }
}
