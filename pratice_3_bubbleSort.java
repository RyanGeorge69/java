package class10;
import java.util.*;
import java.io.*;
public class pratice_3_bubbleSort
{
    public static void main()
    {
        int a[]={14,365,643,73,357,367,764,63,687,11};
        int t=0;
        System.out.println("Oridinal Array....:");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        for(int i=0;i<a.length;i++)
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
        }

        /*for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-i-1;i++)
            {
                if(a[j]>a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;

                    /*t=a[i];
                    a[i]=a[j+1];
                    a[j+1]=t;
                }
            }
        }/*/
        System.out.println("\nSorted Array....:");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
