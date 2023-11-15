public class ex4 {
    public static void main(String[] arg) {
        int number = 110;
        if ((number % 5 == 0) && (number % 11 == 0)) {
            System.out.println("делиться на 5 и 11");
        }
        else if (number % 5 == 0) {
            System.out.println("делиться на 5");
        } else if (number % 11 == 0) {
            System.out.println("делиться на 11");
        } else {
            System.out.println("не делиться на 5 и на 11");}


    }
}
//4. Write a  program to check whether a number is divisible by 5 and 11 or not