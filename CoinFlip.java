//Exercise 29: Do-While loops

import java.util.Scanner;

public class CoinFlip {
	public static void main( String[] args ) {
			Scanner keyboard = new Scanner(System.in);
			String coin, again;
			int streak = 0;
			boolean gotHeads;
// Do While loop version		
			do {
				gotHeads = Math.random() < 0.5;
				
				if ( gotHeads )
					coin = "HEADS";
				else
					coin = "TAILS";
				
				System.out.println("You flip a coin and it is... " + coin);
				
				if ( gotHeads ) {
					streak++;
					System.out.println("\tThat's " + streak + " in a row....");
					System.out.print("\tWould you like to flip again (y/n)? ");
					again = keyboard.next();
				}
				else {
					System.out.println("\tYou lose everything!");
					System.out.println("\tShould've quit while you were aHEAD....");
					streak = 0;
					again = "n";
				}
			} while (again.equals("y"));
			
//While loop version Chigur style			
/*			System.out.println("Call it, friendo.");
			System.out.println("\t*you call 'Heads, then'");
			again = "y";
			while ( again.equals("y") ){
				gotHeads = Math.random() < 0.5;
			if ( gotHeads ){
				coin = "HEADS";
				streak++;
				System.out.println("Well Done! Call it Again?");
				again = keyboard.next();
			}
			else {
				coin = "TAILS";
				System.out.println("I got here the same way the coin did...");
				System.out.println("\t*you die");
				again = "n";
				}
			}
	*/		
			System.out.println( "Final score: " + streak );
				
	}
}