package lezione0;

public class HelloWorld {

	//Questo è il metodo main, punto di ingresso di una qualsiasi applicazione
	public static void main(String[] args) {
		//dichiaro una variabile, devo inserire anche il tipo di dato
		String mioNome;
		
		//assegno un valore alla variabile
		mioNome = "Dario";
		
		//istanzio una variabile (di tipo intero) su una sola riga
//		byte eta = 35;
//		short eta = 135;
		int eta = 35;
		
//		uso il char per un solo singolo carattere
		char classificazione = 'A';
		
		double stipendio = 6.4554;
		
//		ALT + Shift + Y --> A capo automatico
		System.out.println("Hello, " + mioNome + " ! Hai " + eta + " anni e sei classificato come " + classificazione);
		
	}
	
}
