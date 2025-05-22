import java.util.Scanner;

public class NameRearranger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your full name (surname first, followed by first name and middle name):");
        String fullName = scanner.nextLine();

        String[] nameParts = fullName.split(" ");

        if (nameParts.length == 3) {
            String surname = nameParts[2];
            String firstName = nameParts[0];
            String middleName = nameParts[1];
            
            System.out.println("Rearranged name: " + surname + " " + firstName + " " + middleName);
        } else {
            System.out.println("Please enter a valid full name containing three words.");
        }
    }
}
