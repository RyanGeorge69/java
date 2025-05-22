import java.util.*;
public class patten_1
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter n....:");
        n=sc.nextInt();
        for(int r=1;r<=n;r++)
        {
            for(int c=1;c<=n;c++)
            {
                System.out.print(c);
            }
            System.out.println(" ");
        }
    }
}
