import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите букву:");
        char bukva = scanner.next().charAt(0);

        if ((bukva >= 'a' && bukva <= 'z') || (bukva >= 'A' && bukva <= 'Z')) {
            if (bukva == 'A' || bukva == 'E' || bukva == 'I' || bukva == 'O' || bukva == 'U' || bukva == 'Y') {
                System.out.println("Гласная буква");
            } else {
                System.out.println("Согласная буква");
            }
        } else {
            System.out.println("Вы ввели не букву.");
        }
    }
}
