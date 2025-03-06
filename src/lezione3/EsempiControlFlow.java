package lezione3;

public class EsempiControlFlow {
	
	private static void stampaVoto(int orale, int scritto){
		System.out.println("Voto orale: " + orale);
		System.out.println("Voto orale: " + scritto);
	}
	
	public static void main(String[] args) {
		//OPeratori di confronto
		// ==
		// !=
		// > < >= <=
		
		int a = 3;
		int b = 4;
		
		boolean c1 = (a == b); //False
		boolean c2 = (a != b); //True
		boolean c3 = (a > b);
		boolean c4 = (a < b);
		boolean c5 = (a >= b);
		boolean c6 = (a <= b);
		
		System.out.println("La condizione c1 vale: " + c1);
		System.out.println("La condizione c2 vale: " + c2);
		System.out.println("La condizione c3 vale: " + c3);
		System.out.println("La condizione c4 vale: " + c4);
		System.out.println("La condizione c5 vale: " + c5);
		System.out.println("La condizione c6 vale: " + c6);
		
		
		//If else if else
		//if (condizione){codice eseguito se la cond è true}
		
		
		if(c1) {
			System.out.println("I numeri sono uguali");
		}else if(c2){
			System.out.println("I due numeri sono diversi tra loro");
		}else if(c3) {
			System.out.println("a è maggiore di b");
		}
		else{
			System.out.println("Non so valutarli");
		}
	
		/////////////////////////
		
		int mese = 8;
		
		if(mese >=1 && mese <= 3) {
			System.out.println("Sono nel primo trimestre");
		}else if(mese >= 4 && mese <= 6) {
			System.out.println("Sono nel secondo trimestre");
		}else if(mese >= 7 && mese <= 9) {
			System.out.println("Sono nel terzo trimestre");
		}else if(mese >= 9 && mese <= 12) {
			System.out.println("Sono nel quarto trimestre");
		}else {
			System.out.println("Non posso valutare questo mese");
		}
		
		
		//Esami università
		
		int scritto = 15;
		int orale = 25;
		
		//Primo caso professore severo: passo l'esame solo se entrambi gli esami hanno voto superiore al 18
		if(scritto >= 18 && orale >= 18) {
			System.out.println("Bravo/a, hai superato l'esame");	
			stampaVoto(scritto, orale);
			
		}else if(scritto < 18 && orale >= 18) {
			System.out.println("Mi spiace, non hai passato l'esame scritto. L'orale è andato bene");
			System.out.println("voto scritto: " + scritto);
			System.out.println("voto orale: " + orale);
			
		}else if(scritto >= 18 && orale < 18) {
			System.out.println("Mi spiace, non hai superato l'esame orale. Lo scritto è andato bene");
			System.out.println("voto scritto: " + scritto);
			System.out.println("voto orale: " + orale);
			
		}
		else {
			System.out.println("Mi spiace non hai superato l'esame. Entrambi non sono stati superati con voto di almeno 18");
			System.out.println("voto scritto: " + scritto);
			System.out.println("voto orale: " + orale);
			
		}
		
		
		//Esempio Esame con professore più buono. Basta che solo uno dei due voti sia maggiore di 18 e l'esame è superato
		
		if(scritto < 18 || orale >= 18) {
			System.out.println("Esame superato solo grazie all'orale, complimenti");
		}else if(scritto >= 18 || orale < 18) {
			System.out.println("Esame superato solo grazie allo scritto, complimenti");
		}else if(scritto >= 18 || orale >= 18) {
			System.out.println("Complimenti, esame superato!!");
		}else {
			System.out.println("Mi spiace, non hai superato l'esame, entrambi sono andati male");
		}
		
		
		
	}
}
