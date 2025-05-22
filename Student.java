package exam;
import java.util.*;
public class Student
{
    String name,stream;
    int age;
    double mks;
    Scanner sc=new Scanner(System.in);
    void accept()
    {
        System.out.print("Enter your name:");
        name=sc.next();
        System.out.print("Enter your age:");
        age=sc.nextInt();
        System.out.print("Enter your tota marks:");
        mks=sc.nextDouble();
    }

    void allocation()
    {
        if(mks>=300)
            stream="Science and Computer";
        else if(mks<300 && mks>=200)
            stream="Commerce and Computer";
        else if(mks<200 && mks>=75)
            stream="Arts an Animation";
        else if(mks<75)
            stream="Try Again";
    }

    void print()
    {
        System.out.println("Students name:"+name);
        System.out.println("Students age:"+age);
        System.out.println("Students marks:"+mks);
        System.out.println("Students Stream allocated:"+stream);
    }
    public static void main()
    {
        Student od=new Student();
        od.accept();
        od.allocation();
        od.print();
    }
}
/**
 * String name=name of the student
 * int age=students age 
 * double mks = marks got by the student
 * String stream=the stream that the student has got
 */