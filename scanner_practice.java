import java.util.*;
public class scanner_practice
{
    public static void main()
    {
        int age;

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Election Program");

        System.out.print("Enter your age....:");
        age=sc.nextInt();

        System.out.println("You have entered the age....:"+age);

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