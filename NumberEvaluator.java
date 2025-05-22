package class10;
import java.util.Scanner;
import java.lang.Math;

public class NumberEvaluator 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        // (a) Natural logarithm of the number
        double naturalLog = Math.log(number);
        System.out.println("Natural Logarithm: " + naturalLog);

        // (b) Absolute value of the number
        double absoluteValue = Math.abs(number);
        System.out.println("Absolute Value: " + absoluteValue);

        // (c) Square root of the number
        double squareRoot = Math.sqrt(number);
        System.out.println("Square Root: " + squareRoot);

        // (d) Cube of the number
        double cube = Math.pow(number, 3);
        System.out.println("Cube: " + cube);

        // (e) Random numbers between 0 (zero) and 1 (one)
        double random = Math.random();
        System.out.println("Random Number: " + random);
    }
}

