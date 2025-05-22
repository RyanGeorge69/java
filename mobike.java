package class10;
import java.util.Scanner;

public class mobike
{
    private int bno;
    private int phno;
    private int days;
    private int charge;
    private String name;
    
    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        name = in.nextLine();
        System.out.print("Enter Customer Phone Number: ");
        phno = in.nextInt();
        System.out.print("Enter Bike Number: ");
        bno = in.nextInt();
        System.out.print("Enter Number of Days: ");
        days = in.nextInt();
    }
    
    public void compute() {
        if (days <= 5)
            charge = days * 500;
        else if (days <= 10)
            charge = (5 * 500) + ((days - 5) * 400);
        else
            charge = (5 * 500) + (5 * 400) + ((days - 10) * 200);
    }
    
    public void display() {
        System.out.println("Bike No.\tPhone No.\tName\tNo. of days \tCharge");
        System.out.println(bno + "\t" + phno + "\t" + name + "\t" + days 
            + "\t" + charge);
    }
    
    public static void main(String args[]) {
        mobike obj = new mobike();
        obj.input();
        obj.compute();
        obj.display();
    }
}