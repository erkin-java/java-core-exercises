package cases;
import java.util.Scanner;

public class Case07 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int N = scanner.nextInt();
            double M = scanner.nextDouble();

            double massInKilograms = 0;

            switch (N) {
                case 1:
                    massInKilograms = M;
                    break;
                case 2:
                    massInKilograms = M / 1_000_000;
                    break;
                case 3:
                    massInKilograms = M / 1000;
                    break;
                case 4:
                    massInKilograms = M * 1000;
                    break;
                case 5:
                    massInKilograms = M * 100;
                    break;
                default:
                    System.out.println("Invalid unit number");
                    return;
            }

            System.out.println(massInKilograms);

            scanner.close();
        }
    }

