
public class CodingRecursionLesson02 {
	
	public static String reverseString(String text) {
		if(text.length()==1)
			return text.substring(0,1);
		return (text.substring(text.length()-1) + reverseString(text.substring(0,text.length()-1)));
	}
	
	
	public static boolean isPalindrome(String text) {
		if(text.length() == 0 || text.length() == 1)
            return true; 
        if(text.charAt(0) == text.charAt(text.length()-1))
   
        return isPalindrome(text.substring(1, text.length()-1));

      
        return false;
	}
	
	
	public static int countOddDigits(int num)	{
		int sum = 0;
		if(num>0){
			if(num%2==1)
				sum += 1+ countOddDigits(num/10);
			else
				sum += 0+countOddDigits(num/10);
		}
		return sum;
	}
	
	
	
	public static void main(String[] args) {
		// Testers for reverse
		System.out.println("Result: " +  reverseString("Hello!"));
		System.out.println("Expected: !olleH");
		System.out.println("Result: " + reverseString("Odd"));
		System.out.println("Expected: ddO");
		System.out.println();
		
		// Testers for isPalindrome
		System.out.println("madam is " + isPalindrome("madam"));
		System.out.println("Madam is " + isPalindrome("Madam"));
		System.out.println("Frank is " + isPalindrome("Frank"));
		System.out.println("racecar is " + isPalindrome("racecar"));
		System.out.println();
		
		// Testers for countOddDigits
		System.out.println("# of odds in 4532: " + countOddDigits(4532));
		System.out.println("# of odds in 1114532: " + countOddDigits(1114532));
		System.out.println("# of odds in 2245327: " + countOddDigits(2245327));
		System.out.println("# of odds in 13579: " + countOddDigits(13579));

	}

}

//  Expected Outcome

//	Result: !olleH
//	Expected: !olleH
//	Result: ddO
//	Expected: ddO
//
//	madam is true
//	Madam is false
//	Frank is false
//	racecar is true
//
//	# of odds in 4532: 2
//	# of odds in 1114532: 5
//	# of odds in 2245327: 3
//	# of odds in 13579: 5
