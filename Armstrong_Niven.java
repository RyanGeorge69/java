package class10;
import java.util.Scanner;

public class Armstrong_Niven
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        MainLoop: while (true)
        {

            System.out.println("---------MENU---------");
            System.out.println("1. Check whether a given number is an Armstrong Number");
            System.out.println("2. Check whether a given number is a Niven Number");
            System.out.println("3. Exit");

            System.out.print("\nEnter your choice: ");
            int ch = sc.nextInt();
            System.out.println();
            switch (ch)
            {
                case 1:
                {
                    long n,sum,d,p;
                    System.out.println("A number is an Armstrong number, if the sum of cubes of the digits is equal to the original number.\n");
                    System.out.print("Enter a number: ");
                    n = sc.nextLong();
                    System.out.println();
                    p=n;
                    sum=0;

                    do
                    {
                        d=n%10;
                        sum+=d*d*d;
                        n=n/10;
                    }
                    while(n!=0);

                    if (sum==p)
                        System.out.println(p+" is an Armstrong number");
                    else
                        System.out.println(p+" is not an Armstrong number");
                   
                    System.out.println();
                    break;
                }
                case 2:
                {
                    System.out.println("A Niven Number is a number which is divisible by the sum of its digits.\n");
                    System.out.print("Enter a number: ");
                    long n = sc.nextLong();
                    System.out.println();
                   
                    long m=n;
                    long d=0;
                    while(m!=0)
                    {
                        d += m%10;
                        m = m/10;
                    }
                    if(n%d==0)
                    {
                        System.out.println(n+" is a Niven Number");
                    }
                    else
                    {
                        System.out.println(n+" is not a Niven Number");
                    }
                    System.out.println();
                    break;
                }
               
                case 3:
                {
                    break MainLoop;
                }
                default:
                {
                    System.out.println("Invalid Choice");
                }
            }
        }
        System.out.println("Program ends.");
    }
}