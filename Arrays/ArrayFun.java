import java.util.Arrays;

public class ArrayFun {
	private static int[] numbArray;
	// 1. Constructs a default array of size 10
	public ArrayFun() {
	numbArray = new int[10];
	numbArray[0] = 1;
	numbArray[1] = 3;
	numbArray[2] = 7;
	numbArray[3] = 19;
	numbArray[4] = 15;
	numbArray[5] = 19;
	numbArray[6] = 7;
	numbArray[7] = 3;
	numbArray[8] = 19;
	numbArray[9] = 48;
	}

	// 2. Constructs an array of random numbers (0-24) array of size count
	public void ArrayExample(int count) {
		int[] randomnum = new int[count];
		for(int i = 0; i<count; i++) {
			randomnum[i] = (int) Math.random()*25;
		}	
	}

	// 3. This method prints all of the elements of the array in list form
	public void display() {
		for (int i = 0; i < numbArray.length; i++) {
			System.out.println(numbArray[i]);
		}
	}

	// 4. This method prints all of the elements in reverse order
	public void displayReverse() {
		for (int i = numbArray.length-1; i >= 0; i--) {
			System.out.println(numbArray[i]);
		}
	}

	// 5. This method calculates and returns the average of all of the elements
	// The average of the default array is 14.1
	public double average(){
		double sum = 0;
		for (int i = 0; i<numbArray.length; i++)
			sum += numbArray[i];
		return sum/numbArray.length;
	}

	// 6. This method returns the maximum value of all of the elements
	// The max of the default array is 48.
	public static int findMax() {
		int max = numbArray[0];
		for (int i = 0; i < numbArray.length; i++) {
			if (max < numbArray[i]) max = numbArray[i];
		}
		return max;
	}

	// 7. This method returns the index number of the first instance of int lookFor
	// returns -1 if not in the list
	// ex. Using the default array findIndex(15) will return 4
	public int linearSearch(int lookFor) {
		int lf = 0;
		for (int i = 0; i<numbArray.length; i++) {
			if(numbArray[i] == lookFor)
			{	lf = i;
				break;}
			else if(numbArray[i]!=lookFor)
			{
				lf = -1;
			}
		}
		return lf;
	}
	/**
	* 8. This method will print the elements and the tally. The list with the
	* default constructor will be
	* Number Frequency
	* 1 1
	* 3 2
	* 7 2
	* 15 1
	* 19 3
	* 48 1
	*/
	public void tallyList(){
		
		for (int i = 0; i<numbArray.length; i++) {
			int counter = 1;
			if(numbArray[i]==0) {
				continue;
			}
			System.out.print(numbArray[i] + " ");
			for(int j = i+1; j<numbArray.length; j++) {
				if(numbArray[i] == numbArray[j]) {
					counter++;
					numbArray[j] = 0;
				}
			}
			System.out.println(counter);
				
		}
	}
	/**
	* 9. This method will print a column of numbers in the original order,
	* a column of numbers in reverse order, and the average of the two.
	* default constructor will be
	* LIST REVERSE AVERAGE
	* 1 48 24.5
	* 3 19 11.0
	* 3 19 11.0
	* 7 19 13.0
	* 7 15 11.0
	* 15 7 11.0
	* 19 7 13.0
	* 19 3 11.0
	* 19 3 11.0
	* 48 1 24.5
	*/
	public void listReverseAvg() {
		int n = numbArray.length;
		for(int i = 0;i<n-1;i++) {
			for (int j = 0;j< n-i-1;j++) {
				if(numbArray[j] > numbArray[j+1]) {
					int temp = numbArray[j];
					numbArray[j] = numbArray[j+1];
					numbArray[j+1] = temp;
				}
			}
		}
		System.out.println("LIST REVERSE AVERAGE");

		double a = 0;
		double b = 0;
		
		for(int i = 0;i<numbArray.length;i++) {
			a = numbArray[i];
			b = numbArray[numbArray.length-i-1];
			System.out.println((int)a + " " + (int)b + " " + (a+b)/2);

		}

	}
	
	// 10. This method will sort the array in ascending order
	//
	public void sort() {
		int n = numbArray.length;
		for(int i = 0;i<n-1;i++) {
			for (int j = 0;j< n-i-1;j++) {
				if(numbArray[j] > numbArray[j+1]) {
					int temp = numbArray[j];
					numbArray[j] = numbArray[j+1];
					numbArray[j+1] = temp;
				}
			}
		}
	}

	// 11. Binary Search.
	// This method returns the index number of the first instance of int lookFor and
	// returns -1 if not in the list. The Array must be sorted to use the Binary search.
	// ex. Using the default array findIndex(15) will return 4
//	public int binarySearch(int lookFor)
//	{
	// 12. Write a tester that will create a random array of size 50
	// and test all of these methods

	public static void main(String[] args) {
		ArrayFun one = new ArrayFun();
//		System.out.println(one.average());
//		System.out.println(one.findMax());
//		System.out.println(one.linearSearch(48));
//		one.tallyList();
//		one.listReverseAvg();
		System.out.println(Arrays.toString(one.sort()));
		
	}
}
