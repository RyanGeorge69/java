package class10;
import java.util.*;
public class practice_arry
{
    public static void main()
    {
        int a[]={5,1,3,4,7,8,2,6,9,15};
        int t;
        /*for(int i=0;i<a.length;i++)
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


        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {t=a[j];
                a[j]=a[j+1];
                a[j+1]=t;}
            }
        }
        
        for(int j=0;j<a.length;j++)
        System.out.print(a[j]+" ");
    }
}
