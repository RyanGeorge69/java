package class10;
import java.util.*;
public class Binay_Search
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a[]={5,7,9,11,15,20,30,45,89,97};
        System.out.print("Enter a value you want to search:");
        int s=sc.nextInt();
        int lb=0,ub=a.length-1,mid;
        boolean flage=false;
        while(lb<=ub)
        {
            mid=(lb+ub)/2;
            if(a[mid]==s)
            {
                flage=true;
                break;
            }
            else if(a[mid]>s)
            ub=mid-1;
            else if(a[mid]<s)
            lb=mid+1;        
        }
        
        if(flage==true)
        System.out.println("Element found");
        else
        System.out.println("Element not found");
    }
}
