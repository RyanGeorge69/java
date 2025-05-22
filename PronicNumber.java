package class10;
import java.util.Scanner;

public class PronicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (isPronicNumber(number)) {
            System.out.println(number + " is a Pronic number.");
        } else {
            System.out.println(number + " is not a Pronic number.");
        }
    }
    
    public static boolean isPronicNumber(int number) {
        for (int i = 0; i <= Math.sqrt(number); i++) {
            if (i * (i + 1) == number) {
                return true;
            }
        }
        
        return false;
    }
}
