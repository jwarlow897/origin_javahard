// Exercise 25 Repeating yourself

import java.util.Scanner;

public class EnterPIN {
		public static void main( String[] args ) {
			Scanner keyboard = new Scanner(System.in);
			int pin, entry;
			String password, pass;
			
			pin = 12345;
			password = "password01";
			
			System.out.println("WELCOME TO THE BANK OF JAVA.");
			System.out.println("ENTER YOUR PASSWORD");
			pass = keyboard.nextLine();
			
			while ( pass.compareTo(password) != 0) {
				System.out.println("\neINCORRECT PASSWORD. TRY AGAIN.");
				System.out.println("ENTER YOUR PASSWORD: ");
				pass = keyboard.nextLine();
			}			
		
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
			
			
			while ( entry != pin ) {
				System.out.println("\neINCORRECT PIN. TRY AGAIN.");
				System.out.print("ENTER YOUR PIN: ");
				entry = keyboard.nextInt();
			}
			
			
			System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
		}
}
