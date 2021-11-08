import java.util.Scanner;

/**
 * 
 */

/**
<<<<<<< HEAD
 * @author Jens Hafemann
=======
 * @author vollmani
>>>>>>> 3a87b155beaed7698509471c9b980f067613f2f1
 *
 */
public class Hangman {

	/**
	 * 
	 * @param wort
	 *                 <p>
	 *                 die zuletzt angezeigte Ausgabe<br>
	 *                 nicht erratenen buchstaben werden mit "_" Dargestellt
	 *                 </p>
	 * @param ratewort Das zu erratene Wort
	 * @param eingabe  Der Eingegebene Buchstabe
	 * @return String neues wort zur Ausgabe
	 */
	static String ausgabe(String wort, String ratewort, char eingabe) {
		int i = ratewort.indexOf(eingabe);
		if (i == -1)
			return wort;// buchstabe nicht enthalten
		StringBuilder sbWort= new StringBuilder(wort);
		while (i !=-1) {
			sbWort.setCharAt(i, eingabe);
			i= ratewort.indexOf(eingabe, i+1);
		}

		return sbWort.toString();
	}

	static String fuellen(String zuratewort, char buchstabe) {
		int lange = zuratewort.length();
		StringBuilder ausgabe = new StringBuilder(lange);
		for (int i = 0; i < lange; i++) {
			ausgabe.append(buchstabe);
		}
		return ausgabe.toString();
	}

	static boolean istEnthalten(String wort, char eingabe) {
		return wort.indexOf(eingabe) != -1;
	}

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
