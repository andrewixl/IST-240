
public class BankAccount {
	private static int lastAccountGiven = 1000;
	
	private int myBankAccount;
	
	public BankAccount() {
		myBankAccount = ++lastAccountGiven;
	}
	
	public int getMyBankAccount() {
		return myBankAccount;
	}
	
	public static int getLastAccountGiven() {
		return getLastAccountGiven();
	}
	
	// int i = 0;
	// int j = ++i; (add one to i, then assign i to j)
	// int k = i++; (assign k to i then add one)
}
