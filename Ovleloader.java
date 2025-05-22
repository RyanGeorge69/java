package class10;
import java.util.*;
import java.io.*;
import java.lang.*;
public class Ovleloader
{
    double area(double a,double b,double c)
    {
        double s=(a+b+c)/2;
        double ar = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(ar);
        return ar;
    }

    double area(int a, int b, int hight)
    {
        double are=hight*(a+b)*0.5;
        System.out.println(are);
        return are;
    }

    double area(double diagonal1,double diagonal2)
    {
        double area=0.5*diagonal1*diagonal2;
        System.out.println(area);
        return area;
    }
    
}
