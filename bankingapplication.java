package bankingApplication;
import java.util.Scanner;

public class bankingapplication 
{  
public static void main(String[] args) {
	BankAccount obj1=new BankAccount();
	obj1.showMenu();


}
}
class BankAccount
{  
	int bal;
	int previousTransaction;
	String accountholdername;
	int CustomerId;	
void deposit(int amount)
	{
	if(amount!=0)
	{
		bal=bal+amount;
		previousTransaction=-amount;
			
	} 
	
	else
	{
		System.out.println("Invalid Amount please enter positive amount");
		
	}
	
}

	
	void withdraw(int amount) 
	{
    	if(bal>=amount)
		{
			bal=bal-amount;
			System.out.println("your withdraw  successfully");
			previousTransaction=-amount;
			
    	}
    	else
    	{
		System.out.println("Not sufficient balance");
		System.out.println("Your availabe balance is:"+bal);
	    }

} 
		void getpreviousTransaction()
		{
			if(previousTransaction>0)
			{
			System.out.println("Deposited:"+previousTransaction);
		    }
		    else if(previousTransaction<0)
		    {
			System.out.println("Withdrawn:"+Math.abs(previousTransaction));
		    }
		    else 
		    {
			System.out.println("No Transaction occurred");
		    }
		}
void showMenu()
{
	int option;
	Scanner obj =new Scanner(System.in);
	System.out.println("Enter Account Holder name:");
	String accountholdername=obj.nextLine();
	System.out.println("Welcome "+accountholdername );
	System.out.println("Enter Account Number:");
	long CustomerId=obj.nextLong();
	System.out.println("your Account No is "+CustomerId);
	System.out.println("\n");
	System.out.println("1. Check Balance");	
	System.out.println("2. Deposit");
	System.out.println("3. Withdraw");
	System.out.println("4. PreviousTransaction");
	System.out.println("5. Exit");
	do
	{
	     System.out.println("Enter an option");	
		 option=obj.nextInt();
		 System.out.println("\n");
		 
		 
   switch(option)
    {
		 case 1:
		 {
		    System.out.println(" Availabe Balance:"+bal);
			System.out.println("\n");
              break;
		 }
		 case 2:
		 {	
			System.out.println("Enter an amount to deposit");
			int amount=obj.nextInt();
			deposit(amount);
			System.out.println("Amount Deposited Successfully");
			System.out.println("\n");
            break;
		 }
		 case 3:
		 {	
			System.out.println("Enter an amount to withdraw");
			int amount2=obj.nextInt();
			withdraw(amount2);
			System.out.println("\n");
			break;
		 }
		 case 4:
		 {	
		      getpreviousTransaction();
		      System.out.println("Previous Transaction details"+previousTransaction);
 		      System.out.println("\n");
              break;
		 }
		 case 5:
		 {
			 System.out.println("Exit");
			 break;
		 }
        default:
       {
	
	          System.out.println("Invaid Option!!...Please enter again");

	          break;
        }
	} 
	}
	while(option!=5);{
		 System.out.println("ThankYou for using our services");
	}
}
}

		 

			
		
			