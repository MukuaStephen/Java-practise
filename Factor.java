import java.util.Scanner;
public class Factor
{
    public int factor(int x)
    {   
    if(x==0)
    {  
    return 1;
    }
    else
    {
        return x*factor(x-1);
    }
    }
    public static void main(String[]args)
    {  
        Scanner scanner=new Scanner(System.in);
        Factor obj= new Factor();
        System.out.println("Enter a number to find its factorial");
        int x=scanner.nextInt();
        int result=obj.factor(x);
        System.out.println("Factorial of "+x+" is = "+result);
        scanner.close();
    }
}
