
public class Fruit {
	private String[] bowl;
	
	public Fruit() {
		bowl = new String[10];
		bowl[0]= "apple";
		bowl[1]= "banana";
		bowl[2]= "kiwi";
		bowl[3]= "lemon";
		bowl[4]= "lime";
		bowl[5]= "mango";
		bowl[6]= "orange";
		bowl[7]= "pineapple";
		bowl[8]= "plum";
		bowl[9]= "pumpkin";
	}
	public void display() {
		for(int i = 0; i<bowl.length; i++) {
			System.out.println(bowl[i]);
		}
	}
	//for each loop or enhanced for loop
	public void display2() {
		for(String a : bowl) {
			System.out.println(a);
		}
	}
	//print every other fruit, beginning with first
	public void display3() {
		for(int i = 0; i<bowl.length; i+=2) {
			System.out.println(bowl[i]);
		}
	}
	//display reverse
	public void display4() {
		for(int i = bowl.length-1; i>=0; i--) {
			System.out.println(bowl[i]);
		}
	}
	//return the fruit with the longest word
	//Step 1: assume the first element in the array is the longest
	//Step 2:Traverse the array, repeatedly replacing longest
	//with anything longer than itself
	public String longFruit() {
		String longest = bowl[0];
		for(int i =1; i<bowl.length; i++) {
			if (bowl[i].length()>longest.length()) {
				longest = bowl[i];
			}
		}
		return longest;
	}
	public String firstInAlphabet() {
		String first = bowl[0];
		for(int i =1; i<bowl.length; i++) {
			if (bowl[i].compareTo(first)<0) {
				first = bowl[i];
			}
		}
		return first;
	}
	public void addFruit(String other) {
		String[] temp = new String[bowl.length +1];
		int index = 0;
		for (int i = 0; i<bowl.length; i++) {
			if (other.compareTo(bowl[i])<=0) {
				index = i;
				break;
			}
		}
		for (int j = 0; j< index; j++) {
			temp[j]=bowl[j];
		}
		for (int k = index; k< bowl.length; k++) {
			temp[k+1]=bowl[k];
		}
		temp[index] = other;
		
		bowl = temp;
	}
	public void addFruit2(String other) {
		String[] temp= new String[bowl.length+1];
		int index = 0;
		for (int i = 0; i<bowl.length; i++) {
			temp[i]=bowl[i];
		}
		for(int j = 0; j<bowl.length; j++) {
			if(other.compareTo(temp[j])<=0) {
				index = j;
				break;}
		}
		for (int k = bowl.length; k>=index;k--) {
			temp[k]= temp[k-1];
		}
		temp[index] = other;
		bowl = temp;
	}
	public static void main(String[] args) {
		Fruit one = new Fruit();
		one.addFruit2("pomegranate");
		one.display();
	}
	
}
