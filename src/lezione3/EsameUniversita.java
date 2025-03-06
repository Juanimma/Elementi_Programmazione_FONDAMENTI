package lezione3;

import java.util.Scanner;

public class EsameUniversita {
//Crea un programma per valutare gli esami all'università.
// L'esame scritto è uno sbarramento per l'esame orale
	
	public static void main(String[] args) {
		
		final int VOTO_MAX = 30;
		final int VOTO_MIN = 0;
		
		double studente = Math.floor( (Math.random() * 13) + 1 );
		System.out.println("Lo studente selezionato è il numero " + studente);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci il tuo voto scritto");
		
		int votoScritto = scanner.nextInt();
		
		if(votoScritto >= VOTO_MIN && votoScritto <= VOTO_MAX) {
		
			if(votoScritto >= 18) {
				System.out.println("Con un voto scritto di " + votoScritto + " puoi accedere all'esame orale");
				
				System.out.println("Inserisci il voto del tuo esame orale");
				int votoOrale = scanner.nextInt();
				
				if (votoOrale > VOTO_MIN && votoOrale <= VOTO_MAX) {
					if(votoOrale >= 18) {
						double votoFinale = Math.round((double)(votoScritto + votoOrale)/2);
						System.out.println("Bravo, hai superato l'esame orale. Quindi hai superato tutto l'esame con voto " + votoFinale);
					}else {
						System.out.println("Mi spiace non hai superato l'esame orale. Quindi non hai superato l'esame");
					}
				}else {
					System.out.println("Hai inserito un voto non valido");
				}
			}else {
				System.out.println("Non puoi accedere all'orale. Ritenta al prossimo appello");
			}
		
		}else {
			System.out.println("Hai inserito un voto non valido");
		}
		scanner.close();
		
	}
}
