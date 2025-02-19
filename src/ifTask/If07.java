package ifTask;
import java.util.Scanner;

public class If07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinchi sonni kiriting: ");
        int son1 = scanner.nextInt();

        System.out.print("Ikkinchi sonni kiriting: ");
        int son2 = scanner.nextInt();

        if (son1 < son2){

            System.out.println("birinchi son kichik " + son1);
        }else {
            System.out.println("ikkinchis son kichik " + son2);
        }
    }
}
