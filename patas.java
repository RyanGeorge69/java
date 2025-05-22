import java.util.*;
public class patas
{
    public static void main()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        
        System.out.println("\n\n\nNew program");
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value:");
        int value=sc.nextInt();
        while(value>0)
        {
            int k=value%10;
            System.out.print(Math.sqrt(k));
            value=value/10;
            System.out.println();
        }
    }
}
