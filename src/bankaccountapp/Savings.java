package bankaccountapp;

public class Savings extends Account {
	//list the properties specific to a savings account
	int safetyDepositBoxID;
	int safetyDepositBoxKey;
	
	// constructor to initialize savings account properties
		public Savings(String name, String sSN, double initDeposit) {
			super(name, sSN, initDeposit);
			accountNumber = "1" + accountNumber;
			System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
			System.out.println("NEW SAVINGS ACCOUNT");
		}
		
	// list any methods specific to the savings account
	
	
}
