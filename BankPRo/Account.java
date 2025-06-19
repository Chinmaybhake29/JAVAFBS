package BankPRo;

class Account {
	int acc_no;
	String accholder_name;
	double balance;
	
	public Account()
	{
		this.acc_no=0;
		this.accholder_name="null";
		this.balance=0.0;
	}
	public Account(int acc_no, String acc_name, double balance) {
		super();
		this.acc_no = acc_no;
		this.accholder_name = acc_name;
		this.balance = balance;
	}
	
	void deposit(double amount) {
		balance = balance+amount; 
		System.out.println("Deposited: ₹"+amount);
	}
	
	void withdrawn(double amount)
	{
		if(balance >= amount) 
		{
			balance = balance - amount;
			System.out.println("Withdrawn: ₹"+amount);
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
	
	void display()
	{
		System.out.println("Balance: "+balance);
	}
}
