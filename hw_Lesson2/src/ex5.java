import java.util.Scanner;
public class ex5 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        if ((number % 2 == 0)) {
            System.out.println("четное");
        } else {
            System.out.println("не четное");

        }
    }
}



