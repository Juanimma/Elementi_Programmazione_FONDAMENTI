package lezione4;

import java.util.Scanner;

public class Esercizio {

	public static void main(String[] args) {
		
		//Crea un programma che chiede all'utente di inserire numeri interi uno dopo l'altro fino a quando non inserisce il numero 0. Quando ha inserito questo numero stamperà "Bravo, hai trovato il numero per uscire dal gioco"
		
		System.out.println("Caro utente, inserisci dei numeri interi per scoprire cosa succede");
		
		Scanner scann = new Scanner(System.in);
//		int numero = 1;
//		do {
//			numero = scann.nextInt();	
//			System.out.println("Bene, hai inserito il numero " + numero);
//			
//		}while(numero != 0);
		
		while(scann.nextInt() != 0) {
			System.out.println("Inserisci un numero");
		}
		

		System.out.println("Bene, hai scoperto come uscire dal gioco");
	}
	
}
