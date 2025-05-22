import java.util.*;
public class Eshop
{
    String name;
    double price;
    double dis;
    Scanner sc=new Scanner(System.in);
    void accept()
    {
        System.out.print("Enter your name :");
        name=sc.next();
        System.out.print("enter you price :");
        price=sc.nextInt();
    }
    
    void calculate()
    {
        if(price>=1000 && price <=25000)
        dis=0.05;
        else if(price>25000 && price<=57000)
        dis=0.075;
        else if(price>57000 && price<=100000)
        dis=0.1;
        else if(price>100000)
        dis=0.15;
        price=price-(price*dis);
    }
    
    void display()
    {
        System.out.print("Your name:"+name);
        System.out.print("Your Discount:"+dis);
        System.out.print("Your price:"+price);
    }
    
    public static void main()
    {
        Eshop ob=new Eshop();
        ob.accept();
        ob.calculate();
        ob.display();
    }
}
