package class10;
import java.util.*;
public class serise7
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        /**System.out.print("Enter a no. till what you the power:");
        int n=sc.nextInt();*/
        System.out.print("Enter a no.:");
        int a =sc.nextInt();
        long s=0; 
        for(int i =1;i<=a;i++)
        {
            s=s+(a+i);
        }
        System.out.println(s);
    }
}
