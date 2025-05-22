package class10;

import java.util.Random;

public class RandomNumberSum 
{
    public static void main(String[] args) 
    {
        int min = 11; 
        int max = 15; 
        int count = 7; 

        Random random = new Random();
        int sum = 0;

        System.out.print("Random Numbers: ");
        for (int i = 0; i < count; i++) 
        {
            int randomNumber = random.nextInt(max - min + 1) + min;
            System.out.print(randomNumber + " ");
            sum += randomNumber;
        }

        System.out.println("\nSum: " + sum);
    }
}
