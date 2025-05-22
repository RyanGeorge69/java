class pattern_6
{
    public static void main()
    {
        int i,j,k;
        for(i=1;i<=5;i++)
        {
            for(j=5;j>i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<=(2*i-1);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        for(i=4;i>=1;i--)
        {
            for(j=5;j>i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<=(2*i-1);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}