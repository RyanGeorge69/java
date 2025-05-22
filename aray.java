package exam;
import java.util.*;
public class aray
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter teh size of the array:");
        int l=sc.nextInt();
        int a[]=new int[l];
        int Pc=0,Nc=0,Zc=0;
       
        System.out.println("Enter array elements:");
        for(int i=0;i<l;i++)
        a[i]=sc.nextInt();
        
        for(int i=0;i<l;i++)
        {
            if(a[i]>0)
            Pc++;
            else if(a[i]<0)
            Nc++;
            else
            Zc++;
        }
        
        System.out.println(Pc+" Positive Number");
        System.out.println(Nc+" Negitive Number");
        System.out.println(Zc+" zero");
    }
}
