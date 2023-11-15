import java.util.Scanner;

public class ex18 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Напишите оценку по Физике :");
        int physics = scanner.nextInt();
        System.out.println("Напишите оценку по Химии:");
        int chemistry = scanner.nextInt();
        System.out.println("Напишите оценку по Биологии:");
        int biology = scanner.nextInt();
        System.out.println("Напишите оценку по Математики:");
        int math = scanner.nextInt();
        System.out.println("Напишите оценку по Информатике:");
        int computer = scanner.nextInt();
        int res = (physics + chemistry + biology + math + computer) *100;
        int res2 = res /500;
        int totalPercentage = res2;


        if (totalPercentage >= 90) {
            System.out.println("Grade A");
        } else if (totalPercentage >= 80) {
            System.out.println("Grade B");
        }  else if (totalPercentage >= 70) {
            System.out.println("Grade C");
        } else  if (totalPercentage >= 60) {
            System.out.println("Grade D");
        } else if (totalPercentage >= 40) {
            System.out.println("Grade E");
        } else {
            System.out.println("Grade F");
        }
    }

}




