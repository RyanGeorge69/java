import java.util.*;
public class power_root
{
    public static void square()
    {
        double x;
        int y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. you want square of it ");
        x=sc.nextInt();
        y=(int)(Math.pow(x,2));
        System.out.print("The squrs of the numder is "+y);
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
