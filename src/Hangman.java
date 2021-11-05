/**
 * 
 */

/**
 * @author Jens Hafemann
 *
 */
public class Hangman {

	/**
	 * 
	 * @param wort
	 *                <p>
	 *                :die zuletzt angezeigte Ausgabe<br>
	 *                nicht erratenen buchstaben werden mit "_" Dargestellt
	 *                </p>
	 * @param eingabe :Der Eingegebene Buchstabe
	 * @return String :neues wort zur Ausgabe
	 */
	static String ausgabe(String wort, char eingabe) {

		return wort;
	}

	static String fuellen(String zuratewort, char buchstabe ) {
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
		// TODO Auto-generated method stub

	}

}
