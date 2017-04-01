//Exercise 28: Using Loops for Error-Checking

import java.util.Scanner;

public class SafeSquareRoot {
		public static void main( String[] args ) {
			Scanner keyboard = new Scanner(System.in);
			double x, y;
			String check;
			
			System.out.print("Are you ready?!?");
			check = keyboard.nextLine();
			while (!check.equals("YES!")){
				System.out.println("I can't hear you");
				check = keyboard.nextLine();
			}
			
			System.out.print("Give me a number, and I'll find it's squire root. " );
			System.out.print("(No negatives, please.) ");
			x = keyboard.nextDouble();
			
			while ( x < 0 ) {
					System.out.println("I won't take the square root of a negative.");
					System.out.print("\nNew number: ");
					x = keyboard.nextDouble();
			}
		
		y = Math.sqrt(x);
		
		System.out.println("The square root of "+x+" is "+y);
	}
}