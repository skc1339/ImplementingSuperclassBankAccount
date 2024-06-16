
public class BankAccount {

	private	String firstName;
	private	String lastName;
	private	int accountID;
	private	double balance;
		
		
	// Constructor to initialize balance to zero
	public BankAccount(String firstName, String lastName, int accountID) { 
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountID = accountID;
		this.balance = 0.0;
		
	}
		
				
	// Method to deposit a value to the balance
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: $" + amount + " | New Balance: $" + balance);
		} else {
				System.out.println("Deposit amount must be positive.");
			}
	}
		
		
		// Method to withdraw a value from the balance
		public void withdrawal(double amount) {
			if (amount > 0 && amount <= balance) {
				balance -= amount;
				System.out.println("Withdrawn: $" + amount + " | New balance: $" + balance);
			} else if (amount > balance) {
				System.out.println("Insuffiecient funds. Current balance: $" + balance);
			} else {
				System.out.println("Withdrawal amount must be positive.");
			}
		}
		
		
		// Getter for firstName
		public String getfirstNme() {
			return firstName;
		}
		
		
		// Setter for firstNemae
		public void setfirstName(String firstName) {
			this.firstName = firstName;
		}
		
		
		// Getter for lastName
		public String getLastName() {
			return lastName;
		}
		
		
		// Setter for lastName
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		
		// Getter for accountID
		public int getAccountID() {
			return accountID;
		}
		
		
		// Setter for accountID
		public void setAccountID(int accountID) {
			this.accountID = accountID;
		}
		
		
		// Getter for balance
		public double getBalance() {
			return balance;
		}
		
		
		// Method to print account summary
		public void accountSummary() {
			System.out.println("Account Summary:");
			System.out.println("First Name: " + firstName);
			System.out.println("Last Name: " + getLastName());
			System.out.println("Account ID: " + accountID);
			System.out.println("Balance: $" + balance);
		}
	}


	
	
	
	
	


