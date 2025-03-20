package lezione5;

import java.util.*;

public class EsempioArray {
	public static void main(String[] args) {
		
//		Estrai dei numeri casuali (da 1 a 90) senza ripetizione. La dimensionse dell'array stabilisce quanti numeri vuoi estrarre
		
//		Riempiamo l'array con dei numeri random
		int numDaEstrarre = 5;
		
		int[] numeriCasuali = new int[numDaEstrarre];
		
		Random rand = new Random();
//		int numRand = (int) Math.ceil(Math.random()*90);
		

		for(int i = 0; i < numeriCasuali.length; i++) {
			numeriCasuali[i] = rand.nextInt(90) + 1; //nextInt(90) produce un numero casuale da 0 a 90 (escluso)
		}
		
		for(int i = 0; i < numeriCasuali.length; i++) {
			System.out.print(" " + numeriCasuali[i]);
		}
		
				
	}
}
