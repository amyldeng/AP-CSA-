import java.util.ArrayList;

public class Bank {
	private ArrayList <BankAccount>accounts;
	
	public Bank() {
		accounts = new ArrayList<BankAccount>();
	}

	public void addAccount(BankAccount a) {
		accounts.add(a);
	}
	
	public int count(double atLeast) {
		int count = 0;
		for(int i = 0;i<accounts.size();i++) {
			if(accounts.get(i).getInitBal()>=atLeast) {
				count++;
			}
		}
		return count;
	}
	
	public BankAccount find(int acctNumber) {
		for(int i = 0;i<accounts.size();i++) {
			if(accounts.get(i).getAcctNum()==acctNumber) {
				return accounts.get(i);
			}
		}
		return null;
	}
	
	public BankAccount find(int acctNumber) {
		for(int i = 0;i<accounts.size();i++) {
			if(accounts.get(i).getAcctNum()==acctNumber) {
				return accounts.get(i);
			}
		}
		return null;
	}
}
