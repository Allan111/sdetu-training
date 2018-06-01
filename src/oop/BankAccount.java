package oop;

public class BankAccount implements IRate {

	String accountNumber;
	
	//static >> belongs to the class not the object instance
	//final >> constant (often static final)
	private static final String routingNumber = "053432";
	
	// instance variable
	private String name;
	private String ssn;
	String accountType; 
	double balance = 0;
	
	// Constructor definitions: unique methods 
		// 1. Used to define / set up / initialise properties of an object
		// 2. Constructors are IMPLICITLY called upon instantiation
		// 3. The same name as the class itself
		// 4. Constructors have no return type
	
	BankAccount() {
		System.out.println("New account created.., ");
	}
	BankAccount(String accountType){
		System.out.println("New account: " + accountType);
	}
	BankAccount(String accountType, double initDeposit){
		// initDeposit, accountType, Msg are all local varibles - only exist in this block.
		System.out.println("New account: " + accountType);
		System.out.println("Initial deposit of: $" + initDeposit);	
		String Msg = null;
		if(initDeposit < 1000) {
			Msg = "ERROR: Minimum deposit must be at least $1000";
		}else {
			Msg = "Thanks for your initial deposit of: $" + initDeposit;
		}
		System.out.println(Msg);
		balance = balance + initDeposit; 
	}
	
	//Getters / Setters 
	
	// Allow users to define the name.
	public void setName(String name) {
		this.name ="Mr " + name;
		
	}
	public String getName(){
		return name;
	}
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}	
	public String getSsn() {
		return ssn;
	}
	
	// interface methods 
	
	public void setRate() {
		System.out.println("Setting rate..");
	}
	public void increaseRate() {
		System.out.println("Increasing rate..");
	}
	
	
	// Define methods
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
		
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
		showActivity("WITHDRAW");
	}
	
	// private - can only be called from within the class.
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION: " + activity);
		System.out.println("YOUR NEW BALANCE IS: $" + balance);
	}
	void checkBalance() {
		System.out.println("Blanace : $" + balance);
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[ NAME: " + name + ". ACCOUNT #" + accountNumber + ". ROUTING #" + routingNumber +". BALANCE: $" + balance + " ]";
	}
	
}
