import java.util.*;
public class neon_no
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value:");
        int n=sc.nextInt();
        int k=n*n;
        int h=k;
        int a=0,b=0;
        while(h>0)
        {
            a=h%10;
            b+=a;
            h=h/10;
        }
        if(n==b)
        System.out.print("It is a Neon number");
        else
        System.out.print("It is not a Neon number");
    }
}
