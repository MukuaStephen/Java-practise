class Calculator
{
    public int add(int n1,int n2,int n3)
    {
        return n1+n2+n3;
    }
    public int add1(int n1,int n3)
    {   
    return n1+n3;
    }
    public double add2(double d1,double d2,int n6)
    {
        return d1+d2+n6;
    }
}
public class Addition
{
    public static void main(String[]args)
    {
        Calculator obj=new Calculator();
        double r1=obj.add2(23.34536,231516.9089,7);
        System.out.println("The sum =: "+r1);
    }

}