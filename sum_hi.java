package exam;
import java.util.*;
public class sum_hi
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[20];
        int sum=0,Bn=0;
        System .out.println("Enter 20 elements:");
        for(int i=0;i<20;i++)
        {    a[i]=sc.nextInt();
            sum+=a[i];
            if(Bn<a[i])
                Bn=a[i];
        }
        System.out.println("The sum all the elements:"+sum);
        System.out.println("The bigest elements:"+Bn);
    }

}
