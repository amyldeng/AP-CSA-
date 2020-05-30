import java.util.Arrays;

public class WSNo1EightNineTen {

// #8 Create an array of 75 random integers between 1000 and 2000.
//  After the array is created search through the list and count the even and
//  odd numbers

		public static void eight() {
			int[] arr = new int[75];
			for(int i = 0;i<75;i++) {
				arr[i] = (int)(Math.random()*999)+1001;
			}
			int countE=0;
			for(int i=0;i<75;i++) {
				if(arr[i]%2==0) {
					countE++;
				}
			}
			System.out.println("Evens: " + countE + "\tOdds: " + (75-countE));

		}
		
		
		
		
		public static boolean isPrime(int n) {
			for(int j = 2;j<n;j++) {
				if(n%j==0) {
					return false;
				}
			}
			return true;
		}
//#9  Create and return an array of the first 20 prime numbers.  Use a helper 
//	   method to identify the primes. Print out the 5th and 10th.

		public static int[] nine() {
			int[] primes = new int[20];
			int j = 2;
			int i = 0;
			while(i<20) {
				if(isPrime(j)){
					primes[i]= j;
					i++;
				}
				j++;
			}
			return primes;
		}
		
//#10     Create 2 arrays to simulate drawing a card from a deck  Use one array for 			 face value (A,2,3,4,5,6,7,8,9,10,J,Q,K)
//	       and another array for suit(hearts, spades, diamonds, clubs).  
//	       Select a random card and print it.  Example:  “A of clubs”, “10 of hearts”

		public static void ten() {
			String[] face = {"A", "2", "3","4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
			String[] suit = {"hearts", "spades", "diamonds", "clubs"};
			System.out.println(face[(int)Math.random()*face.length]+ " of " + suit[(int)Math.random()*suit.length]);

		}



	public static void main(String[] args) {
		eight();
		System.out.println(Arrays.toString(nine()));
		ten();

	}

}
