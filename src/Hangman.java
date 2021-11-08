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
		
		String wort = "Haus";
		Scanner in = new Scanner(System.in);
		int versuche =15;
		
		
		System.out.println("HANGMAN");
		System.out.println("*******");
		
		System.out.println("Sie haben 15 Versuche.");
		System.out.println("Geben Sie einen Buchstaben ein:");
		char wahl = in.next().charAt(0);
		for(int i= 1;i<=versuche;i++)
		{
		System.out.println("ist falsch! Sie haben noch 14 Versuche");
		System.out.println("");
		System.out.println("**************************************");
		System.out.println("");
		}
		
		in.close();
	
	}

}
