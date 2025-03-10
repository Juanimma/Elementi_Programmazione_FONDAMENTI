package esercitazioni;

import java.util.Scanner;

public class Esercizio1 {
	public static void main(String[] args) {
		
//		String nome = "Dario";
//		String cognome = "Mennillo";

		//Voglio chiedere direttamente all'utente come si chiama
		System.out.println("Scrivi il tuo nome: ");
		Scanner mioScan = new Scanner(System.in);
		
		String nome = mioScan.nextLine();

		System.out.println("Scrivi il tuo cognome: ");
		
		String cognome = mioScan.nextLine();
		
		
		System.out.println("Ciao " + nome + " " + cognome);
		
		
//		Voglio inserire un numero 
		System.out.println("Inserisci un numero intero");
		int numeroIntero = mioScan.nextInt();
		
		System.out.println("Inserisci un numero double");
		double numeroDou = mioScan.nextDouble();
		
		
		System.out.println(numeroIntero +  " " + numeroDou);
	}
}
