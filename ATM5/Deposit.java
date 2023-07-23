package ATM5;

public class Deposit {
    
    public static void depositFunds(Infocient client, double amount) {
        if (amount > 0) {
            client.setDeposit(amount);
        } else {
            System.out.println("Invalid deposit amount. Amount must be greater than 0.");
        }
    }
}
