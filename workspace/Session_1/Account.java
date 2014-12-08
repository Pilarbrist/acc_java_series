/**
 * 
 */

/**
 * @author pi
 *
 */
public class Account {
	
	// Instance variables
	float balance = 0;
	String owner_name = "Unknown";
	
	public void set_owner_name(String new_name) {
		// Sets instance owner name
		if (new_name != null) {
			owner_name = new_name;
		}
	}
	
	public boolean deposit(float deposit_amount) {
		// Deposit to account; return true if successful, else false
		if (deposit_amount > 0f) {
		balance += deposit_amount;
		return true;
		}
		return false;
	}
	
	public boolean withdraw(float withdraw_amount) {
		// Withdraw from account; return true if successful, else false
		if (withdraw_amount > 0f) {
			float new_balance = balance - withdraw_amount;
			if (new_balance > 0f) {
				balance = new_balance;
				return true;
			}
		}
		return false;
	}
	
	public void account_status() {
		System.out.println("\nAccount Owner: " + owner_name +
				           "\nBalance: " + balance);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Instantiate and drive the class 
		Account acct1 = new Account();
		Account acct2 = new Account();
		
		acct1.set_owner_name("Kobalt Goop");
		acct2.set_owner_name("Tricia Goop");

		if (!acct1.deposit(2000f)) {
			System.out.println("\nError while depositing to account for " + acct1.owner_name);
		}
		if (!acct1.withdraw(1000f)) {
			System.out.println("\nError while withdrawing from account for " + acct1.owner_name);
		}
		acct1.account_status();
		
		if (!acct2.deposit(2000f)) {
			System.out.println("\nError while depositing to account for " + acct2.owner_name);
		}
		if (!acct2.withdraw(3000f)) {
			System.out.println("\nError while withdrawing from account for " + acct2.owner_name);
		}
		if (!acct2.withdraw(400f)) {
			System.out.println("\nError while withdrawing from account for " + acct2.owner_name);
		}
		acct2.account_status();
	}

}
