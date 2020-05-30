
public class Apples {
	private String statement;
	private int sum;
	private String n = "0123456789";
	public Apples(String s) {
		statement = s;
		sum=0;
	}
	
	public int getSum() {
		for(int i = 0; i<statement.length(); i++) {
			if (n.indexOf(statement.substring(i,i+1))>0) {
				sum+= Integer.parseInt(statement.substring(i, i+1));
			}
		}
		return sum;
	}
	
	
	public String getWord() {
		String m = statement.substring(statement.indexOf("many")+5);
		return m.substring(0, m.indexOf(" "));
	}
	
	
	public String getResponse() {
		
		if (statement.indexOf(" he")>0) {
			return "He has "  + getSum() + " " + getWord() + ".";
		}
		else if (statement.indexOf(" she")>0) {
			return "She has "  + getSum() + " " + getWord() + ".";
		}
		else if (statement.indexOf(" it")>0) {
			return "It has "  + getSum() + " " + getWord() + ".";
		}
		else
			return "They have "  + getSum() + " " + getWord() + ".";
	}
	public static void main(String[] args) {
		Apples a = new Apples("Sachi has 5 dogs, How many dogs does she have?");
		System.out.println(a.getResponse());
	}
}
