package Array1;

class payment
{
	double amount;
	String date;
	String transaction_id;
	public payment(double amount, String date, String transaction_id) {
		super();
		this.amount = amount;
		this.date = date;
		this.transaction_id = transaction_id;
	}
	double getAmount() {
		return amount;
	}
	void setAmount(double amount) {
		this.amount = amount;
	}
	String getDate() {
		return date;
	}
	void setDate(String date) {
		this.date = date;
	}
	String getTransaction_id() {
		return transaction_id;
	}
	void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}
	void display()
	{
		System.out.println("Amount: "+amount);
		System.out.println("Date: "+date);
		System.out.println("Transaction ID: "+transaction_id);
	}
	
}
class CreditCard extends payment
{
	int card_number;

	public CreditCard(double amount, String date, String transaction_id, int card_number) {
		super(amount, date, transaction_id);
		this.card_number = card_number;
	}

	int getCard_number() {
		return card_number;
	}

	void setCard_number(int card_number) {
		this.card_number = card_number;
	}
	
	void display()
	{
		super.display();
		System.out.println("Card Number: "+card_number);
	}
}
class UPIPayment extends payment
{
	int upi_id;

	public UPIPayment(double amount, String date, String transaction_id, int upi_id) {
		super(amount, date, transaction_id);
		this.upi_id = upi_id;
	}

	int getUpi_id() {
		return upi_id;
	}

	void setUpi_id(int upi_id) {
		this.upi_id = upi_id;
	}
	
	void display()
	{
		super.display();
		System.out.println("UPI ID: "+upi_id);
	}
}
class CashPayment extends payment
{
	String currency_type;

	public CashPayment(double amount, String date, String transaction_id, String currency_type) {
		super(amount, date, transaction_id);
		this.currency_type = currency_type;
	}

	String getCurrency_type() {
		return currency_type;
	}

	void setCurrency_type(String currency_type) {
		this.currency_type = currency_type;
	}
	
	void display()
	{
		super.display();
		System.out.println("Currency: "+currency_type);
	}
}
public class TestpaymentMenthod 
{
	public static void main(String[] args) {
		CashPayment[] p;
		p=new CashPayment[2];
		p[0]=new CashPayment(34000, "03/02/2025", "fsfd32274313", "4554555");
		p[1]=new CashPayment(34000, "03/02/2025", "fsfd32274313", "4554555");
		
		for (int i = 0; i < p.length; i++) {
			p[i].display();
			System.out.println();
		}
		
	}
}
