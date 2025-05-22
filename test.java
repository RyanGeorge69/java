import java.io.*;
public class test
{
    public static void main() throws IOException
    {
        int age;
        String a, b, total;

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.print("Enter your age...:");
        age=Integer.parseInt(in.readLine());

        System.out.print("Enter the first value ....:");
        a=in.readLine();

        System.out.print("Enter the second value ....:");
        b=(in.readLine());

        total=a+b;

        System.out.print("Total....:"+total);
    }
}

