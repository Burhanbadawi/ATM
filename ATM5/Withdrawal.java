package ATM5;

public class Withdrawal {
    
	
    public static void withdrawFunds(Infocient client, double amount) {
        if (amount > 0 && amount <= client.getBalance()) {
            client.setWithdraw(amount);
        } else if (amount > client.getBalance()) {
            System.out.println("Insufficient funds. Current balance: " + client.getBalance());
        } else {
            System.out.println("Invalid withdrawal amount. Amount must be greater than 0.");
        }
    }
}