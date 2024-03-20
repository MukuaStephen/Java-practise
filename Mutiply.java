import java.util.Scanner;
    public class Mutiply
     {
        public double mutiply(double length,double width,double height)
        {
            return length*width*height;
        }
        public static void main(String[]args)
        {
           System.out.println("Enter the length, width and height of the cuboid");
           Scanner scanner=new Scanner(System.in);
            Mutiply obj=new Mutiply();
            System.out.println("Enter the length of the cuboid");
            double length=scanner.nextDouble();
             System.out.println("Enter the width of the cuboid");
             double width=scanner.nextDouble();
             System.out.println("Enter the height of the cuboid");
             double height=scanner.nextDouble();
             double result=obj.mutiply(length,width,height);
             System.out.println("The volume of the cuboid="+result);
             scanner.close();

        }
    }

