package ATM5;

public class Infocient {
	private String first_name;
	private String last_name;
	private String addres;
	private String accounts;
	private String gender;
	private int password;
    private double balance;
    private double amount;
    private  double withdraw;
    private double deposit;



	public Infocient(String first_name, String last_name, String addres, String accounts,String gender,int password,double balance,double amount,double withdraw,double deposit) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.addres = addres;
		this.accounts = accounts;
		this.gender = gender;
		this.password=password;
		this.balance=balance;
		this.amount=amount;
		this.withdraw=withdraw;
		this.deposit=deposit;
	}





	










	public String getFirst_name() {
		return first_name;
	}





	public String getLast_name() {
		return last_name;
	}





	public String getAddres() {
		return addres;
	}





	public String getAccounts() {
		return accounts;
	}



	public String getGender() {
		return gender;
	}

	

    public int getPassword() {
		return password;
	}

    
	
	public double getBalance() {
		return balance;
	}


	public double getAmount() {
		return amount;
	}

	
	public double getWithdraw() {
		return withdraw;
	}



	public double getDeposit() {
		return deposit;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}





	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}





	public void setAddres(String addres) {
		this.addres = addres;
	}





	public void setAccounts(String accounts) {
		this.accounts = accounts;
	}
	

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setPassword(int password) {
		this.password = password;
	}
	   
	public void setBalance(double balance) {
		this.balance = balance;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}
    
	
	public void setWithdraw(double amount2) {
		this.withdraw = amount2;
	}



	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

















}




