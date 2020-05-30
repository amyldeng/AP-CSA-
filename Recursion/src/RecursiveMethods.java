
public class RecursiveMethods {

	
	public static long factorial(int n){
		// 10! = 10 * 9!
		if (n == 1)
			return 1;
		return n * factorial(n-1);
		
	}
	
	public static long sumOfInts (int y){
	// sumOfInts(5) should return 5+4+3+2+1 = 15.
		if(y==1)
			return 1;
		return y + sumOfInts(y - 1);
	}
	
	public static long powerOfTwo(int n){
		if(n == 1)
			return 2;
		return 2 * powerOfTwo(n-1);
	}
	
	public static int fibonacci(int y){
		// fibonacci (7) should return 13, since the 7th term
		// of the fibonacci sequence is 13, as seen here:
//  fib value   1   1   2   3   5   8   13
//  fib term    1st 2nd 3rd 4th 5th 6th 7th term
// (If you haven't seen fibonacci's sequence before, look it up on the internet)
	if(y <=2 )
		return 1;
	return fibonacci(y-1) + fibonacci(y-2);
	}

	
	public static int areaOfSquare(int y ){
//	// remember, the base case is the 1x1 square
	if(y ==1)
		return 1;
	return areaOfSquare(y-1)+ 2*(y-1)+1;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(factorial(10));
		System.out.println(sumOfInts(5));
		System.out.println(powerOfTwo(10));
		System.out.println(fibonacci(8));
		System.out.println(areaOfSquare(7));
		
	}

}
