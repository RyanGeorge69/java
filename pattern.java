package class10;
import java.lang.*;
public class pattern
{
    public static void main(String[] args) 
    {
        int n = 5,p=0; // Change this value to adjust the pattern size
        
        // Print the upper half of the pattern
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= n - i + 1; j++) 
            {
                System.out.print(j);
            }
            
            for (int k = 1; k <=p; k++) 
            {
                System.out.print(" ");
            }
            p+=2;
            for (int j = n - i + 1; j >= 1; j--) 
            {
                System.out.print(j);
            }
            
            System.out.println();
        }
        
        // Print the lower half of the pattern
        int m=7;
        for (int i = n - 1; i >= 1; i--) 
        {
            for (int j = 1; j <= n - i + 1; j++) 
            {
                System.out.print(j);
            }
            
            for (int k = 1; k < m; k++) 
            {
                System.out.print(" ");
            }
            m-=2;
            for (int j = n - i + 1; j >= 1; j--) 
            {
                System.out.print(j);
            }
            
            System.out.println();
        } 
    }
}
