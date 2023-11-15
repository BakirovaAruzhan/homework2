import java.util.Scanner;

public class ex20 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стоимость электроэнергии за одну единицу: ");
        double rate = scanner.nextDouble();
        System.out.println("Введите количество потребленных единиц электроэнергии:");
        double units = scanner.nextDouble();


        double cost = 0;
        if (units <= 50) {
            cost = units * rate;
        } else if (units <= 150) {
            cost = 50 * rate + (units - 50) * 0.75;
        } else if (units <= 250) {
            cost = 150 * rate + (units - 150) * 1.20;
        } else cost = 250 * rate + (units - 250) * 1.50;

        double surcharge = cost * 0.2;
        double totalsum = surcharge;

        System.out.println("Общая стоимость счета за электроэнергию составляет: " + totalsum+ "тенге");


    }
}










