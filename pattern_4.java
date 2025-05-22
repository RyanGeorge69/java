import java.util.*;
public class pattern_4
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int x, n;
        System.out.print("Input n...:");
        n=sc.nextInt();
        
        x=n;
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=x;j++)
            {
                System.out.print(j);
            }
            
            x--;
            System.out.println();
        }
        
        
        
        for(int m=2;m<=n;m++)
        {
            for(int p=1;p<=m;p++)
            {
               System.out.print(p); 
            }
            System.out.println();
        }
        
    }
}