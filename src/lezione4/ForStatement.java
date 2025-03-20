package lezione4;

public class ForStatement {
	public static void main(String[] args) {
		
		
//		ATT: la variabile i ha uno SCOPE locale, cioè legato solo al ciclo for ed è visibile solo lì dentro
//		i++ operatore di post incremento
		for(int i = 0; i < 5 ; i++) {
			System.out.println("Ciao, sono al giron num: " + (i + 1) + ". L'indice vale: " + i);
		}
		
		
		System.out.println("Ciclo for al contrario");
		
//		i-- operatore di post decremento
//		Ciclo For contrario
		for(int i = 5 ; i > 0; i--) {
			System.out.println(i);
		}
		
		
//		b è una varabile con scope Globale
		int b;
		
		for(b = 0; b < 10; b++) {
			System.out.println(b);
		}
		System.out.println("Il ciclo si interromper quando b < 10");
		System.out.println(b); // ----> 10
		
		
//		doppia variabile nel for
//		int a;
//		int c;
		
		for(int a = 0, c = 9; c >= 0; a++, c--) {
			System.out.println("a vale: " + a + "\tc vale: " + c);
		}
		
		//for con continue
		System.out.println("Con il continue");
		for(int i = 0; i < 5; i++) {
			if(i == 2) {
				continue; //il continue mi permette di saltare un giro
			}
			System.out.println(i);
		}
		
		//for con break;
		System.out.println("Con il break");
		for(int i = 0; i < 5; i++) {
			if(i == 2) {
				break; //il break interrompe il ciclo
			}
			System.out.println(i);
		}
		
		
		
		
		
	}
}
