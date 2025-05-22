package class10;
import java.util.*;
public class a
{
    public static void main()
    {
        int a[]=new int[15];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<15;i++)
        {
            System.out.print("Enter a value:");
            a[i]=sc.nextInt();
        }
        System.out.print("Unsorted array:");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-1-i;j++)
            {
                int t=0;
                if(a[j]>a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println("Sorted array:");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}