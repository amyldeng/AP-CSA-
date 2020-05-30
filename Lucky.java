import static java.lang.System.*;

public class Lucky
{
	/* luckySevens will return a count of the 7s in the number
	 *    unless the 7s are side by side in which case they are worth 14
	 *
	 * 1087171  would return 2 as there are 2 7s
	 * 1077171  would return 15 as 2 7s side by side count as 14 + 1 = 15
	 * 77077  would return 28 ( 14 + 14 )
	 * 97171771707797 would return 32 ( 1 + 1 + 14 + 1 + 14 + 1 )
	 * 1089651234 would return 0
	 *
	 * the solution to this problem must use recursion
	 */
	public static int luckySevens( long number )
	{
		int sum = 0;
		if(number>0){
			if(number%10 == 7)
				if((number/10)%10==7)
					sum += 14 + luckySevens(number/10/10);
				else
				sum += 1+ luckySevens(number/10);
			else
				sum += 0+luckySevens(number/10);
		}
		return sum;
	}
	public static void main(String[] args){
		System.out.println(luckySevens(1087171));
		System.out.println(luckySevens(1077171));
		System.out.println(luckySevens(77077));
		System.out.println(luckySevens(97171771707797L));
		System.out.println(luckySevens(1089651234));

	}
}