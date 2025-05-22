package class10;
import java.util.*;
public class seleciton_search
{
    
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        boolean flage=false;
        int s;
        int a[]={74,56,62,77,46,67,59,80,42,26};
        System.out.print("What no. do you want to search:");
        s=sc.nextInt();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==s)
            flage=true;
        }
        if(flage==true)
        System.out.println("The element found");
        else
        System.out.println("The element not found");
    }
}