package ATM5;

class Shabab_account extends Infocient {
	private double balance;
	
	public Shabab_account(String first_name, String last_name, String addres, String accounts, String gender,
			double balance) {
		super(first_name, last_name, addres, accounts, gender, password, balance, balance, balance, balance);
		this.balance = balance;
	}

	
	public double getBalance() {
		return balance;
	}

	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
