import java.util.Scanner;
public class ex12 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите букву: ");
        char bukva = scanner.next().charAt(0);
        boolean isLowerCase = ((char) bukva >= 'a' && bukva <= 'z');
        boolean isUppercase = ((char) bukva >= 'A' && bukva <= 'Z');
       if (isLowerCase) {
           System.out.println(bukva+" "+"- Буква нижнего регистра");
       }
           else if  (isUppercase) {
           System.out.println(bukva+" "+"- Буква верхнего регистра");}
           else {
           System.out.println("error");

        }
    }
}

