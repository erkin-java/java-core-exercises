package begins;
 import java.util.Scanner;

public class begin19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double width = Math.abs(x2 - x1);
        double height = Math.abs(y2 - y1);

        double perimeter = 2 * (width + height);
        double area = width * height;

        System.out.println( perimeter + " " + area);

        scanner.close();
    }
}