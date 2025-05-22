package class10;
import java.util.*;
public class niven
{
    public static void main(int num)
    {
        Scanner sc = new Scanner(System.in);
        int s=0,d,p;
        //System.out.println("Enter a no. ");
        //num = in.nextInt();
        p=num;
        while(num>0)
        {
            d=num%10;
            s=s+d;
            num=num/10;
        }
        if(p%s==0)
        {
            System.out.println("It is a Niven");
        }
        else
        {
            System.out.println("It is not a Niven");
        }
    }
}
