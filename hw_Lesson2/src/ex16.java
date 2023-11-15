import java.util.Scanner;

public class ex16 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Напишите цифру для поиска квадратного корня:");
        double number = scanner.nextDouble();
        double sqrtResult = Math.sqrt(number);

        System.out.println("Квадратный корень из " + number + " равен: " + sqrtResult);
    }
}
