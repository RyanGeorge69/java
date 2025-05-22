import java.util.*;
public class Shasha_travels
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number customer ");
        int n=sc.nextInt();
        String name[]=new String[n];
        int charge[]=new int[n];
        double dis[]=new double[n];
        double netamt[]=new double[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter your "+(i+1)+" Name");
            name[i]=sc.next();
            System.out.print("Enter Ticket charge:");
            charge[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(charge[i]<=25001)
                dis[i]=0.02;
            else if(charge[i]>=25001 && charge[i]<=35000)
                dis[i]=0.1;
            else if(charge[i]>=35001 && charge[i]<=55000)
                dis[i]=0.12;
            else if(charge[i]>=55001 && charge[i]<=70000)
                dis[i]=0.16;
            else if(charge[i]>70000)
                dis[i]=0.18;
        }
        for(int i=0;i<n;i++)
        {
            netamt[i]=charge[i]-(dis[i]*charge[i]);
        }
        
        System.out.println("Sno,\tname,\tcharge,\tdiscount\tNetAmount");
        for(int i=0;i<n;i++)
        {
            System.out.println((i+1)+"\t"+name[i]+"\t"+charge[i]+"\t"+dis[i]+"\t"+netamt[i]);
        }
    }
}