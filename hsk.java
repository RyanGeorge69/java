package exam;
import java.util.*;
public class hsk
{
    public static void min()
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[15];

        System.out.println("Enter the 15 values:");
        for(int i=0;i<15;i++)
        {
            arr[i]=sc.nextInt();
        }
        int t=0;
        for(int i=0;i<15;i++)
        {
            for(int j=0;j<15-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;}
            }
        }
        System.out.println("Aranged array");
        for(int i=0;i<15;i++)
        {
            System.out.println(arr[i]);
        }
    }
}