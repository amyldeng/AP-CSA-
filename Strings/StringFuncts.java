public class StringFuncts {
// 1.This method will return an email address in the form
// first.last@ww-p.org
// getEmail("Mister", "Scarpitta") ====> Mister.Scarpitta@ww-p.org
public static String getEmail(String first, String last) {
	return first + "." + last + "@ww-p.org";
}
// 2. This method will return initials with periods.
// getInitials("Mister", "Scarpitta") ====> M.S.
public static String getInitials(String first, String last) {
	return first.charAt(0) + "." + last.charAt(0) + ".";
}
// 3. This method will parse the year from a birthdate
// in the form MMDDYYYY
// getYear("01021916) ====> 1916
public static String getYear(String bday) {
	return bday.substring(4);
}
// 4. This method will return a lower case
// user name in the form of first 3 letters of first name and
// last 4 letters of last name.
// getUserName("Mister", "Scarpitta") ====> misitta
public static String getUserName(String first, String last) {
		String s;
		if (first.length()>3) s=first.substring(0,3);  
		else
			s = first;
		if (last.length()>4) s+=last.substring((last.length()-4));
		else
			s+=last;
		return s.toLowerCase();
}
// 5. This method will parse the first name from a full name separated with
// a space
// getFirst("Mister Scarpitta") ====> Mister
public static String getFirst(String fullName) {
	int x = fullName.indexOf(" ");
	return fullName.substring(0,x);
}
// 6. This method will parse the last name from a full name separated with a
// space
// getLast("Mister Scarpitta") ====> Scarpitta
public static String getLast(String fullName) {
	int x = fullName.lastIndexOf(" ");
	return fullName.substring(x);
}
//7. This will return a random 4 letter string of letters
// getRandomWord() ====> CDRT
public static String getRandomWord() {
	char x = (char)((int)(Math.random()*26)+65);
	char y = (char)((int)(Math.random()*26)+65);
	char z = (char)((int)(Math.random()*26)+65);
	char a = (char)((int)(Math.random()*26)+65);
	String s = ""+x+y+z+a;
	return s;
	
}
// 8. This will return a new word of every other letter
// everyOtherLetter("PIRATES") ====> PRTS
public static String everyOtherLetter(String word) {
	String s = "";
	for(int i=0;i<word.length();i+=2) {
		s += word.charAt(i);
	}
	return s;
}
// 9. This will return a new word that is the reverse.
// reverse("PIRATES ") ====> SETARIP
public static String reverse(String word) {
	String s = "";
	for (int i = word.length()-1; i>=0; i-- ) {
		s += word.charAt(i);
	}
	return s;
}
// 10. This will return true if the sum of the first digit and the last
// digit is divisible by 5.
// checkDigit("123456789") ====> TRUE
// checkDigit("12345543211") ====> FALSE
// checkDigit("87878787") ====> TRUE
public static Boolean checkDigit(String creditCard) {
	String one = "" + creditCard.charAt(0);
	int x = Integer.parseInt(one);
	String two = "" + creditCard.charAt(creditCard.length()-1);
	int y = Integer.parseInt(two);
	return ((x+y)%5 ==0);
	
}
// 11. This will return a string where every other letter is capitalized
// everyOtherLetterCaps("misterscarpitta") ====> mIsTeRsCaRpItIa
public static String everyOtherLetterCaps(String word) {
	String s = "";
	for(int i=0;i<word.length();i++) {
		if (i%2 ==0) {
			s+=word.charAt(i);
		}
		else {
			s+=word.toUpperCase().charAt(i);
		}
	}
	return s;
}
// 12. This will return a string where every i is replaced with an 8
// replacesIsWith8s("WilliamScarpitta") ====> W8ll8amScarp8tta
public static String replaceIsWith8s(String word){
	String s = "";
	for(int i=0;i<word.length();i++) {
		if (word.charAt(i)=='i') {
			s+="8";
		}
		else {
			s+=word.charAt(i);
		}
	}
	return s;
}
public static void main(String[] args) {
// TODO Auto-generated method stub
System.out.println("1. Email: " + getEmail("Mister", "Scarpitta"));
System.out.println("2. Initials: " + getInitials("Mister", "Scarpitta"));
System.out.println("3. Year: " + getYear("01021916"));
System.out.println("4. UserName: " + getUserName("Mister", "Scarpitta"));
System.out.println("5. FirstName: " + getFirst("Mister Scarpitta"));
System.out.println("6. LastName: " + getLast("Mister Scarpitta"));
System.out.println("7. RandomWord: " + getRandomWord());
System.out.println("8. EveryOtherLetter: " + everyOtherLetter("encyclopedias"));
System.out.println("9A. Reverse: " + reverse("Philadelphia"));
System.out.println("9B. Reverse: " + reverse("JAVA"));
System.out.println("10A. CheckDigit: " + checkDigit("123456"));
System.out.println("10B. CheckDigit: " + checkDigit("123456789"));
System.out.println("11. EveryOtherCaps: "+ everyOtherLetterCaps("misterscarpitta"));
System.out.println("12. Replaces I's with 8's: " + replaceIsWith8s("WilliamScarpitta"));
}
}
