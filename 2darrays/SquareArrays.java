import java.util.Random;
public class SquareArrays {
	private int[][] square;

	public SquareArrays() {
		
	}
	
	public SquareArrays(int size) {
		square = new int[size][size];
		populate();
	}
	
	public void populate() {
		for(int row = 0; row < square.length; row++)
			for(int col = 0; col < square[0].length; col++)
				square[row][col] = (int)(Math.random()*6);
	}
	
	public void display() {
		for(int row = 0; row < square.length; row++) {
			for(int col = 0; col < square[0].length; col++) {
				System.out.printf("%3d" , square[row][col]);
			}
			System.out.println();
		}
	}
	
	public int rowSum(int row) {
		int sum = 0;
		for(int i = 0; i < square[row].length; i++) {
			sum += square[row][i];
		}
		return sum;
	}
	
	private int colSum(int col) {
		int sum = 0;
		for(int row = 0; row < square.length; row++)
			sum += square[row][col];
		
		return sum;
	}
	
	private int lowestRow() {
		int minSum = rowSum(0);
		int minIndex = 0;
		for(int row = 0; row < square.length; row++) 
		{
			if(rowSum(row) < minSum)
			{
				minSum = rowSum(row);
				minIndex = row;
			}
		}
		return minIndex;
	}
	
	private int lowestCol() {
		int minSum = colSum(0);
		int minIndex = 0;
		for(int col = 0; col < square[0].length; col++) 
		{
			if(colSum(col) < minSum)
			{
				minSum = colSum(col);
				minIndex = col;
			}
		}
		return minIndex;
	}
	
	public int highestRow() {
		int maxSum = rowSum(0);
		int maxIndex = 0;
		for(int row = 0; row < square.length; row++) 
		{
			if(rowSum(row) > maxSum)
			{
				maxSum = rowSum(row);
				maxIndex = row;
			}
		}
		return maxIndex;
	}
	
	public int highestCol() {
		int maxSum = colSum(0);
		int maxIndex = 0;
		for(int col = 0; col < square[0].length; col++) 
		{
			if(colSum(col) > maxSum)
			{
				maxSum = colSum(col);
				maxIndex = col;
			}
		}
		return maxIndex;
		
	}
	
	public double averageLowestRow() {
		return (double)(rowSum(lowestRow()))/square[lowestRow()].length;
	}
	
	public double averageLowestCol() {
		return (double)(colSum(lowestCol()))/square.length;
	}
	
	public double averageHighestRow() {
		return (double)(rowSum(highestRow()))/square[highestRow()].length;
	}
	
	public double averageHighestCol() {
		return (double)(colSum(highestCol()))/square.length;	
	}
	
	public int diagonalSum (int d) {
		int sum = 0;
		if (d < 0) {
			for (int row = 0; row < square.length; row++) {
				sum += square[row][row];
			}
		}
		else {
			for (int row = square.length - 1; row >= 0; row--) {
				sum += square[row][row];
			}
		}
		return sum;
	}
	
	public int higherDiagonalSum() {
		if(diagonalSum(-1) > diagonalSum(1))
			return diagonalSum(-1);
		return diagonalSum(1);
	}
	
	public boolean largerThanRows() {
		return (higherDiagonalSum()> highestRow());
	}
	
	public boolean largerThanCols() {
		return (higherDiagonalSum()> highestCol());
	}
	
	public static void main(String[] args) {
		SquareArrays one = new SquareArrays(5);
		one.display();
		
		// a. find the lowest/highest row or column
		// b. find and display the average value of the elements in the lowestRow/Column
		// c. find the average of the highest and lowest row. (or column)
		// d. find which diagonal has the higher sum
		// e. is either diagonal larger than all rows?
		//    ..larger than all columns?
		// f. find which diagonal/row has the greatest range (from low to high)

		System.out.println("The sum of row 1 is: " + one.rowSum(1));
		System.out.println("The sum of col 3 is: " + one.colSum(3));
		System.out.println("The lowest row sum is row " + one.lowestRow() +
				" with a total of " + one.rowSum(one.lowestRow()));
		// add your own testers as needed as you 
		// complete your own SquareArrays class
				
	}

}
