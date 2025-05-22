package class10;
import java.util.Scanner;
public class ISBN
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number ....:");
        long n=1401601499L;
        
        long r, p=10, x=0;
        System.out.println("ISBN validation");
       
        while(n>0)
        {
            r=n%10;
            x=x+r*p;
            p--;
            n=n/10;
        }
       
        System.out.println(x);
       
        if(x%11==0)
        {
            System.out.println("Yes, It is legal ISBN");
        }
        else
        {
            System.out.println("No, It is not legal ISBN");
        }
    }
}