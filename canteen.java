import java.util.*;
public class canteen
{
    //  *** KRISHNA CANTEEN ***
    // *************
    // 1. Samosa
    // 2. Pizza
    // 3. Burger
    // 4. Exit
    // Enter your choice: 6

    public static void main(String args[])
    {
        int n, qty, bill;
        Scanner sc = new Scanner(System.in);
        System.out.println("*** KRISHNA CANTEEN ***");
        System.out.println("************");
        System.out.println("1. Samosa");
        System.out.println("2. Pizza");
        System.out.println("3. Exit");
        System.out.println("Enter your choice....:");
        n=sc.nextInt();

        switch(n)
        {
            case 1:
                System.out.println("SAMOSA selected (20/-) !");
                System.out.print("Samosa qty...:");
                qty=sc.nextInt();
                bill=qty*20;
                System.out.println("Your Bill....:"+bill);
                break;
            case 2:
                System.out.println("Pizza selected ! (60/-)!");
                System.out.print("Pizza qty...:");
                qty=sc.nextInt();
                bill=qty*60;
                System.out.println("Your Bill....:"+bill);
                break;
            case 3:
                System.out.println("Good Bye!");
                break;
            default:
                System.out.println("Invalid Input"); 
        }

    }
}