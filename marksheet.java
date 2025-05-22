
public class marksheet
{
    public static void main(int roll, String name, int s1, int s2, int s3)
    {
        System.out.println("Your roll no. is "+roll);
        System.out.println("Your Name is "+ name);
        System.out.println("Your sudject 1 marks is "+s1);
        System.out.println("Your sudject 2 marks is "+s2);
        System.out.println("Your sudject 3 marks is "+s3);
        System.out.println("Your total marks is "+(s1+s2+s3));
        System.out.println("Your percentage is "+(s1+s2+s3/3));
    }
}