package class10;
import lang.stride.*;
import java.util.*;

/**
 * 
 */
public class Employee
{
    protected int pan;
    protected String name;
    protected double taxincome;
    protected double tax;
    protected double a;
    protected Scanner sc =  new  Scanner(System.in);

    /**
     * 
     */
    protected void input()
    {
        System.out.print("Enter your pan number....:");
        pan = sc.nextInt();
        System.out.print("Enter your name....:");
        name = sc.next();
        System.out.print("Enter your taxable income....:");
        taxincome = sc.nextDouble();
    }

    /**
     * 
     */
    protected void cal()
    {
        if (taxincome <= 250000) {
            System.out.println("You dont have Tax");
        }
        else if (taxincome >= 250001 && taxincome <= 500000) {
            a = taxincome - 250000;
            tax = 0.1 * a;
        }
        else if (taxincome >= 500001 && taxincome <= 1000000) {
            a = taxincome - 500000;
            tax = (0.2 * a) + 30000;
        }
        else if (taxincome >= 1000001) {
            a = taxincome - 1000000;
            tax = (0.3 * a) + 50000;
        }
    }

    /**
     * 
     */
    protected void display()
    {
        System.out.println("Your tax is.....:" + tax);
    }

    /**
     * 
     */
    static public void main()
    {
        Employee ob1 =  new  Employee();
        ob1.input();
        ob1.cal();
        ob1.display();
    }
}
