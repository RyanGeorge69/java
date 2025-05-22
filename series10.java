package class10;

import java.util.*;
public class series10
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        double sum = 0.0;
        System.out.print("Enter till what no. do you want the program to work:");
        int n=sc.nextInt();
        System.out.print("Enter the value of A:");
        double a=sc.nextDouble();
        int j=1;
        for (int i = 1;i<= n;i+=2) 
        {
            if(j%2==0)
            sum -=Math.pow(a,i);
            else
            sum +=Math.pow(a,i);
            j++;
        }

        System.out.println("Sum of the series: " + sum);
    }
}
