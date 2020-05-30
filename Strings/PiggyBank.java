
public class PiggyBank {
	private int pennies, nickels, dimes, quarters;
	
	public PiggyBank(int p, int n, int d, int q) {
		pennies = p;
		nickels = n;
		dimes = d;
		quarters = q;
	}

	public int getPennies() {
		return pennies;
	}

	public int getNickels() {
		return nickels;
	}

	public int getDimes() {
		return dimes;
	}

	public int getQuarters() {
		return quarters;
	}
	public double calculateValue() {
		return getPennies()*0.01 + getNickels()*0.05 + 
				getDimes()*0.1 + getQuarters()*0.25;
	}
	public double round(double d) {
		d*=100;
		d+=0.5;
		d = (int) d;
		d/=100.0;
		return d;	
	}
	public String toString() {
		return "The piggy bank currently contains:\n" + 
				getPennies() + " pennies, " + getNickels() + " nickels, " + getDimes()
				+ " dimes, and " + getQuarters() + " quarters\n" + 
				"for a total value of: " + round(calculateValue());
	}
	public void combinePiggy(PiggyBank b) {
		this.pennies+=b.pennies;
		b.pennies=0;
		this.nickels+=b.nickels;
		b.nickels=0;
		this.dimes+=b.dimes;
		b.dimes=0;
		this.quarters+=b.quarters;
		b.quarters=0;
	}
}
