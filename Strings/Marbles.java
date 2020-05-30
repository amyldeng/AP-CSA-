import java.util.Scanner;
public class Marbles {
	private int size;
	private int mode;
	private int comp;
	public void setSize() {
		size = (int)(Math.random()*91+10);
	}
	public void setMode() {
		mode = (int)(Math.random()*2);
	}
	public int stupid() {
		return (int)(Math.random()*(size/2 +1) +1);
	}
	public int smart() {
		int i = 0;
		double x = 0;
		int j = 0;
		double y = 0;
		while (y<size) {
			y = Math.pow(2, j)-1;
			j++;
			
			if (y==size) {
				return (int)(Math.random()*(size/2 +1) +1);
			}
			
		}
		while((size -x)>size/2) {
			x = Math.pow(2, i) -1;
			i++;
		}
		
		return (int)(size -x);
	}
	public void playAgain() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Would you like to play again? (Y/N)");
		if(scan.nextLine().equalsIgnoreCase("Y")) {
			playGame();
		}
		else
			{System.out.println("Thanks for playing!");}
	}
	public void playGame() {
		Scanner scan = new Scanner(System.in);
		setSize();
		setMode();
		System.out.println(mode);
		if (mode ==0) {
			while(size>0) {
				System.out.println("The size of the pile is " + size);
				System.out.println("How many marbles would you like..."
						+ " you can't take more than half");
				size-= scan.nextInt();
				if (size==1) {
					System.out.println("Congratulations you won! The computer took"
							+ " the last one");
					break;
				}
				comp = stupid();
				System.out.println("The size is now " + size + ".\nThe computer took " + comp + " marbles.");
				size-=comp;
				if (size==1) {
					System.out.println("Sorry you lost, you are forced to take"
							+ "the last marble.");
					break;
				}	
			}
		}

		if (mode ==1) {
			while(size>0) {
				System.out.println("The size of the pile is " + size);
				System.out.println("How many marbles would you like..."
						+ " you can't take more than half");
				size-= scan.nextInt();
				if (size==1) {
					System.out.println("Congratulations you won! The computer took"
							+ " the last one");
					break;
				}
				comp = smart();
				System.out.println("The size is now " + size );
				size-=comp;
				System.out.println(".\nThe computer took " + comp + " marbles.");
				
				if (size==1) {
					System.out.println("Sorry you lost, you are forced to take"
							+ "the last marble.");
					break;
				}	
				
			}
			
		}
		playAgain();
	}


public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Marbles one = new Marbles();
	one.playGame();
	
	
}
}
