package class10;
import java.util.*;
public class hi
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter\n1 for Factors\n2 for Factorial");
        int n=sc.nextInt();
        switch(n)
        {   case 1:
                int value;
                System.out.print("Enter a value:");
                value=sc.nextInt();
                int t=value;
                System.out.print("its facter:");
                for(int i=1;i<value;i++)
                {
                    if(value%i==0)
                    {
                        System.out.print(i+",");
                    }
                }
                break;
            case 2:
                int f=1;
                int num;
                System.out.print("Enter a value:");
                num=sc.nextInt();
                for(int i=1;i<=num;i++)
                {
                    f*=i;
                }
                System.out.print("Fatorial="+f);
                break;
            default:
                System.out.print("Wrong input");
        }
    }
}