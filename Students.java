package class10;
import java.util.*;
public class Students
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of students:");
        int n=sc.nextInt();
        int roll[]=new int[n];
        double sub1[]=new double[n];
        double sub2[]=new double[n];
        double sub3[]=new double[n];
        double average[]=new double[n];
        for(int i=0;i<n;i++)
        {
            roll[i]=i+1;
            System.out.println("Roll no. "+(i+1));
            System.out.print("Enter your subject 1 marks:");
            sub1[i]=sc.nextDouble();
            System.out.print("Enter your subject 2 marks:");
            sub2[i]=sc.nextDouble();
            System.out.print("Enter your subject 3 marks:");
            sub3[i]=sc.nextDouble();
            average[i]=(sub1[i]+sub2[i]+sub3[i])/3;
        }

        for(int i=0;i<n;i++)
        {
            if(average[i]>=85 && average[i]<=100)
                System.out.println("Excellent");
            else if(average[i]>=75 && average[i]<=84)
                System.out.println("DISTINCTION");
            else if(average[i]>=60 && average[i]<=74)
                System.out.println("FIRST CLASS");   
            else if(average[i]>=40 && average[i]<=59)
                System.out.println("PASS");
            else 
                System.out.println("POOR");
        }
    }
}
