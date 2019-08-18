package bankaccountapp;

public class Savings extends Account {
	//list the properties specific to a savings account
	int safetyDepositBoxID;
	int safetyDepositBoxKey;
	
	// constructor to initialize savings account properties
		public Savings(String name, String sSN, double initDeposit) {
			super(name, sSN, initDeposit);
			accountNumber = "1" + accountNumber;
		}
		
	// list any methods specific to the savings account
		public void showInfo() {
			super.showInfo();
			System.out.println("ACCOUNT TYPE: Savings");
		}
	
}
