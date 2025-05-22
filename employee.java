import java.util.*;
public class employee
{
    Scanner sc=new Scanner(System.in);
    long eno;
    String ename;
    int age;
    double basic,net,da,pf,hre;
    
    void accept()
    {
        System.out.print("Enter your name:");
        ename=sc.next();
        System.out.print("Enter your phone no.:");
        eno=sc.nextLong();
        System.out.print("Enter age:");
        age=sc.nextInt();
        System.out.print("Enter your basic:");
        basic=sc.nextDouble();
    }
    
    void calculate()
    {
        hre=0.185*basic;
        da=0.1745*basic;
        pf=0.081*basic;
        net=basic+hre+da-pf;
        if(age>=50)
        net+=5000;
    }
    
    void print()
    {
        System.out.println("eno\tename\tage\tbasic\tnet");
        System.out.println(eno+"\t"+ename+"\t"+age+"\t"+basic+"\t"+net);
    }
    
    public static void main()
    {
        employee ob=new employee();
        ob.accept();
        ob.calculate();
        ob.print();
    }
}
