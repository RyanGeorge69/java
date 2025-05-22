package exam;

import java.util.*;
public class sum
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Till what no. you want the sum to run:");
        int n=sc.nextInt();
        double sum=0; 
        for(int i=1,j=1;i<=n;i++,j+=2)
        {
            double f=1;
            for(int k=1;k<=i;k++)
                f*=k;
            sum+=j/f;
        }
        System.out.print(sum);
    }
}
