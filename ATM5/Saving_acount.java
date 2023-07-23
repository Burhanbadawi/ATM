package ATM5;

public class Saving_acount extends Infocient {
	private double balance;
	
	public Saving_acount(String first_name, String last_name, String addres, String accounts, String gender,
			double balance) {
		super(first_name, last_name, addres, accounts, gender);
		this.balance = balance;
	}

	
	public double getBalance() {
		return balance;
	}

	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
