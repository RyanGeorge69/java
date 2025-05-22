import java.util.*;
public class Atransport
{
    String name;
    int w;
    int charge;
    Scanner sc=new Scanner(System.in);    
    void accept()
    {
        System.out.print("Enter your name:");
        name=sc.next();
        System.out.print("Enter the weight of the parcel(in kg):");
        w=sc.nextInt();
    }

    void calculate()
    {
        if(w<=10)
            charge=w*25;
        else if(w>10 && w<=30)
            charge=250+((w-10)*20);
        else if(w>30 )
            charge=650+((w-30)*10);
        charge=charge+(int)(charge*0.05);
    }

    void print()
    {
        System.out.println("Name\tWeight\tBill amount");
        System.out.println(name+"\t"+w+"\t"+charge);
    }
    
    public static void main()
    {
        Atransport ob=new Atransport();
        ob.accept();
        ob.calculate();
        ob.print();
    }
}
