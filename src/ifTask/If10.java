package ifTask;
import java.util.Scanner;

public class If10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A ni kiriting: ");
        int A = scanner.nextInt();

        System.out.print("B ni kiriting: ");
        int B = scanner.nextInt();

        if (A != B) {
            A = A + B;
            B = A;
        } else {
            A = 0;
            B = 0;
        }

        System.out.println("A ning yangi qiymati: " + A);
        System.out.println("B ning yangi qiymati: " + B);

        scanner.close();
    }
}
