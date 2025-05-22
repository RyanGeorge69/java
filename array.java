import java.util.*;
/**
1
0
5
43
7
32
532
774
34
662
53
2
79
3
4
2
4
5
1
2
 */
public class array
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 20 values");
        int a[]=new int [20];
        int max,min,sum=0;
        for(int i=0;i<20;i++)
        {
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        min=a[1];
        max=a[15];
        for(int i=0;i<20;i++)
        {
            if(a[i]>max)
            max=a[i];
            if(a[i]<min)
            min=a[i];
        }
        System.out.println("The largest number is "+max);
        System.out.println("The Smallest number is "+min);
        System.out.println("The sum of all the elements is "+sum);
    }
}
