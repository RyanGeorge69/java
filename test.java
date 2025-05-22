package class10;
import java.util.*;
public class test
{
    private static int charge=0;
    private static int t=4;
    public static void main()
    {
        for(int i=1;i<=5;i++)
        {
            charge=charge+500;
            if(i==5)
                t=t-5;
        }
        System.out.println(charge);
        System.out.println(t);

    }
}
