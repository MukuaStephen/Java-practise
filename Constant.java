import java.util.Scanner;
public class Constant
{
        final float  PI = 3.1415926f;
        public float volume(float radius, float  height) 
        {
            return PI *radius*radius*height;
        }
        public static void main(String[]args)
        {
            System.out.println("Calculate the volume of the cylinder");
            Scanner scanner=new Scanner(System.in);
            Constant obj=new Constant();
            System.out.println("Enter the radius of the cylinder");
            float radius=scanner.nextFloat();
            System.out.println("Enter the height of the cylinder");
            float height=scanner.nextFloat();
            float result=obj.volume(radius,height);
            String formattedResult=String.format("%.3f",result );
            System.out.println("The volume of the cylinder= "+formattedResult+" units cubed.");
            scanner.close();

        } 
        
}