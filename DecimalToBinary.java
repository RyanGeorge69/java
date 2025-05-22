package class10;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();
        
        String binaryNumber = convertToBinary(decimalNumber);
        
        System.out.println("Binary equivalent: " + binaryNumber);
    }
    
    public static String convertToBinary(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
        }
        
        StringBuilder binary = new StringBuilder();
        
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binary.insert(0, remainder);
            decimalNumber /= 2;
        }
        
        return binary.toString();
    }
}
