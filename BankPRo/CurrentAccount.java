package BankPRo;

public class CurrentAccount extends Account{
	private double overdraftlimit;

	public CurrentAccount(int acc_no, String acc_name, double balance, double overdraftlimit) {
		super(acc_no, acc_name, balance);
		this.overdraftlimit = overdraftlimit;
	}
	
	@Override
	public void withdrawn(double amount) {
		if(balance + overdraftlimit >= amount) 
		{
			balance=balance-amount;
			System.out.println("Withdrawn: ₹"+amount);
		}
		else 
		{
			System.out.println("Overdraft Limit Exceeded");
		}
	}
//	void calculateInterest() {
//		System.out.println("No Intersted for current Accounts");
//	}
//	
	
}
