package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Create a new bank account >> think instantiate objects
		
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "13354356";
		//acc1.name = "Roger Hue";
		// with encapsulation: public api methods 
		acc1.setName("Roger Hue");
		System.out.println(acc1.getName());
		
		acc1.setSsn("34342345");
		System.out.println("SSN:" + acc1.getSsn());
		acc1.setRate();
		acc1.balance = 10000;
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.withdraw(2000);
		System.out.println(acc1.toString());
		/*
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "55534524";
		
		BankAccount acc3 = new BankAccount("Saving account", 5000);
		acc3.accountNumber = "64354533";
		acc3.checkBalance();

		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.name = "Jaun";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());*/
	}

}
