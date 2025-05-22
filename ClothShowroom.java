package exam;
import java.util.Scanner;

public class ClothShowroom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter total cost of items purchased: ");
        double totalCost = input.nextDouble();
        
        double discount = 0;
        String assuredGift = "";
        
        if(totalCost < 2000) {
            discount = 0.05;
            assuredGift = "Wall Clock";
        } else if(totalCost >= 2001 && totalCost <= 5000) {
            discount = 0.1;
            assuredGift = "School Bag";
        } else if(totalCost >= 5001 && totalCost <= 10000) {
            discount = 0.15;
            assuredGift = "Electric Iron";
        } else if(totalCost > 10000) {
            discount = 0.2;
            assuredGift = "Wrist Watch";
        }
        
        double discountedAmount = totalCost - (totalCost * discount);
        
        System.out.println("Discount: " + (discount * 100) + "%");
        System.out.println("Amount to be paid after discount: Rs. " + discountedAmount);
        System.out.println("Assured gift: " + assuredGift);
    }
}