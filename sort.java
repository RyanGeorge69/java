package class10;
import java.util.*;
public class sort
{
    public static void main()
    {
        int[] a=new int[10];
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<a.length;i++)
        {
            System.out.print("Enter the "+(i+1)+" no. :");
            a[i]=sc.nextInt();
        }

        System.out.println("Orignal arry");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int t=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]<a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }

        System.out.println("sorted arry");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
