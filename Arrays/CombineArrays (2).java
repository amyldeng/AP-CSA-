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
		if(a.length<b.length) {
			for(int i = 0; i<a.length; i++) {
				c[2*i+1] = a[i];
			}
			for(int i = 0; i<a.length; i++) {
				c[i*2] = b[i];
			}
			for(int i =a.length; i<b.length; i++) {
				c[i+a.length] = b[i];
			}
			return c;
		}
		for(int i = 0; i<b.length; i++) {
			c[2*i] = b[i];
		}
		for(int i = 0; i<b.length; i++) {
			c[i*2+1] = a[i];
		}
		for(int i =b.length; i<a.length; i++) {
			c[i+b.length] = a[i];
		}
		return c;
	}
	
	public static int[] merge(int[]a,int[]b) {
		int[] c = new int[a.length+b.length];
		int aI = 0;
		int bI = 0;
		int index = 0;
		for(int i = 0;i<c.length;i++) {
			if(aI==a.length || bI==b.length) {
				index = i;
				break;
			}
			if(a[aI]<b[bI]) {
				c[i]=a[aI];
				aI++;
			} else {
				c[i]=b[bI];
				bI++;
			}
		}
		if(aI != a.length) {
			for(int i = index;i<c.length;i++) {
				c[i] = a[aI];
				aI++;
			}
		} else if (bI != b.length) {
			for(int i = index;i<c.length;i++) {
				c[i] = b[bI];
				bI++;
			}
		}
		
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
//		System.out.println("Alternate");
//		System.out.println(Arrays.toString(alternate(a,b)));
//		System.out.println(Arrays.toString(alternate(b,a)));
//		System.out.println();
		
		System.out.println("Merge");
		System.out.println(Arrays.toString(merge(a,b)));

	}

}
