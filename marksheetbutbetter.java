import java.util.*;
public class marksheetbutbetter
{
    String name;
    int rollno;
    double sub1,sub2,sub3,total,per;
    Scanner sc=new Scanner(System.in);
    void input()
    {
        System.out.print("Enter your name:");
        name=sc.next();
        System.out.print("Enter your roll number:");
        rollno=sc.nextInt();
        System.out.print("Enter the marks for subject 1(out of 100):");
        sub1=sc.nextDouble();
        System.out.print("Enter the marks for subject 2(out of 100):");
        sub2=sc.nextDouble();
        System.out.print("Enter the marks for subject 3(out of 100):");
        sub3=sc.nextDouble();
    }
    void calculate()
    {
        total=sub1+sub2+sub3;
        per=total/3;
    }
    void display()
    {
        System.out.println();
        System.out.println("students name is "+name);
        System.out.println("students roll number is "+rollno);
        System.out.println("Marks in subject 1 is "+sub1);
        System.out.println("Marks in subject 2 is "+sub2);
        System.out.println("Marks in subject 3 is "+sub3);
        System.out.println("Total marks out of 300 is "+total);
        System.out.println("Percentage of the stubent is "+per);
    }
    public static void main()
    {
        marksheetbutbetter ob=new marksheetbutbetter();
        ob.input();
        ob.calculate();
        ob.display();
    }
}
