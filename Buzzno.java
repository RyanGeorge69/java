import java.util.*;
public class Buzzno
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1 to Check Buzz no\n\t2 to find the Greatest Common Divisor");
        int j=sc.nextInt();
        switch(j)
        {      
            case 1:
                System.out.print("Enter a value:");
                int n=sc.nextInt();
                boolean flage=false; 
                int z;
                z=n%10;
                if(z==7)
                    flage=true;
                if(n/7==0)
                    flage=true;

                if(flage==true)
                    System.out.print("It is Buzz number");
                else
                    System.out.print("It is not a Buzz number");
                break;
            case 2:
                System.out.print("Enter the first integer:");
                int num1 = sc.nextInt();

                System.out.print("Enter the second integer:");
                int num2 = sc.nextInt();
                while (num2 != 0) {
                    int temp = num2;
                    num2 = num1 % num2;
                    num1 = temp;
                }
                int gcd = num1;
                System.out.println("GCD is "+ gcd);

        }
    }
}