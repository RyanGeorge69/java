import java.util.*;
public class pattern
{
    public static void main()
    {
        System.out.println("Pattern 1");
        int n=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=n;j--)
                System.out.print(j+" ");
            System.out.println();
            n++;
        }
        n=5;
        System.out.println("\n");
         for (int i = 0; i < n; i++) 
         {   
            for (int j = 0; j < n - i; j++) 
            {
                char ch = (char) ('A' + i); 
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
