public class EscapeSequencesComments {
	public static void main( String[] args ){
		//https://learnjavathehardway.org/book/ex04.html
		//This excercise demonstrates escape sequences & comments (like these)!
		System.out.print( "Learn\tJava\n\tthe\nHard\tWay\n\n" );
		System.out.print( "\tLearn Java the \"Hard\" Way!\n" );
		// System.out.print( "Learn Java the Hard Way" );
		System.out.print( "Hello\n" ); //This line prints out Hello followed by a new line
		System.out.print( "Jello\by\n" ); //This line prints out Jelly.
		/* The quick brown fox jumped over a lazy dog.
			Quick wafting zephyrs vex bold Jim.*/
		System.out /* testing */ .println( "Hard to believe, eh?" );
		System.out.println( "Surprised? /* abcde */ Or what did you expect?"  );
		System.out.println( "\\ // _=_ \\ //");
		System.out.println( "\\\\ \\\\\\ \\\\\\\\" ); //it takes 2 to make 1
		System.out.print( "I hope you understand \"escape sequences\" now. \n" ) ;
		//and comments. :)
		
		
		
	}
	
}