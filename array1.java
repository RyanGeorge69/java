package class10;
import lang.stride.*;
import java.util.*;
public class array1
{
    static public void main()
    {
        Scanner sc =  new  Scanner(System.in);
        int s = 0;
        int n = 20;
        int[] a =  new  int[n];
        int i = 0;
        while (i < n) {
            System.out.print("Enter the value :");
            a[i] = sc.nextInt();
            i = i + 1;
        }
        int j = 0;
        while (j < n) {
            if (a[j] % 3 == 0 || a[j] % 5 == 0) {
                s = s + a[j];
            }
            j = j + 1;
        }
        System.out.println("The sum of the multiple of 3 and 5 is:" + s);
    }
}
