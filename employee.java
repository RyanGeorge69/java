package exam;
import java.util.*;
public class employee
{
    int eno,age,basic;
    double net;
    String ename;
    Scanner sc=new Scanner(System.in);
    void accept()
    {
        System.out.print("Enter your mobile no.=");
        eno=sc.nextInt();
        System.out.print("Enter your Name=");
        ename=sc.next();
        System.out.print("Enter your age=");
        age=sc.nextInt();
        System.out.print("Enter your Salary=");
        basic=sc.nextInt();
    }

    void calculate()
    {
        if(age<=50)
        {
            double har=0.185*basic;
            double da=0.1745*basic;
            double pf=0.081*basic;
            net=basic+har+da-pf;
        }
        else
        {
            double har=0.185*basic;
            double da=0.1745*basic;
            double pf=0.081*basic;
            net=basic+har+da-pf+5000;
        }
    }

    void print()
    {
        System.out.println("Your name="+ename);
        System.out.println("Your Mobile no.="+eno);
        System.out.println("Your age is="+age);
        System.out.println("Your salary is="+basic);
        System.out.println("Your net salary is="+net);
    }
    public static void main()
    {
        employee ob1=new employee();
        ob1.accept();
        ob1.calculate();
        ob1.print();
    }
}
