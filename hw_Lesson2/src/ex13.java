import java.util.Scanner;
public class ex13 {
    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Напишите сумму в тенге: ");
        int sum = scanner.nextInt();
        if (sum >= 2000) {
            int dev = sum / 2000;
            int resdev = dev;
            sum = sum - (dev * 2000);

            System.out.println("2000тг=" + resdev + "шт");
        }
        if (sum >= 500) {
            int dev1 = sum / 500;
            int resdev2 = dev1;
            sum = sum - (dev1 * 500);
            System.out.println("2000тг=" + resdev2 + "шт");

        }
        if (sum >= 200) {
            int dev2 = sum / 200;
            int resdev3 = dev2;
            sum = sum - (sum * 200);
            System.out.println("200тг=" + resdev3 + "шт");
        }
        if (sum >= 100) {
            int dev4 = sum / 100;
            int resdev4 = dev4;
            sum = sum - (sum * 100);
            System.out.println("100тг=" + resdev4 + "шт");
        }
        if (sum >= 20) {
            int dev5 = sum / 20;
            int resdev5 = dev5;
            sum = sum - (sum * 20);
            System.out.println("20тг" + resdev5 + "шт");
        }
        if (sum >= 5) {
            int dev6 = sum / 5;
            int resdev6 = dev6;
            sum = sum - (sum * 5);
            System.out.println("5" + resdev6 + "шт");
        }

    }
}





