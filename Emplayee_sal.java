package class10;
import java.util.*;
public class Emplayee_sal
{
    String name,empno;
    int basic;
    double da,hra,pf,gs,net;
    Emplayee_sal(String name,String empno,int basic)
    {
        name=name;
        empno=empno;
        basic=basic;
    }
    void compute()
    {
        da=basic*0.3;
        hra=basic*0.15;
        pf=basic*0.12;
        gs=basic+da+hra;
        net=gs-pf;
    }
    void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Employee Numder:"+empno);
        System.out.println("Gross Salary:"+gs);
        System.out.println("Net Salary:"+net);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String nm,enm;
        int dsal;
        System.out.println("Enter Employee's name:");
        nm=sc.next();
        System.out.println("Enter Employee's mobile no.:");
        enm=sc.next();
        System.out.println("Enter Employee's salary:");
        dsal=sc.nextInt();
        Emplayee_sal od=new Emplayee_sal(nm,enm,dsal);
        od.compute();
        od.display();
    }
}
