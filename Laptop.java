package class10;
import java.util.*;
public class Laptop
{
    String name;
    double price,dis,amt;
    void accept(String name1,double price1)
    {
        name=name1;
        price=price1;
    }

    void calculate()
    {
        if(price<=25000)
            dis=0.05;
        else if(price>25000 && price<=50000)
            dis=0.075;
        else if(price>50000 && price<=1000000)
            dis=0.1;
        else if(price>1000000)
            dis=0.15;
        amt=price-(price*dis);
    }

    void display()
    {
        System.out.print("Your name:"+name);
        System.out.print("Your inital value:"+price);
        System.out.print("Your discount:"+dis);
        System.out.print("Your final amount:"+amt);
    }
}
