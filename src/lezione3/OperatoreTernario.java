package lezione3;

public class OperatoreTernario {

	public static void main(String[] args) {
		//L'operatore ternario mi permette di condesare un flusso gestito solo con if-else
		int a = 5;
		int b = 5;
		
		if(a == b) {
			System.out.println("I nuomeri sono uguali");
		}else {
			System.out.println("I numeri sono diversi");
		}
		
		//Sintassi op ternario ---> condizione ? seTrue: seFalse

		String risultato = (a == b) ? "Sono uguali": "Sono diversi";
		System.out.println(risultato);
		
		//NIGHT CLUB - si entra se maggiorenni
		int eta = 35;
		boolean invitoScritto = true;
		
		String messaggio = (eta >= 18 && invitoScritto)? "Puoi entrare": "Non puoi entrare";
		System.out.println(messaggio);
		
		
	}
}
