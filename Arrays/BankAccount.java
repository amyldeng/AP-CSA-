
public class BankAccount {
	private int acctNum;
	private double initBal;
	
	public BankAccount(int accountNumber) {
		acctNum = accountNumber;
		initBal = 0;
		
	}
	
	public BankAccount(int accountNumber, double bal) {
		acctNum = accountNumber;
		initBal = bal;
	}
	
	public void deposit(double money) {
		initBal += money;
	}
	
	public int getAcctNum() {
		return acctNum;
	}
	
	public double getInitBal() {
		return initBal;
	}
	
	public void withdraw(double money) {
		initBal -= money;
	}

	public String toString() {
		return acctNum + "\t" + initBal;
	}
}
