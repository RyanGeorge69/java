package exam;

/*Welcome to Pattern
1	
2	3	
4	5	6	
7	8	9	10	
11	12	13	14	15	
*/
public class patten
{
    public static void main(int n)
    {
        int k=1;
        System.out.println("Welcome to Pattern");
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(k+"\t");
                k++;
            }
            
            System.out.println();
        }
        
    }
}