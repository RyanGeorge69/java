import java.io.*;
public class Ryan
{
    public static void main()throws IOException
    {
        String Name;
        int a,b,total;
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.print("Enter your name ");
        Name=in.readLine();
        System.out.print("enter the value of a ");
        a=Integer.parseInt(in.readLine());
        System.out.print("enter the value of b ");
        b=Integer.parseInt(in.readLine());
        total=a+b;
        System.out.print("total of a+b is "+total);
    }
}
