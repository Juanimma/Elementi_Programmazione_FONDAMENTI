package lezione4;

public class While {

	public static void main(String[] args) {
		//Con il while entriamo nei cicli indefiniti: cioè non so quante volte eseguirà il codice prima di trovare il risultato che voglio ottenere
		
		//SINTASSI: while(condizione){   }
		
		boolean condizione = true;
		
		int i = 0;
		
		while(condizione) {
			i++;
			System.out.println("tentativo numero: " + i);
			
			double casuale = Math.random();
			
			if(casuale > 0.98) {
				condizione = false;
				System.out.println(casuale);
			}
		}
		
		
		////ESEMPIO 2
		int a = 1;
		
		while(a <= 10) {
			System.out.println(a);
			a++;
		}
		
		System.out.println("Stop");
		
		
		//ESEMPIO 3
		String[] giorni = {
				"Lunedì",
				"Martedì",
				"Mercoledì",
				"Giovedì", 
				"Venerdì",
				"Sabato", 
				"Domenica"
		};
		
		
		int contatore = 6;
		//Questo stampa solo i giorni pari
		while(contatore < giorni.length) {
			if(contatore % 2 == 0) {
				System.out.println("giorno n: " + contatore + " è " + giorni[contatore]);
				contatore++;
			}
		}
		
		
		// TABELLINA DEL 5
		
		int c = 1;
		
		while(c <= 10) {
			int risultato = c * 5;
			System.out.println(" 5 x " + c + " = " + risultato);
			c++;
		}
		
		
		//ESEMPIO do - while
		int x = 10;
		
		do {
			if((x % 3 == 0) || (x % 3 == 1)) {
				continue;
			}
			for(int j = 0; j < x; j++) {
				System.out.print(".*");
			}
			System.out.println("");
		}while(--x >= 0);
	
		//ESEMPIO 2
		
		System.out.println("Somma i primi n numeri naturali");

		int counter, somma, n;
		
		n = 15;
		counter = 0;
		somma = 0;
		
		do {
			somma += counter;
			counter++;
		}while(counter <= n);
		
		System.out.println("la somma dei primi " + n + " numeri naturali vale: " + somma);
	}
}
