package begins;

    import java.util.Scanner;

public class Begin02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" a ni kiriting: ");
        double a = scanner.nextDouble();
        double s = a * a;

        System.out.println("kvadrat s maydoni " + s);
    }
}


