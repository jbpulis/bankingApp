package bankaccountapp;

public abstract class Account implements IBaseRate {
	// list common properties for savings and checking accounts
	String name;
	String sSN;
	double balance;

	String accountNumber;
	double rate;
	
	
	//constructor to set base properties and initialize the account
	public Account(String name) {
		System.out.println("Name: " + name);
		System.out.print("NEW ACCOUNT: ");
	}
	
	//list common methods
	
	
}
