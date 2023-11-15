import java.util.Scanner;
class ex14 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите длину угла А:");
        int ugolA = scanner.nextInt();

        System.out.println("Напишите длину угла B:");
        int ugolB = scanner.nextInt();

        System.out.println("Напишите длину угла C:");
        int ugolC = scanner.nextInt();

        if (ugolA > 0 && ugolB > 0 && ugolC > 0) {
            if
            (ugolA + ugolB + ugolC == 180) {

                System.out.println("Треугольник допустим.");
            } else {
                System.out.println("Недопустимый треугольник");
            }
        }
    }
}





