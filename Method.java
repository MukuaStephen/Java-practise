class Calculator
{
    public int add(int n1,int n2,int n3)
    {
        return n1+n2+n3;
    }
}
class Advance extends Calculator
{
    public int add(int n1,int n2,int n3)
    {
        return n1+n2+n3+5;
    }
}
public class Method
{
    public static void main(String[]args)
    {
        System.out.println("Enter the values");
        Advance obj=new Advance();
         int r1=obj.add(5,6,7);
        System.out.println("The sum of the values are=" +r1);
    }
}

