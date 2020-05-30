
public class MultTable {
	
	int mult[][];
	
	public MultTable() {
		
	}

	public MultTable(int size) {
		mult = new int[size][size];
		fillTable();
	}
	
	public void fillTable() {
		for(int row = 0; row < mult.length; row++)
			for(int col = 0; col < mult[0].length; col++)
				mult[row][col] = (row+1) * (col+1);
	}
	
	public void display() {
		for(int row = 0; row < mult.length; row++) {
			for(int col = 0; col < mult[0].length; col++) {
				System.out.print(mult[row][col] + "\t");
			}
			System.out.println();
		}
	}
	
	//for-each
	public void display2() {
		for (int[] x : mult) {
			for (int y : x) {
				System.out.print(y + "\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		MultTable p = new MultTable(10);
		p.display2();

	}

}
