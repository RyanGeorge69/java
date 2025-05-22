package exam;

public class KboatPattern2
{
    public static void main(String args[]) {
        System.out.println("Pattern 1: ");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Pattern 2: ");
        
        char ch = 'A';
        for (int i = 0; i < 5; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print((char)(65 + j) + " ");
            }
            System.out.println();
        }
    }
}