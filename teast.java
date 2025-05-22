package class10;

public class teast
{
    public static void main()
    {
        int num=41;
        int square=41*41;
        int numDigits = (int) Math.log10(num) + 1;
        System.out.println(numDigits);
        int lastDigits = square % (int) Math.pow(10, numDigits);
        System.out.println(lastDigits);
    }
}