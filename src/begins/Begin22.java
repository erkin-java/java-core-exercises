package begins;
 import java.util.Scanner;

public class Begin22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int temp = A;
        A = B;
        B = temp;

        System.out.println(A + " " + B);

        scanner.close();
    }
}
