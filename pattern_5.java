public class pattern_5
{
    public static void main()
    {
        int x=5;
        for(int i=1;i<=5;i++)
        {
            for(int sp=1;sp<=x;sp++)
            {
                System.out.print(" ");
            }
            x--;
            
            
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }       

    }
}