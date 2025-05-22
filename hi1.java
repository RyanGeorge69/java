package class10;
import java.util.*;
public class hi1
{
    Scanner sc=new Scanner(System.in);
    static int age;
    static String name;
    void student()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.print("Enter your name ");
            name=sc.next();
            System.out.print("Enter your age ");
            age=sc.nextInt();
        }
    }

    public static void main()
    {
        System.out.println("St.name \t St.age");
        System.out.print(name+"\t"+age);
    }
}
