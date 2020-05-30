public class NumberPairs {
	// declare the fields / instance variables "num1, num2, and sum"
	private double num1, num2, sum, totalSum;
	

	// Code the default constructor
	public NumberPairs() {
		
	}
	

	// Code the overloaded constructor that takes two numbers as parameters (not
	// the sum)
	public NumberPairs(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
		computeSum();
	}

	
	// Code a mutator to change the values in the NumberPairs object

	public void setNums(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
		computeSum();
	}

	
	// Code a mutator that computes the sum, but does not print it out
	public void computeSum(){
		sum = num1+num2;
	}


	// Code a toString method that returns the numbers and their sum

@Override
	public String toString(){
		return "The sum of " + num1 + " and " + num2 + " is " + sum;
	}

	//EXTENSION - CAN YOU DO IT?
	// Code a mutator that adds the second NumberPair to increase the first.
	public static NumberPairs updateValue(NumberPairs first, NumberPairs second) {
		first.num1 +=second.num1;
		first.num2+=second.num2;
		first.computeSum();
		return first;
	}
	

	//EXTENSION - CAN YOU DO IT?
	// Create a new NumberPairs object from the sum of the others

	
	
	public static void main(String[] args) {
		NumberPairs one = new NumberPairs();
		one.setNums(5, 5);
		NumberPairs two = new NumberPairs(90,100.0);
		NumberPairs three = new NumberPairs(100.5,85.8);
		NumberPairs four = new NumberPairs(-100,55);
		NumberPairs five = new NumberPairs(15236,5642);
		NumberPairs six = new NumberPairs(1000,555);
		System.out.println(one);
		System.out.println(two);
		System.out.println("After update: " + updateValue(one,two));
		System.out.println(three);
		System.out.println(four);
		System.out.println(five);
		System.out.println(six);

	}



}