import java.util.Arrays;

public class CombineArrays {

	public static int[] append(int[] a, int[] b) {
		int[] c = new int[a.length+b.length];
		for(int i = 0; i<a.length; i++) {
			c[i] = a[i];
		}
		for(int i = 0; i<b.length; i++) {
			c[i+a.length] = b[i];
		}
		return c;
	}
	
	public static int[] alternate(int[] a, int[] b) {
		int[] c = new int[a.length+b.length];
//		int x = 0;
//		int y = 0;
//		int z = 0;
//		for (int i = 0; i<c.length;i++) {
//			if (z%2== 0) {
//				c[z] = a[x];
//				x++;
//			}
//			else {
//				c[z] = b[y];
//				y++;
//			}
//			z++;
//		}
		int [] temp = new int[a.length];
		if(a.length<b.length) {
			temp = b;
			b=a;
			a=temp;
		}
		for(int i = 0; i<b.length; i++) {
			c[2*i] = b[i];
		}
		for(int i = 0; i<b.length; i++) {
			c[i*2+1] = a[i];
		}
		for(int i =b.length; i<a.length; i++) {
			c[i+b.length*2] = a[i];
		}
//		for(int i = 0; i<b.length; i++) {
//			for(int j = 1; j<c.length; j+=2) {
//				c[j] = b[i];
//			}
//		}
		return c;
	}
	public static void main(String[] args) {
		int[] a = new int[] {1,4,9,16,25,36,49,64,81,100};
		int[] b = new int[] {3,10,11,12,21,26};
		
		System.out.println("Array a: ");
		System.out.println(Arrays.toString(a));
		System.out.println();
		
		System.out.println("Array b: ");
		System.out.println(Arrays.toString(b));
		System.out.println();
		
//		System.out.println("Append b to end of a");
//		System.out.println(Arrays.toString(append(a,b)));
//		System.out.println();
//		
		System.out.println("Alternate");
		System.out.println(Arrays.toString(alternate(a,b)));
		System.out.println(Arrays.toString(alternate(b,a)));
		System.out.println();
		
//		System.out.println("Merge");
//		System.out.println(Arrays.toString(merge(a,b)));

	}

}
