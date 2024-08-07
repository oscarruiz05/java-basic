import java.util.Scanner;

public class Invoice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name invoice: \n");
        String name = scanner.nextLine();

        System.out.println("Enter price 1: \n");
        double price1 = scanner.nextDouble();

        System.out.println("Enter price 2: \n");
        double price2 = scanner.nextDouble();

        double total = price1 + price2;
        double tax = total * 0.19;
        double totalTax = total + tax;

        System.out.println("Name: " + name + "\n" +
                "Total: " + total + "\n" +
                "Tax: " + tax + "\n" +
                "Total with tax: " + totalTax);

    }
}
