package class10;
import java.util.*;
public class neon
{
    public static void main(/*int n*/)
    {
        Scanner sc=new Scanner(System.in);
        int n=0,p,s=0,d;
        System.out.print("Enter a no. ");
        //n=in.nextInt();
        p=n*n;

        while(n>0)
        {
            d=p%10;
            s=s+d;
            p=p/10;
        }
        if(s==n)
        {
            System.out.println("It is a Neon no.");
        }
        else
        {
            System.out.println("It is not a Neon no.");
        }
    }
}
