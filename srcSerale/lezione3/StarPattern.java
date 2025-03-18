package lezione3;

public class StarPattern {

public static void main(String[] args) {
	
	//Riprodurre il seguente pattern
	//  *****
	//  *****
	//  *****
	//  *****
	//  *****
	
	for(int i = 0; i < 5; i++) { //Questo crea le righe
		
		for(int j = 0; j < 5; j++) { //Questo crea le colonne
			
			System.out.print(" * ");
		}
		System.out.println();
	}
	
	
	//STAMPA IL SEGUENTE PATTERN
	// *
	// * *
	// * * *
	// * * * *
	// * * * * *
	System.out.println("Triangolo");
	for(int i = 0; i < 5; i ++) {
		for(int j = 0; j <= i; j++) {
			System.out.print(" * ");
		}
		System.out.println();
	}
	
	//STAMPA IL SEGUENTE PATTERN
	//* * * * * 
	//* * * *
	//* * *
	//* *
	//*
	System.out.println("Triangolo capovolto");
	for(int i = 5; i >= 1; i--) {
		for(int j = 0; j < i; j++) {
			System.out.print(" * ");
		}
		System.out.println("");
	}
	
	//STAMPA IL SEGUENTE PATTERN
	//  	*
	//     * *
	//    * * *
	//   * * * *
	//  * * * * *
	System.out.println("La piramide");
	for(int i = 0; i < 5; i++) {
		
		for(int j = 5; j > i; j--) {
			System.out.print(" ");
		}
		
		for(int k = 0; k <= i; k++) {
			System.out.print("* ");
		}
		
		System.out.println();
	}
	
	
	//STAMPA IL SEGUENTE PATTERN
	// * * * * *
	//  * * * *
	//   * * *
	//    * * 
	//     *
	
	
	//STAMPA IL SEGUENTE PATTERN
	//	    *
	//     * *
	//    * * *
	//   * * * *
	//  * * * * *
	//   * * * *
	//    * * *
	//     * * 
	//      *
	
	//Salva i seguenti numeri  in tre variabili e poi ordinali in modo crescente5 2 7 
	// 2 5 7
	
	int a = 5;
	int b = 2;
	int c = 7;
	
	
	
	
	
}
}
