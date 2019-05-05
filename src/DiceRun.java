import java.util.Scanner;

public class DiceRun {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int userSides;
		boolean rerun = true;
		
		
		
		System.out.println("Welcome to the Grand Circus dice roller!");
		System.out.println("========================================");
		
		do {
			int sum =0;
			System.out.println("How many sides are on the die?: ");
			userSides = scan.nextInt();
			Die userDie = new Die(userSides);
			System.out.println("First Roll: "+userDie.rollDie());
			sum = sum+userDie.getValue();
			System.out.println("Second Roll: "+userDie.rollDie());
			sum = sum+userDie.getValue();
			System.out.println("The sum of the rolls is: "+sum);
			
			System.out.println("Would you like to roll again???(Y/N)");
			String userRerun = scan.next();
			
			if(userRerun.equalsIgnoreCase("Y")||userRerun.equalsIgnoreCase("yes")) {
				rerun = true;
			} else {
				rerun = false;
			}
		} while (rerun);
		System.out.println("Goodbye");
		
		
		
	}
}
