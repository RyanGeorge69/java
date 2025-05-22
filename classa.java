package exam;
public class classa
{
    void display()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    void display(int n)
    {
        int temp=n;
        while(temp!=0)
        {
            int d=temp%10;
            System.out.println(Math.sqrt(d));
            temp/=10;
        }
    }
}
