package exam;
public class Hotel
{
    //String name;
    long mno;
    double bill;// 1000
    double gst=18/100;//1180
    double st=125/1000;//1125
    double tamt;//1305
    void accept(long phone_no, double b)
    {
        //name=name;
        phone_no=mno;
        bill=b;
    }
    void calculate()
    {
        gst=bill*18/100;
        st=bill*125/1000;
        tamt=bill+gst+st;
    }
    void display()
    {
        System.out.println("Your mobile numder is="+mno);
        System.out.println("The GST on the bill is="+(gst+bill));
        System.out.println("The service tax on the bill is="+(st+bill));
        System.out.println(tamt);
    }
    /*public static void main()
    {
        System.out.println("Welcom to the hotel");
        Hotel ob1=new Hotel();
        ob1.accept();
        ob1.calculate();
        ob1.display();
    }*/
}
/*
 * public static void main()
    {
        System.out.println("welcome to car dealer");
        car ob1=new car();
        ob1.usage();
    }
    
 */