package methods;

public class Bank {
	static int currentBalance=1000;
	public static void greetings() {
		System.out.println("welcome to bank application");
	}
public  static void deposit(int amount) {
	currentBalance=currentBalance+amount;
	System.out.println("amount successfully deposited");
}
public static void withDrawn(int amount) {
	currentBalance=currentBalance-amount;
	System.out.println("amount successfully withdrawn");
}
public int GetCurrentBalance() {
	return currentBalance;
	}
	
	public static void main(String[] args) {
		greetings();
		Bank bank=new Bank();
		System.out.println("currentBalance:" +bank.GetCurrentBalance());
		deposit(500);
		System.out.println("currentBalance:" +bank.GetCurrentBalance());
		withDrawn(200);
		System.out.println("currentBalance:" +bank.GetCurrentBalance());
		
	}
	
	}


