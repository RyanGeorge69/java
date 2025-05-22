
public class discount
{
    public static void main(String args[])
    {
        int cp=7200;
        double d1,d2,dis,amt;
        d1=cp-20.0/100.0;
        d2=(cp-d1)*10.0/100.0;
        dis=d1+d2;
        amt=cp-dis;
        System.out.println("Total dis "+dis);
        System.out.println("amount to pay "+amt);
    }
}
