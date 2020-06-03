
public class StringFind {
public static boolean find(String text, String str){
	String a = str;

	if(text.startsWith(a))
		return true;
	if(text.length()==a.length())
		return false;
	else{
		text = text.substring(1);
		return(find(text, a));}
		

	
}
	public static void main(String[] args)
	{
	StringFind one = new StringFind();
		
	System.out.println(StringFind.find(";Mississippi", "sip"));
	System.out.println("Expected: true");
	System.out.println(StringFind.find("Mississippi", "sisip"));
	System.out.println("Expected: false");
	System.out.println(StringFind.find("shoe", "oe"));
	System.out.println("Expected: true");
}
}

