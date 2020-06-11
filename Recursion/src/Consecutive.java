

public class Consecutive {
	public static boolean consecutive(int[]a){
		if(a.length<2)
			return false;
		return consecutive(a, a[0], 0);
	}
	
	public static boolean consecutive(int[]a, int firElement, int index){
		if(index>= a.length-1)
			return false;
		if(a[index+1]==firElement +1)
			return true;
		index++;
		return consecutive(a, a[index], index);
	}

	public static void main(String[] args) {
		int[] a = {2,4,8,3,6,1,5,8,10,2,5,9}; //returns false
		System.out.println(consecutive(a));
		int[] b = {7,3,5,1,9,6,8,2,6,7,2,8}; //returns true
		System.out.println(consecutive(b));
		int[] c = {7,3,5,1,9,6,8,2,6,9,2,3}; //returns true
		System.out.println(consecutive(c));

	}

}
