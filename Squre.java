package class10;
import java.util.*;
public class Squre
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        double a[]=new double[10];
        double b[]=new double[10];
        for(int i=0;i<10;i++)
        {
            System.out.print("Enter a value:");
            a[i]=sc.nextInt();
            b[i]=Math.pow(a[i],2);
        }
        System.out.println();
        System.out.println("Squre of all the elements are:");
        for(int i=0;i<10;i++)
        {
            System.out.print(b[i]+"  ");
        }
    }
}