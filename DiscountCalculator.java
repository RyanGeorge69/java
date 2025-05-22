package class10;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the cost of the article: ");
        double cost = scanner.nextDouble();

        double profitPercentage = 25.0;
        double discountPercentage = 25.0;

        // Calculating the selling price and marked price
        double markedPrice = cost * (100 + profitPercentage) / 100;
        double sellingPrice = markedPrice * (100 - discountPercentage) / 100;

        System.out.println("Marked Price: " + markedPrice);
        System.out.println("Selling Price: " + sellingPrice);
    }
}
