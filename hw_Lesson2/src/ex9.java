import java.util.Scanner;
public class ex9 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Тыкните одну клавишу: ");
        char klavik= scanner.next().charAt(0);

        if (Character.isAlphabetic(klavik)) {
            System.out.println(klavik +" "+"Это буква");

        } else if (Character.isDigit(klavik)) {
            System.out.println(klavik +" "+ "Это цифра");

        } else System.out.println(klavik +" "+ "Это символ");
    }

}


