package exam;
import java.util.*;
public class ArmstrongNo
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int no=sc.nextInt();
        int sum=0;
        int t=no;
        while(t>0)
        {
            int n=t%10;
            sum+=(n*n*n);
            t/=10;
        }
        if(sum==no)
        System.out.print("It is an Armstrong No");
        else
        System.out.print("It is not an Armstrong No");
    }
}
