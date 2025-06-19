package BankPRo;

import BankPRo.Account.*;
import java.util.*;

public class BankService 
{
	static Scanner sc=new Scanner(System.in);
	static List<Account>ac=new ArrayList<Account>();
	
	public static void main(String[] args) 
	{
		while(true) 
		{
			System.out.println("------WELCOME TO THE BANK SERVER------");
			System.out.println("1. Create a Account");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Calculate Interest");
			System.out.println("5. Display The Balance");
			System.out.println("6. End Of Day report");
			System.out.println("7. Exit");
			
			int choice=sc.nextInt();
			switch(choice) {					
				
			}
		}
	}
	static void createAccount() {
		System.out.println("Enter the account Number");
		int accNo=sc.nextInt();
		
		System.out.println("Enter account Holder Name");
		String accName=sc.next();
		
		System.out.println("1. Saving 2. Salary 3. Current 4. Loan");
		int type=sc.nextInt();
		
		Account acc=null;
		
		switch (type) {
		
		case 1:
		{
				System.out.print("Enter Balance:");
				double bal=sc.nextDouble();
				acc=new SavingAccount(accNo, accName, bal);
		}
		case 2:
		{
			 System.out.print("Enter Balance");
			 double bal=sc.nextDouble();
			 acc=new SalaryAccount(accNo, accName, bal);
		}
		case 3:{
			System.out.println("Enter balance");
			double bal=sc.nextDouble();
			System.out.println("Enter Overdraft Limit");
			double od=sc.nextDouble();
			acc=new CurrentAccount(accNo, accName, bal, od);
		}
		case 4:
		{
			System.out.println("Enter Balance");
			double loanamount=sc.nextDouble();
			acc=new LoanAccount(accNo, accName, loanamount);
				
		}
		default:System.out.println("Sorry Invalid Choice");
	}
	
}
}
