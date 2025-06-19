package BankPRo;

public class SalaryAccount extends SavingAccount{
	int isActive=0;

	public SalaryAccount(int acc_no, String acc_name, double balance) 
	{
		super(acc_no, acc_name, balance);
		this.isActive=0;
	}
	
	void checkstatus()
	{
		if(isActive >= 2) 
		{
			System.out.println("Due to inActivity this Account is frozen"+acc_no);
		}
		else
		{
			System.out.println("Account is active");
		}
	}
	@Override
	
	void deposit(double amount)
	{
		super.deposit(amount);
		isActive=0;
	}
	
	@Override
	
	void withdrawn(double amount) {
		super.withdrawn(amount);
		isActive=0;
	}
}
