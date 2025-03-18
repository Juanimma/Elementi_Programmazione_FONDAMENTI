package lezione3;

import java.util.Scanner;

public class EsempioFor {
	public static void main(String[] args) {
	
// All'utente viene chiesto quanti numeri vuole sommare
		System.out.println("Caro utente, quanti numeri vuoi sommare ? ");
		
		Scanner scann = new Scanner(System.in);
		
		int numDaSommare = scann.nextInt();
		
		System.out.println("Ho capito, vuoi sommare " + numDaSommare + " numeri. \nForniscimeli di volta in volta") ;
		
		int somma = 0; //variabile di backup, accumulo, accessoria. Questa verrà incrementata dal ciclo for
		
		for(int i = 0; i < numDaSommare; i++) {
			System.out.println("Inserisci il prossimo numero");
			int n = scann.nextInt();
			
			somma += n; //somma = somma + n
			
			System.out.println("La somma parziale vale " + somma);
		}
		
		System.out.println("La somma totale vale: " + somma);
		
		
//		UPGRADE: se l'utente inserisce un numero pari questo viene raddoppiato e poi sommato
		
	}
}
