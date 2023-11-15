import java.util.Scanner;

public class ex17 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Напишите сумму прибыли:");
        int profit = scanner.nextInt();
        System.out.println("Напишите сумму затрат:");
        int costs = scanner.nextInt();
        if (profit > costs)
            System.out.println("Прибыли больше убытка");
        else System.out.println("Вы в убытке");
    }
}


