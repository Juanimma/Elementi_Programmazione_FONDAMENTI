package lezione4;

import java.util.Random;

public class Array {
	public static void main(String[] args) {
		
//		Istanzio un array di numeri
		
		int[] numeri;
		
//		new: keyword utilizzata per creare un nuovo oggetto
//		int[4] sto stabilendo la dimensione dell'array. 10 posizioni: da 0 a 9
		numeri = new int[4];
		
//		assegno un valore a ciascuna posizione
		numeri[0] = 11;
		numeri[1] = 2;
		numeri[2] = 64;
		numeri[3] = 7;

//		leggo il valore all'interno del mio array
//		System.out.println(numeri[0]);
//		System.out.println(numeri[1]);
//		System.out.println(numeri[2]);
//		System.out.println(numeri[3]);
		
//		Voglio conoscere la lunghezza del mio array
		
		int l = numeri.length;
		
		for(int i = 0; i < numeri.length; i++) {
			System.out.println(numeri[i]);
		}
		
		
//		NOTAZIONE short  0 1 2 3 4  5
		int[] numPari = {2,6,8,4,22,12};
		
		int somma = 100;

		
		for(int i = 0; i < numPari.length; i++) {
			somma += numPari[i];
//			somma = somma + numPari[i];
		}
		
		System.out.println("La somma vale: " + somma);
	
		
//		ESEMPIO: individua tutti i numeri divisibili per 4 
		int[] numeriCasuali = {7,5,8,9,6,22,12,1,0,3,0,5,66,44};
		
		for(int i = 0; i < numeriCasuali.length; i++) {
			if(numeriCasuali[i] % 4 == 0 && numeriCasuali[i] != 0) {
				System.out.println("Il num " + numeriCasuali[i] + " è divisibile per 4");
				int divisione = numeriCasuali[i] / 4;
				System.out.println("Il risultato è: " + divisione);
			}
		}
		
//		ESEMPIO: riempire un array con un numeri casuali 
		int dimensioneArr = 5;
		
		int[] numCas2 = new int[dimensioneArr];
		
		Random rand = new Random(); 
		
		for(int i = 0; i < dimensioneArr; i++) { 
			//numCas2[i] = (int) Math.round( Math.random() * 10); //Math.random() produce un numero casuale tra 0 e 1
			numCas2[i] = rand.nextInt(10) + 1; //numero casuale tra 0 e 9
		}
		
		//Stampo gli elementi del mio array
		for(int i = 0; i < numCas2.length; i++) {
			System.out.println(numCas2[i]);
		}
		
		System.out.println(numCas2); //Questo stampa l'indirizzo della memoria
		
	}
}
