import java.util.Scanner;

public class BMICategories {
	//Exercise 19
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int feet, inches, ftin;
		double bmi, pounds;
		
		
		
		System.out.println( "Enter your height in and inches. " );
		System.out.print( "Feet tall: ");
		feet = keyboard.nextInt();
		System.out.print( "Inches: ");
		inches = keyboard.nextInt();
		System.out.println( "How many pounds do you weigh?");
		System.out.print( "Pounds: " );
		pounds = keyboard.nextInt();
		bmi = pounds / (feet + inches);
		
		System.out.println( "Your BMI is :" + bmi);
		
		System.out.print( "BMI category: " );
		if ( bmi < 15.0 ) {
			System.out.println( "very severely underweight" );
		}
		else if ( bmi <= 16.0 ) {
			System.out.println( "severely underweight" );
		}
		else if ( bmi < 18.5 ) {
			System.out.println( "underweight" );
		}
		else if ( bmi < 25.0 ) { 
			System.out.println( "normal weight"  );
		}
		else if ( bmi < 30.0 ) {
			System.out.println( "overweight" );
		}
		else if ( bmi < 35.0 ) {
			System.out.println( "moderately obese" );
		}
		else if ( bmi < 40.0 ) {
			System.out.println( "severely obese" );
		}
		else {
			System.out.println( "very severely/\"morbidly\" obese" );
		}
	}
}
