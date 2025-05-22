package class10;
import java.util.*;
public class binary_search
{
    public static void main()
    {
        int a[]={12,31,42,45,64,65,76,81,87,92};
        Scanner sc=new Scanner(System.in);
        int t;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        int lb=0, ub=a.length-1, mid;
        int s;
        boolean flag=false;
        System.out.println("Enter a no. you want to serch:");
        s=sc.nextInt();
        while(lb<=ub)
        {
            mid=(lb+ub)/2;

            if(a[mid]==s)
            {
                flag=true;
                break;
            }
            else if(a[mid]>s)
            {
                ub=mid-1;
            }
            else if(a[mid]<s)
            {
                lb=mid+1;
            }
        }

        if(flag==true)
        {
            System.out.println("Element is found");
        }
        else
        {
            System.out.println("Element is not found");
        }
    }
}

