package BankPRo;

public class SavingAccount extends Account
{
	
	private double INTEREST_Rate=0.04;

	public SavingAccount(int acc_no, String acc_name, double balance) 
	{
		super(acc_no,acc_name,balance);		
	}
	
	public void calculateInterest()
	{
		double Interest=balance*INTEREST_Rate;
		
		balance = balance+Interest;
		System.out.println("Interest added"+Interest);
	}
	
}
