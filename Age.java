import java.util.Scanner;
public class Age
{
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        String name;
        int num1,num2,result;
        System.out.println("Please enter your name");
        name=scanner.nextLine();
        System.out.println("Enter the numbers you wish to mutiply");
        num1=scanner.nextInt();
        num2=scanner.nextInt();
        result=num1*num2;
        System.out.print("Hello, "+name);
        System.out.println(" "+num1 + " and "+num2+"="+result);
    }
}
