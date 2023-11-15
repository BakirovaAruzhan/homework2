import java.util.Scanner;

public class ex15 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите длину угла А:");
        int ugolA = scanner.nextInt();

        System.out.println("Напишите длину угла B:");
        int ugolB = scanner.nextInt();

        System.out.println("Напишите длину угла C:");
        int ugolC = scanner.nextInt();

        if (ugolA > 0 && ugolB > 0 && ugolC > 0) {
            if (ugolA == ugolB && ugolB == ugolC) {
                System.out.println("Это равностороний треугольник.");
            } else if (ugolA == ugolB || ugolB == ugolC || ugolC == ugolA) {
                System.out.println("Это равнобедренный треугольник.");
            } else {
                System.out.println("Это разностороний треугольник.");
            }
        } else {
            System.out.println("Некорректные значение углов.");
        }
    }
}
