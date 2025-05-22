package exam;

/**
 * 1 
 * 1 2 
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 */
public class ajf
{
    public static void main()
    {
        for (int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print(j+" ");
            System.out.println();
        }
        System.out.print("\n\n\n");
        String[] letters = {"B", "L", "U", "E"};
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(letters[j] + " ");
            }
            System.out.println();
        }

    }

}

