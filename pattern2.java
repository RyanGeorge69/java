package class10;
public class pattern2
{
    public static void main()
    {
        int n=5,p=5;
        
        for (int i = 1; i <= n; i++) 
        {
            for(int sp=1;sp<=p;sp++)
            {
                System.out.print(" ");
            }
            p--;
            for(int j=1;j<=i;j++)
            System.out.print("* ");
            System.out.println();
        }
        int q=5;
        n=5;
        for (int i = 5; i <= n; i++) 
        {
            for(int sp=0;sp<=q;sp++)
            {
                System.out.print(" ");
            }
            q--;
            for(int j=1;j<=i;j++)
            System.out.print("* ");
            System.out.println();
        }
        
    }
}
