import java.util.Scanner;
public class Area
{
    final public float PI=3.142857143f;
    public float circle(float radius)
    {
        return PI*radius*radius;
    }
    public static void main(String[]args)
    {
        System.out.println("Calculate the area of the circle");
        Scanner scanner=new Scanner(System.in);
        Area obj=new Area();
        System.out.println("Enter the radius of the circle");
        float radius=scanner.nextFloat();
        double result=obj.circle(radius);
        String formattedResult=String.format("%.3f", result);
        System.out.println("The area of the circle="+formattedResult);
    }
}
