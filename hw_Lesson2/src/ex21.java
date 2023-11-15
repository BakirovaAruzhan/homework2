import java.util.Scanner;

public class ex21 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество купленных товаров:");
        double quantity = scanner.nextDouble();
        System.out.println("Введите цену за одну штуку:");
        double pricePerItem = scanner.nextDouble();


        double totalsumB = quantity * pricePerItem;
        System.out.println("Cумма без учета скидки:" + totalsumB + "KZT");

       double discount = 0;
        if (quantity >= 100) {
            discount = totalsumB* 0.2;
        }
        double totalsumA= totalsumB- discount;
        System.out.println("Сумма с учетом скидки:" +totalsumA );
    }
}








