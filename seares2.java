import java.util.*;
public class seares2
{
    public static void main()
    {
        int n,s=0,x=1,a;
        Scanner sc = new Scanner(System.in);
        System.out.println("What numder do you want to use as 'a' ");
        a=sc.nextInt();
        System.out.println("Till what number do you want add");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                s=s-(int)(Math.pow(a,i))/x;
            }
            else
            {
                s=s+(int)(Math.pow(a,i))/x;
            }
            System.out.println(s);
        }
    }
}
