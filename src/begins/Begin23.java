package begins;
 import java.util.Scanner;

public class Begin23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int temp = A;
        A = C;
        C = B;
        B = temp;

        System.out.println(A + " " + B + " " + C);

        scanner.close();
    }
}
