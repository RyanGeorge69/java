package class10;
import java.util.*;
public class Railway_ticket
{
    String name;
    String coach;
    long mobno;
    int amt;
    int totalamt;
    Scanner sc=new Scanner(System.in);
    void accept()
    {
        System.out.print("Your Name:");
        name=sc.next();
        System.out.print("Your mobile no.:");
        mobno=sc.nextLong();
        System.out.print("Your coach:");
        coach=sc.next();
        System.out.print("Your amount:");
        amt=sc.nextInt();
    }
    String extra;
    void update()
    {
        System.out.println("for first_Ac class=700 Rs(added)\nfor secont_Ac=500 Rs(added)\nfor third_Ac=250 Rs(added)\nfor sleeper=0 Rs(added)");
        System.out.println("Enter f=first class\ns=second class\nt=third class\nsl=sleeper\n");
        extra=sc.next();
        if(extra.equals("f"))
        {
            totalamt=amt+700;
        }
        else if(extra.equals("s"))
        {
            totalamt=amt+500;
        }
        else if(extra.equals("t"))
        {
            totalamt=amt+250;
        }
        else if(extra.equals("sl"))
        {
            totalamt=amt;
        }
    }

    void display()
    {   
        System.out.println("your name:"+name+"\nYour mobile no.:"+mobno+"\nYour total amount:"+totalamt+"\nyour coach:"+coach);
    }
    
    public static void main()
    {
        Railway_ticket ob=new  Railway_ticket();
        ob.accept();
        ob.update();
        ob.display();
    }
}