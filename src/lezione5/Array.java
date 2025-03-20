package lezione5;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		
//		Istanzio l'array
		int[] numeri = new int[5]; //new keyword utilizzata per istanziare un nuovo oggetto. [5] stabilisce la dimensione esatta del mio array
		
//		Per ogni indice assegno un valore. RICORDA: gli array sono oggetti 0-based
		numeri[0] = 10;
		numeri[1] = 5;
		numeri[2] = 8;
		numeri[3] = 74;
		numeri[4] = 7;
		
//		Riassegno il valore in un indice del mio array
		numeri[3] = 9;
		
//		numeri[5] = 111; ATT: non posso "sfondare" l'array, vado in out of bounds
		
		int dimensioneArr = numeri.length;
		
		//Stampo l'array
		System.out.println(numeri); //puntatore alla memoria
		
		//Leggo i singoli valori del mio array
		for(int i = 0; i < numeri.length; i++) {
			System.out.println(numeri[i]);
		}
		
//		Notazione short per array
		
		int[] arrayNumCas = {7,5,2,1,4,321,8,4};
		
		for(int i = 0; i < arrayNumCas.length; i++) {
			if(! (arrayNumCas[i] % 2 == 0)) {
				System.out.println("Il numero " + arrayNumCas[i] + " è dispari" );
			}
		}
		
		
//		Creo un array con una dimensione scelta dall'utente
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual è la dimensione dell'array ? ");
		
		int dimArr = scan.nextInt();
		
		int[] mioArr = new int[dimArr];
		
		//uso il for per scrivere l'array non per leggerlo

//		for(int i = 0; i < mioArr.length; i++) {
//			System.out.println("Inserisci un numerino intero");
//			mioArr[i] = scan.nextInt();
//		}

		int indice = 0;
		
		do {
			System.out.println("Inserisci un intero");
			mioArr[indice] = scan.nextInt();
			indice++;	
		}while(mioArr.length >= (indice+1));
		
		
		//Leggo il mio array
		System.out.println("Adesso leggerò l'array");
		for(int i =0; i < mioArr.length; i++) {
			System.out.println(mioArr[i]);
		}
		
		
		
		 
		
	}
}
