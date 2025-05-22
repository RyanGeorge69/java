public class calcutaer
{

    public static void main(int x, int y, char op)
    {
        double a;
        System.out.println("welcom to my clacuaturl");
        System.out.println("sum of "+x+" and "+y);
        if(op=='+')
        {
            System.out.println(x+y);
        }
        else if (op=='-')
        {
            System.out.println(x-y);
        }
        else if (op=='*')
        {
            System.out.println(x*y);
        }
        else if(op=='/')
        {
            System.out.println(x/y);
        }
    }
}