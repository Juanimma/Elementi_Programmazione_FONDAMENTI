package lezione6;

import java.util.Random;

public class Tombola {
	public static void main(String[] args) {
		
//		dimensione array numeri casuali
		int dimensione= 10;
		int[] numeriCasuali = new int[dimensione];
		
//		for (int i : numeriCasuali) {
//			System.out.println(i);
//		}
		
		Random rand = new Random();
		
//		voglio riempire l'array numeriCasuali con un while. Quindi il while si interromperà quando l'arry sarà pieno
		int contatore = 0;
		int tentativi = 0;
		
		while(contatore < dimensione) {
			
			int numeroSingoloCasuale = rand.nextInt(90) + 1;
			
			boolean presente = false;
			
//			Voglio verificare se il numero esiste nell'array
			for(int i = 0; i < contatore; i++) {
				if(numeriCasuali[i] == numeroSingoloCasuale) {
					presente = true;
					tentativi++; 
					System.out.println(numeroSingoloCasuale); //stampo solo il doppione
					System.out.println("Trovato nel punto: " + contatore);
					break;
				}
			}
			
				
//			se il numero da inserire non è presente nell'array allora farò contatore++
			if(!presente) {
				numeriCasuali[contatore] = numeroSingoloCasuale;
				contatore++;
			}

		}
		
		System.out.println("NUMERI ESTRATTI");
		
		for(int numero: numeriCasuali) {
			System.out.println(numero);
		}
		
		System.out.println("Impiega " + tentativi + " tentativi.");
	}
}
