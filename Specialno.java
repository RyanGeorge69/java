package class10;
import java.util.Scanner;
public class Specialno 
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Two digit No.:");
        int no=sc.nextInt();
        int sum=0,v,k=0,m=no;   
        while(m>0)
        {
            k=m%10;
            sum+=k;
            m/=10;
        }   
        m=no;
        int f=1;
        while(m>0)
        {
            k=m%10;
            f*=k;
            m/=10;
        }
        if((sum+f)==no)
        System.out.println("It is a Special to-digit no.");
        else
        System.out.println("It is not a Special to-digit no.");
        
    }
}

