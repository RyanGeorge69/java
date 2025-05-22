package exam;
import java.util.*;
public class menu_driven
{
    Scanner sc=new Scanner(System.in);
    void a()
    {
        double r;
        r=sc.nextDouble();
        double pi;
        pi=3.14285714286;
        double ar;
        ar=pi*(Math.pow(r,2));
        System.out.println("The area of the circal is "+ar);
    }

    void b()
    {
        int l;
        System.out.print("Enter length ");
        l=sc.nextInt();
        int b;
        System.out.print("Enter breath ");
        b=sc.nextInt();
        int ar=l*b;
        System.out.println("Tne area of rectangle is "+ar);
    }

    void c()
    {
        int bas;
        System.out.print("Enter base ");
        bas=sc.nextInt();
        int hi;
        System.out.print("Enter hight ");
        hi=sc.nextInt();
        double ar;
        ar=.5*bas*hi;
        System.out.print("Tne area of triangle is  "+ar);
    }

    void d()
    {
        int a;
        System.out.print("Enter a side ");
        a=sc.nextInt();
        double ar;
        ar=Math.pow(a,2);
        System.out.print("Tne area of squre is  "+ar);    
    }
}

