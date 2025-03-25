package lezione4;

import java.util.ArrayList;
import java.util.Random;

public class EsempioForArray {
	
	public static void main(String[] args) {
		
		int dimensione = 6; //dimensione dell'array di numeri casuali
		
		int[] numeriCasuali = new int[dimensione];
		
		
		Random rand = new Random();
		
		//Vado a riempire l'array con un while()
		int contatore = 0;
		int tentativi = 0;
		
		while(contatore < dimensione) {
			//creo il num casuale e lo controllo di volta in volta
			int numCasuale = rand.nextInt(100) + 1; //da 1 a 100
			
			//Voglio verificare che il numero sia già presente nell'array
			boolean presente = false;
			for(int i = 0; i < contatore; i++) {
				if(numeriCasuali[i] == numCasuale) {
					presente = true;
					tentativi++;
					break; //esce dal for
				}
			}
			
			if(!presente) { //se non è presente lo aggiunge
				numeriCasuali[contatore] = numCasuale;
				contatore++;
			}
		}
		
		
		//Questo legge una volta completato l'array
		for(int i = 0; i < numeriCasuali.length; i++) {
			System.out.println(numeriCasuali[i]);
		}
		System.out.println("Ho impiegato: " + tentativi + " tentativi");
		
	}

}
