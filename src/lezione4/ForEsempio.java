package lezione4;

import java.util.Scanner;

public class ForEsempio {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quanti numeri vuoi sommare?");
		
		int numeriDaSommare = input.nextInt();
		
		// per poter vedere la somma mi servo di una variabile di accumulo, backup, supporto, esterna
		int somma = 0;
				
		System.out.println("Vuoi sommare " + numeriDaSommare + " numeri. Di volta in volta scrivi quali");
		
		for(int i = 0; i < numeriDaSommare; i++) {
			System.out.println("Inserisci il prossimo numero");
			int n = input.nextInt();
			
//			if(n % 2 == 0) {
//				somma += (2 * n);
//			}else {				
//				somma += n;
//			}
			 
			if(n % 2 == 0) {
				n *= 2; // n = n * 2
			}
			
			somma += n;
			System.out.println("La somma parziale vale: " + somma);
		}
		
		System.out.println("La somma totale dei numeri vale: " + somma);
		
//		Voglio migliorare questo ciclo for: ogni qual volta l'utente inserisce un numero pari il suo valore raddoppia.
//		Se l'utente inserisce il numero 42 viene stampato "DON'T PANIC" e non verrà sommato (dopo)
	}
}
