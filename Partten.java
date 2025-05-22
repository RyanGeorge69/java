package exam;
import java.util.*;
public class Partten
{
    public static void main()
    {
        System.out.println("Pattern 1");
        for(int i=5;i>=1;i--)
        {
            for(int j=5;j>=i;j--)
                System.out.print(j);
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        String a[]={"HELLO","HELL","HEL","HE","H"};
        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
      
    }
}
