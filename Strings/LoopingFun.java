
public class LoopingFun {
	public static void binary(int n) {
		int x = n;
		for(int i = 7; i>=0; i--) {
		
			if(x>=Math.pow(2, i)) {
				System.out.print(1);
				x-=Math.pow(2, i);			
			}
			else
				System.out.print(0);
			
		
		}
		
	}
	public static void coinTrials(int n) {
		int h = 0;
		int t = 0;
		for (int i = 1; i<=n; i++) {
		if((int)(Math.random()*2)==0){
			h++;
		}
		else t++;
		}
		System.out.println("Heads: " + h + "\nTails: " + t);
	}
	
	public static int countDigits(int n) {
		int x = 1;
		int y = 10;
		while (y!=0 && n/y>0) {
			x++;
			y*=10;
		}
		return x;
	}
	
	public static void factorial(int n) {
		int f = n;
		long x = 1;
		while (n>0) {
			x = x*n;
			n-=1;
		}
		System.out.println(f + "! equals " + x);
	}
	public static void fibonacci(int n) {
		String s = "1, 1, ";
		int sum = 0;
		int x = 1;
		int y = 1;
		for(int i = 1; i<=(n-2); i++) {
			sum = x + y;
			s+= "" + sum + ", ";
			x = y;
			y = sum;
		}
		System.out.println(s);
	}
	public static void gcf(int a, int b) {
		int x = Math.max(a, b);
		int y = Math.min(a, b);
		int i = y;
		int gcf = 0;
		while(i>0) {
			if (y%i==0 && x%i==0) {
				gcf = i; 
				break;
			}
			i--;
		}
		System.out.println("The gcf of " + a + " and " + b + " is " + gcf);
	}
	public static void isEven(int n) {
		boolean x = false;
		while(n%2 == 0) {
			x = true;
			break;
		}
		System.out.println(n + " is even: " + x);
	}
	public static void isPerfect(int n) {
		int sum =0;
		for (int i =1; i<n;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		System.out.println(n + " is perfect: " + (sum==n));
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
	public static void lcm(int a, int b) {
		int x = Math.min(a, b);
		int y = Math.max(a, b);
		int multiple = 0;
		int i = 1;
		while(multiple<=(a*b)) {
			multiple = x*i;
			if ((multiple)%y==0) {
				System.out.println("lcm is: " + multiple);
				break;
			}
			i++;
		}
	}
	public static void primeFactorization(int n) {
		int x =n;
		for(int i = 2; i<=n;i++) {
			if(isPrime(i)) {
				while (x%i ==0) {
					x/=i;
					System.out.print((i + ", "));
				}
			}
		}
		System.out.println();
	}
	public static void primeNumberList(int n) {
		int i =1;
		while(i<=n) {
			if(isPrime(i)) {
				System.out.print(i);
				System.out.print(", ");
			}
			i++;
		}
		System.out.println();
	}
	public static void printFactors(int n) {
		for(int i = 1; i<=n; i++) {
			if (n%i==0) {
				System.out.print(i + ", ");
			}
		}
		System.out.println();
	}
	public static void reverseNum(int n) {
		int x = n;
		int var = 0;
		int y = 0;
		
		for(int i =1; i<=countDigits(n); i++) {
			y*=10;
			var = x%10;
			y+=var;
			x/=10;
		}
		System.out.println(y);
	}
	public static void pyramid(int n) {
		for(int row =1; row<=n; row++) {
			for(int space = (n-row); space>=1;space--) {
				System.out.print(" ");
			}
			for(int col = 1; col<(2*row); col++) {
				System.out.print("*");
			}
			for(int s = (n-row); s>=1;s--) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void sumDigits(int n) {
		int sum = 0;
		int x = n;
		for(int i =1; i<=countDigits(n); i++) {
			sum+=(x%10);
			x/=10;
		}
		System.out.println(sum);
	}
	public static void sumInts(int n) {
		int sum = 0;
		for(int i = 1; i<=n; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		coinTrials(100);
		System.out.println(countDigits(258));
		factorial(5);
		fibonacci(7);
		gcf(6,9);
		isEven(7);
		isPerfect(28);
		System.out.println(isPrime(15));
		lcm(15,10);
		primeFactorization(48);
		primeNumberList(15);
		printFactors(15);
		reverseNum(5639);
		pyramid(6);
		sumDigits(15);
		sumInts(3);
		binary(66);
	}
	
}
