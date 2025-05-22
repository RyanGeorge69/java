import java.util.*;
import java.math.*;
public class scanner_practice1
{
    public static void main()
    {
        int age;

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Election Program");

        System.out.print("Enter your age....:");
        age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("You are eligible");
        }
        else
        {
            System.out.println("No, You are not eligible");
        }

    }
}