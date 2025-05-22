import java.io.*;
public class test2
{
    public static void main() throws IOException
    {
        int gender;

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.print("Enter your gender...:");
        gender=(in.read());  // accepts ascii code so we need to convert it into character form

        System.out.print("You have entered....:"+gender);

    }
}

