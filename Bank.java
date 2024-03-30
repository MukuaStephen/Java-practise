import java.util.Scanner;
class BankAccount
{
    public float deposit(float amount,float balance)
    {  
     return balance + amount; 
    }
    public float withdrawal(float amount,float balance)
    {
        return balance-amount;
    }
}    
    class SavingsAccount extends BankAccount
    {
        @Override
        public float withdrawal(float amount,float balance)
        {
            if(balance<amount ||balance<100 )
            {  
            System.out.println("You have insufficient funds to withdraw from your account or minimum balance to withdraw from your account");
            return balance;
            }
            else
            {
                return super.withdrawal(amount,balance);
            }
        }    
    }
    public class Bank
    {
        public static void main(String[]args)
        {   
            float amount,balance;
            int choice,pin;
            balance=1756.50f;
            pin=2023;
            Scanner scanner=new Scanner(System.in);
            BankAccount obj=new BankAccount();
            System.out.println("Welcome to Mobile Banking.");
            System.out.println("\t1.Deposit Money\n\t2.Withdraw Cash \n\t3.Balance Enquiries");
            choice=scanner.nextInt();
            switch(choice)
            {  
                case 1:
                System.out.println("Enter the Amount you want to Deposit");
                amount=scanner.nextFloat();
                balance=obj.deposit(amount,balance);
                System.out.println("Enter your pin");
                pin=scanner.nextInt();
                if(pin==2023)
                {
                    System.out.println("Your deposited amount is ksh. "+amount +" Thank You!");
                }
                else if(pin!=2023)
                {
                    System.out.println("Wrong Pin Entered! Try Again.");
                }
                break;
                
                case 2:
                System.out.println("Enter the amount you want to withdraw cash");
                SavingsAccount sObj = new SavingsAccount();
                amount=scanner.nextFloat();
                System.out.println("Enter the pin");
                pin=scanner.nextInt();
                if(pin==2023)
                {
                    float result=sObj.withdrawal(amount,balance);
                    System.out.println("Ksh."+amount+" has been withdrawn from your account. Your remaianing balance= Ksh."+result); 
                    balance=result;
                }
                else
                {
                    System.out.println("Insufficient balance or amount above  available balance or incorrect pin");
                }
                
                break;
                case  3:
                System.out.println("Enter your pin");
                pin=scanner.nextInt();
                if(pin==2023)
                {  
                System.out.println("Current Account Balance="+balance);
                }
                else
                {
                    System.out.println("Incorrect pin...Please try again later");
                }
                break;
                default:
                System.out.println("Invalid choice taken! Please try again");
                break;
            }
        } 
    }

