package ifTask;
import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Butun sonni kiriting: ");
        int son = scanner.nextInt();

        if (son > 0) {
            son -= 8;
        }else{
            son +=6;
        }

        System.out.println("Olingan son: " + son);
    }
}
