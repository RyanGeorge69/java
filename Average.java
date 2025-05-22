package class10;
import java.util.*;
public class Average
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of students:");
        int N=sc.nextInt();
        String name[]=new String[N];
        double totalmarks[]=new double[N];
        double sum=0;
        for(int i=0;i<N;i++)
        {
            System.out.print((i+1)+")Students name:");
            name[i]=sc.next();
            System.out.print((i+1)+")Students Total marks:");
            totalmarks[i]=sc.nextInt();
            sum+=totalmarks[i];
        }
        double avrage=sum/N;
        double diviation[]=new double[N];
        for(int i=0;i<N;i++)
        {
            diviation[i]=totalmarks[i]-avrage;
            System.out.println("Student "+(i+1)+" diviation is "+diviation[i]);
        }
    }
}
