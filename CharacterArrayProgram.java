package class10;
import java.util.Scanner;
public class CharacterArrayProgram {
    public static void main(String[] args) {
        // Declare a character array of size ten
        char[] charArray = new char[10];

        // Accept characters into the array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 characters:");
        for (int i = 0; i < 10; i++) {
            charArray[i] = scanner.next().charAt(0);
        }

        // Count and print the number of uppercase letters
        int uppercaseCount = 0;
        for (char c : charArray) {
            if (Character.isUpperCase(c)) {
                uppercaseCount++;
            }
        }
        System.out.println("Number of uppercase letters: " + uppercaseCount);

        // Count and print the number of vowels
        int vowelCount = 0;
        for (char c : charArray) {
            if (isVowel(c)) {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);
    }

    // Function to check if a character is a vowel
    private static boolean isVowel(char c) {
        char lowerC = Character.toLowerCase(c);
        return lowerC == 'a' || lowerC == 'e' || lowerC == 'i' || lowerC == 'o' || lowerC == 'u';
    }
}
