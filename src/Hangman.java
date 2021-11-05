import java.util.Scanner;

/**
 * 
 */

/**
 * @author vollmani
 *
 */
public class Hangman {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("HANGMAN");
		System.out.println("*******");
		
		System.out.println("Sie haben 15 Versuche.");
		System.out.println("Geben Sie einen Buchstaben ein:");
		char wahl = in.next().charAt(0);
		
		System.out.println("ist falsch! Sie haben noch 14 Versuche");
		System.out.println("");
		System.out.println("**************************************");
		System.out.println("");
		
		in.close();
	
	}

}
