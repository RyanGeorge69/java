import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int numRows = scanner.nextInt();
        
        // Generate Pascal's Triangle
        int[][] triangle = generatePascalsTriangle(numRows);
        
        // Print Pascal's Triangle
        printPascalsTriangle(triangle);
    }
    
    public static int[][] generatePascalsTriangle(int numRows) {
        int[][] triangle = new int[numRows][];
        
        for (int i = 0; i < numRows; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1; // First element in each row is always 1
            
            for (int j = 1; j < i; j++) {
                // Calculate value using the previous row
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
            
            triangle[i][i] = 1; // Last element in each row is always 1
        }
        
        return triangle;
    }
    
    public static void printPascalsTriangle(int[][] triangle) {
        System.out.println("Pascal's Triangle:");
        
        for (int i = 0; i < triangle.length; i++) {
            // Print leading spaces to make triangle shape
            for (int j = 0; j < triangle.length - i; j++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            
            System.out.println();
        }
    }
}
