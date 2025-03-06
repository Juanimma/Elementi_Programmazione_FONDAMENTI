package esercitazioni;

import java.util.Scanner;

public class Esercizio1Hello {
	public static void main(String[] args) {
//		String nome = "Dario";
//		String cognome = "Mennillo";

		Scanner mioScanner = new Scanner(System.in);
		
		System.out.println("Inserisci il tuo nome");
		String nome = mioScanner.nextLine();
		
		System.out.println("Inserisci il tuo cognome");
		String cognome = mioScanner.nextLine();
		
		System.out.println("Ciao, " + nome + " " + cognome);
		
		mioScanner.close();
	}
}
