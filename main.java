package class10;
import java.util.*;
public class main
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter \n1 for patten1\n2 for patten2\n");
        int n=sc.nextInt();
        switch(n)
        {
            case 1:
                for(char i='E';i>='A';i--)
                {
                    for(char j='A';j<=i;j++)
                    System.out.print(j);
                        System.out.println();
                    
                }
                break;
            case 2:
                String s="BLUE";
                for(int i=1;i<=4;i++)
                {
                    char ch=s.charAt(i-1);
                    for(int j=1;j<=i;j++)
                    System.out.print(ch);
                    System.out.println();
                }
                break;
            default:
                System.out.print("Wrong input");
                break;
        }
    }
}