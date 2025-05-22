
import java.util.*;
public class patten_7
{
    public static void main(String arg[])
    {
        for(int i=1;i<=4;i++)
        {
            for(int sp=4;sp>i;sp--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++)
        {
            for(int sp=1;sp<=i;sp++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<5-i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
