package class10;
import java.util.*;
import java.lang.*;
public class Triangle_areas
{  
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type 1 to find the area of Equilateral triangle");
        System.out.println("Type 2 to find the area of Isosceles triangle");
        System.out.println("Type 3 to find the area of Scalene triangle");
        int choice = sc.nextInt();

        switch (choice) 
        {
            case 1: 
                System.out.print("Enter s: ");
                double a=sc.nextDouble();
                double ar1=Math.pow(a,2)*(Math.sqrt(3)/4);
                System.out.print("The ares is : "+ar1);
                break;
            case 2:
                System.out.print("Enter a: ");
                double h=sc.nextDouble();
                System.out.print("Enter b: ");
                double b=sc.nextDouble();
                double ar2=(0.25*b)*Math.sqrt(4*(Math.pow(h,2))-Math.pow(b,2));
                System.out.print("The ares is : "+ar2);
                break;
            case 3:
                System.out.print("Enter the length of side a: ");
                double A = sc.nextDouble();

                System.out.print("Enter the length of side b: ");
                double B = sc.nextDouble();

                System.out.print("Enter the length of side c: ");
                double C = sc.nextDouble();
                double s = (A+B+C) / 2;
                double area = Math.sqrt(s *(s-A)*(s-B)*(s-C));
                System.out.println("The area of the scalene triangle is: " + area);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
