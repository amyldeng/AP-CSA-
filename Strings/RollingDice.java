
public class RollingDice {
	
	public RollingDice()
	{
		
	}
	
	public int roll() {
		int counter = 0;
		int sum = 0;
		while (sum<100)
		{
			sum+= Math.random()*6+1;
			counter++;
		}
		return counter;
	}
	public static void factorPairs(int n) {
		String s = "";
		for(int i = 1; i<=n;i++) {
			while(i<=Math.sqrt(n)) {
			if(n%i==0) {
				System.out.print(i + "&" + n/i + " ");
			}
		}
		}
	
	}



	public static void main(String[] args) {
	
		RollingDice one = new RollingDice();
//		System.out.println(one.roll());
		factorPairs(16);
	}
}
