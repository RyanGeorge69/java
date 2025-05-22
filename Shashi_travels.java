package class10;

import java.util.*;
import java.util.Scanner;

public class Shashi_travels
{
    String name;
    double Ticket_charge;
    double Discount;
    double Net_amount;
    Scanner sc= new Scanner(System.in);
    void accept()
    {
        System.out.println("Welcome to Shashi travels");
        System.out.print("Enter your name: ");
        name= sc.nextLine();
        System.out.print("Enter the amount of the Ticket: ");
        Ticket_charge= sc.nextDouble();
    }

    void calculate()
    {
        if(Ticket_charge<25000)
        {
            Discount=0.02;
        }
        else if(Ticket_charge>=25001 && Ticket_charge <=35000)
        {
            Discount=0.1;
        }
        else if(Ticket_charge >=35001 && Ticket_charge <=55000)
        {
            Discount=0.12;
        }
        else if(Ticket_charge>=55001 && Ticket_charge<=70000)
        {
            Discount=0.16;
        }
        else if(Ticket_charge>70000)
        {
            Discount=0.18;
        }
        Net_amount=Ticket_charge-Ticket_charge*Discount;
    }

    void display()
    {
        System.out.println("Hello "+name);
        System.out.println("The Ticket price is "+Ticket_charge);
        System.out.println("Your discount is "+Discount);
        System.out.println("Your Net amount is "+Net_amount);

    }

    public static void main()
    {   Shashi_travels ob1=new Shashi_travels();
        ob1.accept();
        ob1.calculate();
        ob1.display();
    }
}
