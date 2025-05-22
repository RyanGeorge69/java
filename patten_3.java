import java.util.*;
public class patten_3 
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter n....:");
        n=sc.nextInt();
        for(int m=1;m<=n;m++)
        {
            for(int p=1;p<=m;p++)
            {
                System.out.print(m); 
            }
            System.out.println();
        }
    }
}
