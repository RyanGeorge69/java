import java.util.*;
public class Weight
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        double wei[]=new double[10];
        System.out.println("Enter the weight:");
        for(int i=0;i<10;i++)
            wei[i]=sc.nextDouble();
        double t=0;
        for(int i=0;i<10;i++)
            for(int j=0;j<10-i-1;j++)
                if(wei[j]<wei[j+1])
                {
                    t=wei[j];
                    wei[j]=wei[j+1];
                    wei[j+1]=t;
                }
        
        for(int i=0;i<10;i++)
        System.out.print(wei[i]+"  ");
    }
}
