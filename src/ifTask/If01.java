package ifTask;
import java.util.Scanner;

public class If01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Butun sonni kiriting: ");
        int son = scanner.nextInt();

        if (son > 0) {
            son -= 8;
        }

        System.out.println("Olingan son: " + son);
    }
}
