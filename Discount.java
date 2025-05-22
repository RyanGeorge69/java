package class10;
import java.util.*;
public class Discount
{
    int cost;
    String name;
    double dc,amt;
    Scanner sc=new Scanner(System.in);
    void input()
    {
        System.out.print("Enter your name=");
        name=sc.next();
        System.out.print("Enter the coust of the item=");
        cost=sc.nextInt();
    }

    void cal()
    {
        if(cost<=5000)
        {
            dc=0;
        }
        else if(cost>5000 && cost<=10000)
        {
            dc=0.1;
        }
        else if(cost>10000 && cost<=15000)
        {
            dc=0.15;
        }
        else if(cost>15000)
        {
            dc=0.2;
        }
        amt=cost-(cost*dc);
    }

    void display()
    {
        System.out.println("Name of the customer \t Discount \t Amount to be paid");
        System.out.println(name+"\t"+(dc*100)+"\t"+amt);
            }
    public static void main()
    {
        Discount sc=new Discount();
        sc.input();
        sc.cal();
        sc.display();
    }
}

