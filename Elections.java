import java.util.Scanner;
String name;
int age;
public class Elections
{
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        name=scanner.nextLine();
        System.out.println("Enter your age");
        age=scanner.nextInt();
        if (age>=18)
        { 
        System.out.println("You are eligible for voting...Please proceed"); 
        }
        else
        {Sytem.out.println("You are not eligible for voting...You are a minor");
    }
    }
}
