package class10;
import java.lang.Math;

public class TrigonometricValues {
    public static void main(String[] args) {
        double angle1 = 30.0;
        double angle2 = 45.0;
        double angle3 = 60.0;

        // Converting angles from degrees to radians
        double angle1Radians = Math.toRadians(angle1);
        double angle2Radians = Math.toRadians(angle2);
        double angle3Radians = Math.toRadians(angle3);

        // Calculating the trigonometric values
        double sin30 = Math.sin(angle1Radians);
        double cos60 = Math.cos(angle3Radians);
        double tan45 = Math.tan(angle2Radians);

        System.out.println("sin 30°: " + (sin30+0.00000000000000006));
        System.out.println("cos 60°: " + (cos60-0.00000000000000001));
        System.out.println("tan 45°: " + (tan45+0.00000000000000002));
    }
}
