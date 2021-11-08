import java.util.Scanner;

/**
 * 
 */

/**
 * @author Jens Hafemann
 * @author Nico Vollmar
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
		StringBuilder sbWort = new StringBuilder(wort);
		while (i != -1) {
			sbWort.setCharAt(i, eingabe);
			i = ratewort.indexOf(eingabe, i + 1);
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

		String wort = "haus";
		Scanner in = new Scanner(System.in);
		int versuche = 15;
		String anzeigeWort = fuellen(wort, '-');

		System.out.println("HANGMAN");
		System.out.println("*******");

		System.out.println("Sie haben 15 Versuche.");

		for (int i = versuche; i >= 0; i--) {
			System.out.println("Geben Sie einen Buchstaben ein:");
			char wahl = in.next().charAt(0);
			if (istEnthalten(wort, wahl)) {
				System.out.println(wahl + " ist richtig! Sie haben noch " + i + " Versuche.");
				anzeigeWort = ausgabe(anzeigeWort, wort, wahl);
				System.out.println(anzeigeWort);
				System.out.println();
				System.out.println("**************************************");
				System.out.println();
			}

			else {
				System.out.println(wahl + " ist falsch! Sie haben noch " + i + " Versuche.");
				anzeigeWort = ausgabe(anzeigeWort, wort, wahl);
				System.out.println(anzeigeWort);
				System.out.println("");
				System.out.println("**************************************");
				System.out.println("");
			}
			if (anzeigeWort.equals(wort)) {
				break;
			}
		}
		if (anzeigeWort.equals(wort)) {
			System.out.println("Herzlichen Glückwunsch! Sie haben gewonnen!");
		} else {
			System.out.println("Wie schade! Sie haben verloren.");
		}

		in.close();

	}

}
