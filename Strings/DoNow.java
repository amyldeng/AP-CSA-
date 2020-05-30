
public class DoNow {
	public static int multTwelves() {
		int x = 1;
		int sum = 0;
		while(x*12 <100) {
			sum+=x*12;
			x++;	
		}
		return sum;
	}
	public static void timesTable() {
		for(int row = 1; row<=5; row++) {
			for(int col=1;col<=5;col++) {
				System.out.print(col*row + "\t");
			}
			System.out.println();
		}
	}
	public static boolean isPrime(int n) {
		boolean x = true;
		for(int i = 2; i<n; i++) {
			if(n%i==0) {
				x = false;
			}
		}
		return x;
	}
	public static int sum10() {
		int sum = 0;
		int x = 1;
		while(x<=10) {
			sum+=x;
			x++;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(multTwelves());
		timesTable();
		System.out.println(sum10());
	}
}
