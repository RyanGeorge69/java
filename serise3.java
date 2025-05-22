package class10;
import java.util.*;
public class serise3
{
    public static void main()
    {
        int s=1,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        n=sc.nextInt();
        for(int i =1;i<=n;i++)
        {
            s=s*i;
        }           
        System.out.println(s);
    }
}
