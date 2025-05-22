package class10;
import java.util.*;
public class arraf
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int p[]=new int[6];
        int q[]=new int[4];
        int r[]=new int[10];
        System.out.println("For the first arry");
        for(int k=0;k<6;k++)
        {   
            System.out.print("Enter a value ");
            p[k]=sc.nextInt();
        }
        int o=0;
        System.out.println("For the second arry");
        for(int l=6;l<10;l++)
        {
            System.out.print("Enter a value ");
            q[o]=sc.nextInt();
            o++;
        }
        
        
        for(int i=0;i<6;i++)
        {
            r[i]=p[i];
        }
        o=0;
        for(int j=6;j<10;j++)
        {
            r[j]=q[o];
            o++;
        }
        
        for(int k=0;k<10;k++)
         
            System.out.print(r[k]+" ");
        
    

    }
}