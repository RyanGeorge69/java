import java.util.*;
public class squre_root
{
    public static void square()
    {
        double x;
        int z;
        int y;
        double a=2,b=3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. you want square or cude of it ");
        x=sc.nextInt();
        System.out.print("Enter 2 if you want to do squre \n"+"And enter 3 if you want to do cude ");
        z=sc.nextInt();
        if(z==a)
        {
            y=(int)(Math.pow(x,2));
            System.out.println("The squrs of the numder is "+y);
        }
        else if(z==b)
        {
            y=(int)(Math.pow(x,3));
            System.out.println("The cude of the numder is "+y);
        }
        else
        {
            y=(int)(Math.pow(x,z));
            System.out.println("The Answer is "+y );
        }
    }
    public static void squareroot()
    {
        double x;
        double y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. you want to Square root of ");
        x=sc.nextInt();
        y=Math.sqrt(x);
        System.out.print("The sqursroot of the numder is "+y);
    }
}

