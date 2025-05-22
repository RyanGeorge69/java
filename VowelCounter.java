package exam;
import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input from the user
        System.out.print("Enter a word: ");
        String word = scanner.nextLine().toLowerCase(); // Convert the word to lowercase for case-insensitivity

        // Call the countVowels method and display the result
        int vowelCount = countVowels(word);
        System.out.println("Number of vowels: " + vowelCount);

        // Close the scanner
        scanner.close();
    }

    // Function to count the number of vowels in a word
    private static int countVowels(String word) {
        int count = 0;

        // Iterate through each character in the word
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }
}
