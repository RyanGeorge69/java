import java.util.*;
public class a
{
    public static void main()
    {
        System.out.println("Parten 1");
        
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            System.out.print(j);
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Parten 2");
        String a[]={"B","BL","BLU","BLUE"};
        for(int i=0;i<a.length;i++)
        System.out.println(a[i]);
    }
}
