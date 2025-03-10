package lezione2;

public class EsamiUniversita {
	public static void main(String[] args) {
		
		int votoScritto = 17;
		int votoOrale = 17;
		
		double votoFinale = 0;
		
//		Per superare l'esame devo aver superato 18 sia allo scritto sia all'orale
		if(votoScritto >= 18 && votoOrale >= 18) {
			System.out.println("Brava / o, hai passato l'esame ");
			votoFinale = ((double) votoScritto + votoOrale)/2;
		}else if (votoScritto < 18 && votoOrale >= 18) {
			System.out.println("Mi spiace, non hai passato l'esame perché il tuo voto scritto è < 18");
		}else if (votoScritto >= 18 && votoOrale < 18) {
			System.out.println("Mi spiace, non hai passato l'esame perché il tuo voto orale è < 18");			
		}else {
			System.out.println("Mi spiace, non hai passato né lo scritto nè l'orale");
		}
		
		
		System.out.println("Voto Finale: " + votoFinale);
		
//		Docente meno severo: basta passare uno dei due esami per avere l'esame intero superato 
		
//		if(votoScritto < 18 && votoOrale >= 18) {
//			System.out.println("Esame superato grazie al voto dell'esame orale");
//		}else if(votoScritto >= 18 && votoOrale < 18) {
//			System.out.println("Esame superato grazie al voto dell'esame scritto");
//		}else if(votoScritto >= 18 && votoOrale >= 18) {
//			System.out.println("Esame Superato con entrambi i voti, complimenti");
//		}else {
//			System.out.println("Mi spiace entrambi gli esami sono andati male");
//		}
		
		if(votoScritto > 18 || votoOrale > 18) {
			System.out.println("Bravo/a hai superato l'esame");
		}else {
			System.out.println("Mi spiace, non hai superato l'esame");
		}

//		If Annidato
//		ESAME REALE: posso accedere all'orale solo se ho passato prima lo scritto 
		System.out.println("Esame Reale: per accedere all'orale devi aver prima passato lo scritto");
		
		if(votoScritto >= 18) {
			System.out.println("Bene, puoi fare l'esame orale. Scritto: " + votoScritto);
			if(votoOrale >= 18) {
				System.out.println("Complimenti, hai superato l'esame");
				System.out.println("Scritto: " + votoScritto);
				System.out.println("Orale: " + votoOrale);
			}else {
				System.out.println("Mi spiace, dovrai rifare l'esame perché non hai passato l'orale");
			}
		}else {
			System.out.println("Mi spiace, non puoi accedere all'orale");
		}
	}
}
