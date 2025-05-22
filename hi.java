package exam;
import java.util.*;
public class hi
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value:");
        int a=sc.nextInt();

        int sum=0;
        int k=a*a;
        while(k>0)
        {
            int b=k%10;
            sum+=b;
            k/=10;
        }
        if(a==sum)
            System.out.print("It is a neon no.");
        else 
            System.out.print("It is not a neon no.");
    }
}
