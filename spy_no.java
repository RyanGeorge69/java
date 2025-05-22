import java.util.*;
public class spy_no
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value:");
        int n=sc.nextInt();
        
        int s=0,f=1,k=n;
        while(k>0)
        {
            s+=k%10;
            f*=k%10;
            k=k/10;
        }
        
        if(s==f)
        System.out.print("It is a spy number");
        else 
        System.out.print("It is not a spy number");
    }
}
