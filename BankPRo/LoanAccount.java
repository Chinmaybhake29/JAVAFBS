package BankPRo;

public class LoanAccount extends Account{
	private static final double INTEREST_Rate=0.1;


	public LoanAccount(int acc_no, String acc_name, double loanAmount) {
		super(acc_no, acc_name, -loanAmount);
		// TODO Auto-generated constructor stub
	}
	
	public void calculateInterest() {
		balance-=(-balance*INTEREST_Rate);
		balance=balance-INTEREST_Rate;
		System.out.println("Loan Interest added: "+INTEREST_Rate);
	}
	
	public void repay(double amount) {
		balance=balance+amount;
		System.out.println("Loan Approved: "+amount);
	}
	
}	

