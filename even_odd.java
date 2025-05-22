package exam;
import java.util.*;
public class even_odd
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[20];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<20;i++)
        {
            a[i]=sc.nextInt();
        }

        int sumE=0;
        int sumO=0;

        for(int i=0;i<20;i++)
        {
            if(a[i]%2==0)
                sumE+=a[i];
            else
                sumO+=a[i];
        }

        System.out.println("Sum of all the even no.:"+sumE);
        System.out.println("Sum of all the odd no.:"+sumO);
    }
}