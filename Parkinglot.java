package class10;
import java.util.*;

public class Parkinglot
{
    int vno,hours;
    double bill;
    Scanner sc = new Scanner(System.in);
    void input()
    {
        System.out.println("Enter Vehicle numder....:");
        vno=sc.nextInt();
        System.out.print("Enter numder of hours....:");
        hours=sc.nextInt();
    }
    void calculate()
    {
        if(hours<=1)
        bill=hours*3;
        else bill=3+(hours-1)*1.5;
    }
    void display()
    {
        System.out.println("Vehicla number....:"+vno);
        System.out.println("Time parcker(in hours)....:"+hours);
        System.out.println("Parking charges....:"+bill);
    }
    public static void main()
    {
        Parkinglot ob1=new Parkinglot();
        ob1.input();
        ob1.calculate();
        ob1.display();
    }
}
