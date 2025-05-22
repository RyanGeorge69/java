package exam;
import java.util.Scanner;

public class DoubleLetterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toUpperCase();

        int count = countDoubleLetterSequences(input);
        
        System.out.println("Number of double letter sequences: " + count);
    }
    
    public static int countDoubleLetterSequences(String input) {
        int count = 0;
        for (int i = 0; i < input.length() - 1; i++) {
            char currentChar = input.charAt(i);
            char nextChar = input.charAt(i + 1);
            if (currentChar == nextChar) {
                count++;
            }
        }
        return count;
    }
}
