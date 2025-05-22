package class10;
public class patten3
{
    public static void main()
    {
        int p=5;
        for(int i=1;i<=5;i++)
        {
            for(int sp=1;sp<=p;sp++)
            {
                System.out.print(" ");
            }
            p--;
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        int n=4;
        for (int i = n; i >= 1; i--) 
        {
            for (int j = 1; j <= n - i; j++) 
                System.out.print("  ");
            for (int k = i; k >= 1; k--) 
                System.out.print(k + " ");
            System.out.println();
        }
    }
}