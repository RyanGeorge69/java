public class student
{
    //Date member
    int roll;
    int phone;
    int english;
    int mathematice;
    int hindi;
    int ans;
    String name;
    String grade;
    double per;

    //member methods
    public void accept(int r,String n,String g, int eng, int math, int hin, int p)
    {
        roll=r;
        name=n;
        grade=g;
        english=eng;
        mathematice=math;
        hindi=hin;
        phone=p;
    }
    
    public void calcuate()
    {
        ans=(english+mathematice+hindi);
        per=ans/3;
    }
    
    public void display()
    {
        System.out.println("your roll no. is "+roll);
        System.out.println("your name is "+name);
        System.out.println("your grade is "+grade);
        System.out.println("your phone no. is "+phone);
        System.out.println("english marks is "+english);
        System.out.println("math marks is "+mathematice);
        System.out.println("hindi marks is "+hindi);
        System.out.println("Total is "+ans);
        System.out.println("your percantage is "+per);
    }
}
