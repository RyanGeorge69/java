package class10;
import java.util.*;
public class volume
{
    Scanner sc=new Scanner(System.in);
    double volume(double R)
    {
        double v;
        v=(4/3)*(22/7)*R*R*R;
        System.out.println(v);
        return v;
    }

    double volume(double H,double R)
    {
        double vo;
        vo=(22/7)*(R*R)*H;
        System.out.println(vo);
        return vo;
    }
    double volume(double H,double L,double B)
    {
        double vol;
        vol=L*B*H;
        System.out.println(vol);
        return vol;
    }
    public static void main()
    {
        volume ob=new volume();
        ob.volume(10);
        ob.volume(10,5);
        ob.volume(10,5,25);
    }
}
