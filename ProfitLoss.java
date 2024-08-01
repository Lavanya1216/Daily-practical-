package method;

import java.util.Scanner;

public class ProfitLoss{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the cost price: ");
        int costPrice = scanner.nextInt();

        System.out.print("Enter the selling price: ");
        int sellingPrice = scanner.nextInt();

        if (sellingPrice > costPrice) {
            System.out.println("Profit");
        } else if (sellingPrice < costPrice) {
            System.out.println("Loss");
        } else {
            System.out.println("No profit, no loss.");
        }

        scanner.close();
    }
}  
