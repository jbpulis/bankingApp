package bankaccountapp;

public class BankAccountApp {

	public static void main(String[] args) {
		Checking chkacc1 = new Checking("Tom Wilson", "321456789", 1500);
		
		Savings savacc1 = new Savings("Rich Lowe", "456657897", 2500);
		
		savacc1.showInfo();

			System.out.println("****************");
		
		chkacc1.showInfo();
		
		// read a CSV file and create new accounts based on that data
		

	}

}
