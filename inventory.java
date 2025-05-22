

public class inventory
{
    int phone;

    double price;
    double net;
    double dis;
    String customername;
    public void accept(String na, int p,double pri)
    {
        customername=na;
        phone=p;
        price=pri;
    }

    public void calcuate()
    {
        if (price>=50000)
        {
            dis=price*0.05;
        }
        else
        {
            dis=price*0.25;
        }
        net=price-dis;
    }
    
    public void display()
    {
        System.out.println("your price is "+price);
        System.out.println("your discount is "+dis);
    }
}
