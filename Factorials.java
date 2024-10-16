import java.util.Scanner;
public class Factorials
{
        public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a=scanner.nextInt();
        Factorials factor=new Factorials();
        int b=a;
        for(int c=1;c<a+1;c++)
        {
            int d=a%2;
            if(d==1)
            {
                int e=factor.minus(b);
                for(;e!=0;e--)
                {
                    System.out.print("");
                }
            }
            for(int f=1;f<c+1;f++)
            {
                int n=a%2;
                System.out.print(f);
                if(n==1)
                {
                    System.out.print("");
                }
            }
            b=b-1;
            System.out.print("\n");
        }
    }
    public int minus(int a)
    {
        if(a==1)
        {
            return 0;
        }
        else
        {
            return a-1;
        }
    }
}
