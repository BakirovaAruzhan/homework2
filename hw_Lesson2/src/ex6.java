import java.util.Scanner;
public class ex6 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();
        if ((year % 100 == 0) || (year % 400 == 0)) {
            System.out.println("вискосный год.");
        }
    else{
            System.out.println("не високосный год.");
        }
    }
}