package begins;
 import java.util.Scanner;

public class begin11 {
    public class begin {
        public static void main(String[] args) {
            // Scanner obyekti orqali foydalanuvchidan a va b sonlarini olish
            Scanner scanner = new Scanner(System.in);

            // Foydalanuvchidan a va b sonlarini kiritishni so'rash
            System.out.print("a sonini kiriting: ");
            double a = scanner.nextDouble();

            System.out.print("b sonini kiriting: ");
            double b = scanner.nextDouble();

            double sumOfAbs = Math.abs(a) + Math.abs(b);

            double differenceOfAbs = Math.abs(a) - Math.abs(b);

            double productOfAbs = Math.abs(a) * Math.abs(b);

            double divisionOfAbs = Math.abs(a) / Math.abs(b);

            System.out.println("a va b ning mutlaq qiymatlarining yig'indisi: " + sumOfAbs);
            System.out.println("a va b ning mutlaq qiymatlarining ayirmasi: " + differenceOfAbs);
            System.out.println("a va b ning mutlaq qiymatlarining ko'paytmasi: " + productOfAbs);
            System.out.println("a va b ning mutlaq qiymatlarining qismi: " + divisionOfAbs);

            scanner.close();
        }
    }
}