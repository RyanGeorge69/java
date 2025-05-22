package exam;
import java.util.*;
public class Array
{
    public static void main()
    {
        int a[]=new int[10];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            System.out.print("Enter the "+(i+1)+" no. for the arry;");
            a[i]=sc.nextInt();
        }
        System.out.println("array after sort");
        int t=0;
        /**for(int i=0;i<a.length;i++)
        {
        for(int j=0;j<a.length-i-1;j++)
        {
        if(a[j]>a[j+1])
        {
        t=a[j];
        a[j]=a[j+1];
        a[j+1]=t;
        }
        }
        }*/
        for(int j=0;j<a.length;j++)
        {
            for(int k=0;k<a.length-j-1;k++)
            {
                if(a[k]>a[k+1])
                {
                    t=a[k];
                    a[k]=a[k+1];
                    a[k+1]=t;
                }
            }
        }

        for(int m=0;m<10;m++)
        {
            System.out.print(a[m]+" ");
        }
    }
}
