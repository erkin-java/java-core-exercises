package cases;
import java.util.Scanner;

public class Case06 {

     public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int N = scanner.nextInt();
            double L = scanner.nextDouble();

            double lengthInMeters = 0;

            switch (N) {
                case 1:
                    lengthInMeters = L / 10;
                    break;
                case 2:
                    lengthInMeters = L * 1000;
                    break;
                case 3:
                    lengthInMeters = L;
                    break;
                case 4:
                    lengthInMeters = L / 1000;
                    break;
                case 5:
                    lengthInMeters = L / 100;
                    break;
                default:
                    System.out.println("Invalid unit number");
                    return;
            }

            System.out.println(lengthInMeters);

            scanner.close();
        }
    }

