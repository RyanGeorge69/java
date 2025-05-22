package class10;
import java.util.*;
public class manu_drive
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter \n1 for composite no. \n2 for the smallest no. of a digit");
        int n=sc.nextInt();
        switch(n)
        {
            case 1:
                int value;
                System.out.print("Enter a value:");
                value=sc.nextInt();
                System.out.print("its facter:");
                for(int i=2;i<value;i++)
                {
                    if(value%i==0)
                    {
                        System.out.print(i+",");
                    }
                }
                System.out.println();
                break;
            case 2:
                System.out.print("Enter a value:");
                int no=sc.nextInt();
                int smallest=9;
                while(no>0)
                {
                    int rem=no%10; 
                    if(rem<smallest)
                    {
                        smallest=rem;
                    }
                    no/=10;
                }
                System.out.println("Smallest no.:"+smallest);
                break;
            default:
                System.out.println("Wrong input");
                break;
                
        }
    }
}