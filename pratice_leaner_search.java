package class10;
import java.util.*;
import java.io.*;

public class pratice_leaner_search
{
    public static void main()
    {
        int a[]={14,365,643,73,357,367,764,63,687,11};
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a value you want to search:");
        int b=sc.nextInt();
        boolean flage=false;
        for(int i=0;i<10;i++)
        {
            if(b==a[i])
            {
                flage=true;
            }
        }
        if(flage==true)
        {
            System.out.println("Found the element");
        }
        else
        {
            System.out.println("Found not the element");
        }
    }
}
