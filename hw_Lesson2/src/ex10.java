import java.util.Scanner;
public class ex10 {
    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Нажмите одну цифру от 1 до 7: ");
        int digit = scanner.nextInt();

        switch (digit) {
            case 1 -> System.out.println("Понедельник.");
            case 2 -> System.out.println("Вторник.");
            case 3 -> System.out.println("Среда - мальенкая пятница.");
            case 4 -> System.out.println("Четверг - чувсвуется как понедельник иногда.");
            case 5 -> System.out.println("Питница.");
            case 6 -> System.out.println("Cуббота.");
            case 7 -> System.out.println("Воскресенье.");
            default -> System.out.println("error.");
        }
    }
}