package exam;
import java.util.*;
public class employee2
{
    String ename;
    long eno;
    int age,basic;
    double net,hra,da,pf;
    Scanner sc=new Scanner(System.in);

    void accept()
    {
        System.out.print("Enter your name:");
        ename=sc.next();
        System.out.print("Enter your emplayee no.:");
        eno=sc.nextLong();
        System.out.print("Enter your age:");
        age=sc.nextInt();
        System.out.print("Enter your salary:");
        basic=sc.nextInt();
    }

    void calculate()
    {
        hra=0.185*basic;
        da=0.1745*basic;
        pf=0.081*basic;
        if(age>=50)
            net=basic+hra+da-pf+5000;
        else
            net=basic+hra+da-pf;
    }

    void print()
    {
        System.out.println(eno+"\t"+ename+"\t"+age+"\t"+basic+"\t"+net);
    }

    public static void main()
    {
        employee2 ob=new employee2();
        ob.accept();
        ob.calculate();
        ob.print();
    }
}
/*String ename;
    long eno;
    int age,basic;
    double net,hra,da,pf;
 * 
 */
/**
 * String name =name of the employee
 * long eno=employee
 * int age=age of the employee
 * int basic=salary of the employee
 * 
 * 
 */
