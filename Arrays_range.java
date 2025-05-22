package class10;
import java.util.*;
public class Arrays_range
{
    public static void main()
    {
        int a[]=new int[20];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<20;i++)
        {
            System.out.print("Enter a value:");
            a[i]=sc.nextInt();
        }
        int min=a[1];
        int max=a[15];
        for(int i=0;i<20;i++)
        {
            if(a[i]<min)
            min=a[i];
            if(a[i]>max)
            max=a[i];
        }
        int range=max-min;
        System.out.println(range);
    }
}
