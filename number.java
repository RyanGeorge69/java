//a program to  display squre and cube of the numder
import java.util.*;
public class number
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b,sq,cb;
        System.out.println("Enter two numders ");
        a=sc.nextInt();
        b=sc.nextInt();
        if(a!=b)
        {
            
            if(a<b)
            {
                sq=a*a;
                cb=b*b*b;
            }
            else
            {
                sq=b*b;
                cb=a*a*a;
            }
            System.out.println("The squre of smaller number is "+sq);
            System.out.println("The cube of the bigger number is "+cb);
        }
        else
        {
            sq=a*a;
            cb=a*a*a;
            System.out.println("Both number is same, the answer is of it in squre "+sq);
            System.out.println("Both number is same, the answer is of it in cube "+cb);
        }
    }

}