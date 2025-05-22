import  java.util.*;
public class Telcall
{
    long phno;
    String name;
    int n;
    double amt;
    Telcall()
    {
        phno=0;
        name="";
        n=0;
        amt=0;
    }
    Scanner sc=new Scanner(System.in);
    void acept()
    {
        System.out.print("Enter your name:");
        name=sc.next();
        System.out.print("Enter your phone no.:");
        phno=sc.nextLong();
        System.out.print("Enter your number of calls:");
        n=sc.nextInt();
    }

    void compute()
    {
        if(n>=1 && n<=100)
        amt=500;
        else if(n>100 && n<=200)
        amt=500+((n-100)*1);
        else if(n>200 && n<=300)
        amt=600+((n-200)*1.2);
        else if(n>300)
        amt=720+((n-300)*1.5);
    }
    
    void dispdata()
    {
        System.out.println("Your Phone no.:"+phno);
        System.out.println("Your name:"+name);
        System.out.println("The no. of class you made:"+n);
        System.out.println("The Amount to pay:"+amt);
    }
}
