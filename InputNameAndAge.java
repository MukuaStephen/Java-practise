
import java.util.Scanner;

public class InputNameAndAge
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello, " + name + "!");
        System.out.println("Next year, you will be " + (age + 1) + " years old.");
    }
}