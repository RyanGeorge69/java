package class10;import java.util.*;
public class RailwayTicket
{
    String name;
    String coach;
    long mobno;
    int amt;
    int totalamt;

    void accept() 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = in.nextLine();
        System.out.print("Enter coach: ");
        coach = in.nextLine();
        System.out.print("Enter mobile no: ");
        mobno = in.nextLong();
        System.out.print("Enter amount: ");
        amt = in.nextInt();
    }

    void update() {
        if(coach.equalsIgnoreCase("First_AC"))
            totalamt = amt + 700;
        else if(coach.equalsIgnoreCase("Second_AC"))
            totalamt = amt + 500;
        else if(coach.equalsIgnoreCase("Third_AC"))
            totalamt = amt + 250;
        else if(coach.equalsIgnoreCase("Sleeper"))
            totalamt = amt;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Coach: " + coach);
        System.out.println("Total Amount: " + totalamt);
        System.out.println("Mobile number: " + mobno);
    }

    public static void main(String args[]) {
        RailwayTicket obj = new RailwayTicket();
        obj.accept();
        obj.update();
        obj.display();
    }
}