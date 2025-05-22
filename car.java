
public class car
{
    String company;
    int price;
    int seatcap;
    
    void usage()
    {
        company="hyundai";
        price=700000;
        seatcap=5;
        
        System.out.println("company is "+company);
        System.out.println("price is  "+price);
        System.out.println("seat capacit is "+seatcap);
        
    }
    public static void main()
    {
        System.out.println("welcome to car dealer");
        car ob1=new car();
        ob1.usage();
    }
    
}
