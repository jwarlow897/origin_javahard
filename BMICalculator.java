import java.util.Scanner;

public class BMICalculator{
	public static void main( String[] args ){
		Scanner keyboard = new Scanner(System.in);
		int feet, inches;
		double m, kg, bmi, lb, ft, in, pounds;
		
		lb = 0.45359237;
		ft = 0.3048;
		in = 0.0254;
		System.out.println( "Your height in feet: " );
		feet = keyboard.nextInt();
		
		
		System.out.println( "Your height in inches: " );
		inches = keyboard.nextInt();
		m = feet*ft + inches*in; //keyboard.nextDouble();
		
		System.out.print( "Your weight in pounds: " );
		pounds = keyboard.nextDouble();
		kg = pounds*lb; //keyboard.nextDouble();
		
		bmi = kg / (m*m);
			
		System.out.println( "Your BMI is " + bmi );
	}


}