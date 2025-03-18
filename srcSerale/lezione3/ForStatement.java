package lezione3;

public class ForStatement {

	public static void main(String[] args) {

		
//		SINTASSI: for(inizializzazione; condizione; aggiornamento)
		
//		For, è un costrutto che mi permette di ripetere del codice un numero finito di volte
		for(int i = 0; i < 11; i++) {
//			System.out.println("La var i vale: " + i);
			System.out.println(" 6 x " + i + "  = " + (6 * i));
		}

		for(int i = 1; i <= 10; i++) {
			System.out.println(" 5 x " + i + " = " + (5*i));
		}
		
//		Ciclo For al contrario
		for(int i = 10; i >= 0; i--) {
			System.out.println(" 4 x " + i + " = " + ( 4 * i));
		}
		
		
//		Esempio: scrivi i numeri da 1 a 100, individuando i multipli di 2
		for(int i = 0; i <= 100; i++) {
			if(i % 2 == 0) {
				System.out.println(i + " è pari");
			}else {
				System.out.println(i);
			}	
		}
		
//		ATT: la variabile i ha uno scope locale, ovvero sto dichiarando n volte la stessa variabile all'interno dei for
		
		
	}
	
}
