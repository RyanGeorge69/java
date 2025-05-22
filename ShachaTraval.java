package class10;
import java.util.*;;
public class ShachaTraval
{
    private String n;
    private int cha;
    Scanner sc=new Scanner(System.in);
    private double dis;
    private double
    net;
    void accept()
    {
        System.out.print("Enter your name ");
        n=sc.next();
        System.out.print("Enter the charge of the ticket ");
        cha=sc.nextInt();
    }

    void calculate()
    {
        if(cha<25000)
        {
            dis=0.02;
        }
        else if(cha>25000 && cha<=35000)
        {
            dis=0.1;
        }
        else if(cha>35000 && cha<=55000)
        {
            dis=0.12;
        }
        else if(cha>55000 && cha<=70000)
        {
            dis=0.16;
        }
        else if(cha>70000)
        {
            dis=0.18;
        }
        net=cha-(cha*dis);
    }

    void display()
    {
System.out.println("Name\tTicket charge\tDiscount\tNet charge");
System.out.println(n+"\t"+cha+"\t\t"+(dis*100)+"\t\t"+net);
    }

    public static void main()
    {
        ShachaTraval ob1=new ShachaTraval();
        ob1.accept();
        ob1.calculate();
        ob1.display();
    }
}
