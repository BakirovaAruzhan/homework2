import java.util.Scanner;

public class ex22 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите год в котором вы присоединились к организации:");
        int a = scanner.nextInt();
        System.out.println("Напишите текущий год:");
        int b = scanner.nextInt();


        if (b - a >= 3) {
            System.out.println(" Вам выплачивается премия в размере 2500 рупий.");
        }

        System.out.println("Спасибо за информацию.");

    }
}