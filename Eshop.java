package exam;
import java.util.*;
public class Eshop
{
    String name;
    double price,dis,netamount;
    Scanner sc=new Scanner(System.in);
    void accept()
    {
        System.out.print("Entar the name of the item...:");
        name=sc.next();
        System.out.print("Enter the amount you paid....:");
        price=sc.nextDouble();
    }
    void calculate()
    {
        if(price>=1000 && price<=25000)
        {
            dis=0.05;
            netamount=price-(price*dis);
        }
        else if(price>=25001 && price<=57000)
        {
            dis=0.075;
            netamount=price-(price*dis);
        }
        else if(price>=57001 && price<=100000)
        {
            dis=0.1;
            netamount=price-(price*dis);
        }
        else if (price>=100001)
        {
            dis=0.15;
            netamount=price-(price*dis);
        }
        else
        {
            System.out.println("Wrong input");
        }
    }
    void display()
    {
        System.out.println("\n");
        System.out.println("The name of the item...:"+name);
        System.out.println("The price of the item before the disount...:"+price);
        System.out.println("your discount on the item....:"+dis*100);
        System.out.println("Your price after the discount...:"+netamount);
    }
    public static void main()
    {
        Eshop ob1=new Eshop();
        ob1.accept();
        ob1.calculate();
        ob1.display();
    }
}
