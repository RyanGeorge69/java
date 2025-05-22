package class10;
import java.util.*;
public class serise11
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter till what no you want the series to run:");
        int p=sc.nextInt();
        for(int i=1;i<=p;i++)
        {
            System.out.print(Math.pow(i,3)-1+"  ");
        }
    }
}
