
public class fastiveshop
{
    String CustomerName;
    String Product Name;
    double PurchaseAmount ;
    double Disc;

    double Net;

    void Inputvalue(String cn,String pn,double PA)
    {
        CustomerName=cn;
        Product Name=pn;
        PurchaseAmount=PA;
    }

    void calculate()
    {
        if (PurchaseAmount <=2000)
        {
            Disc=0.05;
        }
        else if (PurchaseAmount>=2001)
        {
            Disc=0.10;
        }
        Net=PurchaseAmount-Disc;
    }
    void Display()
    {
        System.out.println("your name is "+CustomerName);
        System.out.println("Your Product Name  is "+ProductName );
        System.out.println("Your discount is "+Disc+"%");
        System.out.println("Your net peice is "+Net);
    }
}
