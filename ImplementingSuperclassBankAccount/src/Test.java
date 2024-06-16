
public class Test {

	public static void main(String[] args) {
		// Create a new bank account
		BankAccount account = new BankAccount("Joe", "Johnson", 76532);
		
		// Deposit money
		account.deposit(500.0);
		
		// Withdraw money
		account.withdrawal(200.0);
		
		// Print account summary
		account.accountSummary();
	}

}
