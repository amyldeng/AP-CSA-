
public class Word{
 private String original;
/**
 * constructs a Word with String value s
 * @param s is string value of Word
 */
public Word(String s)
{
original = s;
}
/**
 * reverses letters in original string
 * @return a string that is a reverse of original
 */
public String reverse()
{
	String n = "";
	for (int i=original.length()-1;i>=0;i--) {
		n+=original.substring(i,i+1);
	}
	return n;
}
/**
 * returns the number of non-space symbols/characters of a String
*/
public int getNonSpaceLength()
{
	int s=0;
	for(int i=0;i< original.length();i++) {
		if(original.substring(i,i+1).equals(" ")) s++;
	}
	return original.length()-s;
}
/**
 * determines is word is a palindrome
 * @return true if word is a palindrome, false otherwise
 */
public boolean isPalindrome()
{
	String s = reverse();
	return s.equals(original);

}
/**
 * Alternate method to determine if word is a palindrome
 * @return true if word is a palindrome, false otherwise
 */
public boolean isPalindrome2()
{
	for (int i = 0; i<original.length(); i++)
		{if (original.substring(i, i+1).equals(original.substring(original.length()-1-i, original.length()-i)))
		continue;
		else 
			return false;}
	return true;
	
}
/**
 * removes vowels in original string
 * @return a string that removes all of the vowels
 */
public String removeVowels()
{
	String v = "aeiouAEIOU";
	String n = "";
	int index1 = 0;
	int index2 = 0;
	for (int i = 0; i<original.length(); i++)
	{
		if (v.indexOf(original.substring(i,i+1))>=0){
			index2 = i;
			n+=original.substring(index1,index2);
			index1 = index2+ 1;
		}
		
		
		
	}
	n+=original.substring(index2+1);
	return n;
}
/**
 * creates an anagram
 * @return a string that is a random anagram of the original word
 */
public String anagram()
{
	String o = original;
	int index =0;
	int length = original.length();
	String s = "";
	for (int i=0;i<original.length();i++) {
		index = (int)(Math.random()*length);
		s+=o.substring(index,index+1);
		o = o.substring(0,index) + o.substring(index+1);
		length--;
	}
	return s;
	
}
	public static void main(String[] args) {
		Word hello = new Word("level");
		System.out.println(hello.reverse());
		System.out.println(hello.removeVowels());
		System.out.println(hello.getNonSpaceLength());
		System.out.println(hello.isPalindrome());
		System.out.println(hello.isPalindrome2());
		System.out.println(hello.anagram());
		}
}