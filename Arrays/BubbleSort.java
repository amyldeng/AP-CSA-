import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {1,3,7,19,15,19,7,3};
		System.out.println("Original Array");
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("Sorted Array");
		System.out.println(Arrays.toString(arr));

	}
	
	public static void bubbleSort(int numbArray[]) {
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

}
