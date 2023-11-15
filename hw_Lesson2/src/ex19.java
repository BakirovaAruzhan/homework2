import java.util.Scanner;

public class ex19 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите валовую часть вашей заработной платы:");
        double grossSalary = scanner.nextDouble();


        if (grossSalary <= 10000) {
            double hra = grossSalary * 0.2;
            double da = grossSalary * 0.8;
            double res = grossSalary+ hra + da;


            System.out.println("Фактическая зароботная плата сотавляет:" + res);

        } else if (grossSalary <= 20000) {
            double hra = grossSalary * 0.25;
            double da = grossSalary * 0.9;
            double res = grossSalary+ hra + da;

            System.out.println("Фактическая зароботная плата сотавляет:" + res);

        } else if (grossSalary > 20000) {
            double hra = grossSalary * 0.3;
            double da = grossSalary * 0.95;
            double res = grossSalary+ hra + da;
            System.out.println("Фактическая зароботная плата сотавляет:" + res);
        }

    }

}
