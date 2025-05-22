// TABLE PROGRAM
import java.util.*;
public class Test99
{
    public static void main()
    {
        int n;
        System.out.println("Welcome to Loop");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value....:");
        n=sc.nextInt(); // 9
        
        for(int i=1;i<=20;i++)
        {
            System.out.println(n+" * "+i+" = "+(n*i));
            
        }
        
    }
}