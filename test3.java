import java.util.*;
public class test3

{
    public static void main()
    {
        String name;
        int math,scince,ca;
        double total;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your name");
        name=sc.next();
        System.out.print("math marks ");
        math=sc.nextInt();
        System.out.print("scince marks ");
        scince=sc.nextInt();
        System.out.print("ca marks ");
        ca=sc.nextInt();
        total=math+scince+ca;
        System.out.println("total marks is "+total); 
       
    }
}
