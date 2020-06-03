
public class StringIndex {



	/**
	 * Determines if a string exists in a phrase.
	 * 
	 */
public static int indexOf (String text, String str) {
	if(str.length()>text.length())
		return -1;
	if(str.length()==text.length()){
		if(str.equals(text))
			return 0;
		else return -1;
	}
	return indexOf(text,str,0);

	}
	/**
	 * Determines if a string exists in a phrase.
	 * Helper method
	 */
	private static int indexOf(String text, String str, int index)
	{
		if(text.length()-str.length()<index)
			return -1;
		if(text.substring(index, index+str.length()).equals(str))
			return index;
		return indexOf(text, str, index+1);
	}
}
