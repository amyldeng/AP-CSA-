import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;

public class Factors
{
	public static ArrayList<Integer> getListOfFactors(int number)
	{
		ArrayList<Integer> factor = new ArrayList<Integer>();
		for(int i = 2; i<(number/2)+1; i++) {
			if(number%i==0) {
				factor.add(i);
			}
		}
		return factor;
	}
	
	public static void keepOnlyCompositeNumbers( List<Integer> nums )
	{
		ArrayList<Integer> delete = new ArrayList<Integer>();

		for(int i = 0; i<nums.size(); i++) {
			for(int j = 2;j<nums.get(i)-1;j++) {
				if(nums.get(i)%j==0) {
					delete.add(i);
					break;
				}
			}
		}
		
		for(int i = 0;i<delete.size();i++) {
			System.out.println(delete.get(i) + ", " + nums.get(delete.get(i)));
		}
		
		
		System.out.println("\n");
		for(int i = delete.size()-1; i>=0; i--) {
			System.out.println(delete.get(i));
			System.out.println(nums);
			nums.remove((int)delete.get(i));
		}
		
	}
}