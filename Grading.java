import java.util.Scanner;
public class Grading
{
public static void main(String[]args)
{
 Scanner scanner=new Scanner(System.in);
 System.out.println("Please enter your marks");
 int marks=scanner.nextInt();
 if(marks>=70 && marks<100)
 {
    System.out.println("Score=A");
 }
 else if(marks >=60 && marks < 70)
 {
   System.out.println("Score=B");
}
else if(marks>=50 && marks<60)
{
    System.out.println("Score=C");
}
else if(marks>=40 && marks<=50)
{
     System.out.println("Score=D");
}
else if(marks>=0 && marks<40)
{
    System.out.println("Score=FAIL");
}
else if (marks<0 && marks>100)
{
    System.out.println("INVALID MARKS");
}
}
}

