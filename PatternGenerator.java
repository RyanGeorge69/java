package class10;

public class PatternGenerator 
{
    public static void main(String[] args) 
    {
        int n = 5;

        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                if (j % 2 == 0) 
                {
                    System.out.print("* ");
                } 
                else 
                {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
}
