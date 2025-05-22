package class10;
import java.util.*;
public class SpecialTwoDigitNumber
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a two digit number :");
        int a=sc.nextInt();
        
        int x=a/10;
        int y=a%10;
        int sum =x+y;
        int pro=x*y;
        int Sp=sum+pro;
        /*System.out.println(x);
        System.out.println(y);
        System.out.println(sum);
        System.out.println(pro);
        System.out.println(Sp);*/
        if(Sp==a)
        {
            System.out.println("It is a special number");
        }
        else
        {
            System.out.println("It is not a special number");
        }
    }
}
