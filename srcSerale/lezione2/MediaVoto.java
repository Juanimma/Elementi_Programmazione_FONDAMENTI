package lezione2;

import java.util.Scanner;

public class MediaVoto {
	public static void main(String[] args) {

//		In questo programma l'utente inserisce i suoi voti (Scritto, Orale) e verrà calcolata la media
//		Att: posso accedere al calcolo solo se entrambi i voti sono >= 18
		
		System.out.println("Scrivi il voto del tuo esame scritto");
			
		Scanner mioScan = new Scanner(System.in);
		
		int votoScritto = mioScan.nextInt();
		
		int votoOrale = 0;
		double mediaVoto = 0;
		
		final int MIN_VOTO = 1;
		final int MAX_VOTO = 30;
		
		if(votoScritto >= MIN_VOTO && votoScritto <= MAX_VOTO) {
		
			if(votoScritto >= 18) {
				System.out.println("Bravo/a , hai superato lo scritto");
				System.out.println("Inserisci il voto dell'orale");
				
				votoOrale = mioScan.nextInt();
				
				if(votoOrale >= MIN_VOTO && votoOrale <= MAX_VOTO) {
					if(votoOrale >= 18) {
						System.out.println("Bravo/a hai superato l'esame orale");
						mediaVoto = ((double) votoScritto + votoOrale)/2;
						System.out.println("Voto finale: " + mediaVoto);
					}else {
						System.out.println("Mi spiace non hai superato l'orale, quindi non hai superato l'esame");
					}		
				}else {
					System.out.println("Voto non valido, ci volevi provare di nuovo eh ?!?!?");
				}
				
			}else {
				System.out.println("Mi spiace, non superato lo scritto, quindi non puoi andare all'orale. Ritenta al prossimo appello");
			}
		
		}else {
			System.out.println("Mi hai fornito un voto non valido, ci hai provato eh ?!?!?");
		}
		
		
	}
}
