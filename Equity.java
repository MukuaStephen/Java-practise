import java.util.Scanner;
public class Equity
{
    public static void main(String[]args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Welcome to M-PESA");
        int choice,amount,pin,option,agentNo,atmNo,paybill,balance;
        double account,till;
        String phoneNumber;
        pin=2022;
        balance=20000;
        till=54879;
        account=1123357;
        phoneNumber="+254742237930";
        atmNo=19052;
        agentNo=6000;
        paybill=572572;
        amount=2000;

    
            System.out.println("\t1.Send Money \n\t2.Withdraw Cash \n\t3. Buy Airtime \n\t4.Loans and Savings\n\t5.Lipa na M-PESA \n\t6.My Account");
            choice =scanner.nextInt(); 
             switch (choice)  
                {  
                     case 1 :
                          System.out.println("Enter phone no: ");
                          phoneNumber=scanner.nextLine();
                        
                          System.out.println("Enter Amount");
                          amount=scanner.nextInt();
                          System.out.println("Enter Pin");
                          if(pin==2022)
                          {   
                          System.out.println("Your request is being proccessed...Please wait!");
                          }
                          else if (pin!=2022)
                          {
                            System.out.println("Incorrect pin...Try again!");
                          }
                          break;  
                     case 2:
                            System.out.println("\n\t1.From agent \n\t2.From ATM");
                            option=scanner.nextInt();
                            if(option==1)
                            {
                                   System.out.println("Enter Agent No.");
                                   agentNo=scanner.nextInt();
                                   System.out.println("Enter amount");
                                   amount=scanner.nextInt();
                                   System.out.println("Enter Pin");
                                   pin=scanner.nextInt();
                                   if(pin==2022)
                                   {
                                          System.out.println("Your request is being processed...Please wait");                           
                                   }
                                   else if(pin!=2022)
                                   {
                                          System.out.println("Incorrect pin...Try again");
                                   }
                            }
                            else if(option==2)
                            {
                                   System.out.println("Enter ATM No.");
                                   atmNo=scanner.nextInt();
                                   System.out.println("Enter Pin");
                                   if(pin==2022)
                                   {
                                          System.out.println("Your request is being processed...Please wait!");
                                   }
                                   else if(pin!=2022)

                                   {
                                          System.out.println("Incorrect Pin..Try again!");
                                   }
                            }
                            break;
                     case  3:
                            System.out.println("\n\t1.My Phone \n\t2.Other Phone");
                            option=scanner.nextInt();
                            if(option==1)
                            {
                                   System.out.println("Enter Amount");
                                   amount=scanner.nextInt();
                                   System.out.println("Enter Pin");
                                   pin=scanner.nextInt();
                                   if(pin==2022)
                                   {
                                          System.out.println("Your request is being processed...Please wait!");
                                   }
                                   else if(pin!=2022)
                                   {
                                          System.out.println("Incorrect  pin..try again");
                                   }
                                   else if(option==2)
                                   {
                                          System.out.println("Enter the Phone number");
                                          String phone =scanner.nextLine();
                                          System.out.println("Enter Amount");
                                          amount=scanner.nextInt();
                                          System.out.println("Enter Pin");
                                          pin=scanner.nextInt();
                                          if(pin==2022)
                                          {   
                                          System.out.println("Confirmed,"+amount+"will be transferred to "+phone);
                                          }
                                          else if(pin!=2022)
                                          {
                                                 System.out.println("Incorrect pin...Please try again!");
                                          }

                                   }
                            }
                            
                            break;
                     case 4:
                            System.out.println("1.M-Shwari");
                            System.out.print("\n\t1.Send to M-Shwari \n\t2.Withdraw from M-Shwari \n\t3.Lock Savings Account \n\t4.Loan @ 9% for 30 days \n\t5.Check Balance \n\t6.Mini Statement ");
                            break;
                     case 5:
                            System.out.println("\n\t1.Paybill \n\t2.Buy Goods and Services \n\t3.Pochi la Biahara");
                            option=scanner.nextInt();
                            switch(option)
                            {
                                   case  1 :
                                   System.out.println("Enter Paybill  Number and Account Number");
                                   
                                   paybill=scanner.nextInt();
                                   System.out.println("Enter Account Number");
                                   account=scanner.nextDouble();
                                   System.out.println("Enter amount");
                                   amount=scanner.nextInt();
                                   if(pin==2022)
                                   {
                                   System.out.println("Amount Deposited Successfully!");
                                   }
                                   else if(pin!=2022)
                                   {
                                          System.out.println("Incorrect pin...Try again!");
                                   }
                                   break;

                                   case 2:
                                   System.out.println("Enter Till No.");
                                   till=scanner.nextDouble();
                                   System.out.println("Enter Amount");
                                   amount=scanner.nextInt();
                                   System.out.println("Enter Pin");
                                   pin=scanner.nextInt();

                                   if(pin==2022)
                                   {
                                          System.out.println("Confirmed,"+ amount +"has beeen sent");
                                   }
                                   else if(pin!=2022)
                                   {
                                          System.out.println("Incorrect pin...Try again!");
                                   }
                                    break;
                                   case 3 :
                                   System.out.println("Enter Phone No");
                                   phoneNumber=scanner.nextLine();
                                   System.out.println("Enter Pin");
                                   pin=scanner.nextInt();
                                   if(pin==2022)
                                   {  
                                   System.out.println("Transaction is in process..Please wait!");
                                   }
                                   else if(pin!=2022)
                                   {
                                          System.out.println("Incorrect Pin...Try again!");
                                   }
                                   break;
                                   default:
                                   System.out.println("INVALID INPUT");
                                   break;        
                            }

                            break;
                     case 6:
                            System.out.println("Check balance");
                            System.out.println("Enter pin");
                            pin=scanner.nextInt();
                            if(pin==2022)
                            {
                                   System.out.println("Your current Balance is "+balance);
                            }
                            else if(pin!=2022)
                            {
                                   System.out.println("Incorrect pin...Try again");
                            }
                            break;
                     default:
                            System.out.println("Invalid Choice! Please Enter Again.");
                            break;    
               }            
       }             
}


