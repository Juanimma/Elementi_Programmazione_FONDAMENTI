package lezione5;

import java.util.Scanner;

public class WhileStatement {
	public static void main(String[] args) {
//		WHILE : cicli indefiniti
//		SINTASSI: while(condizione) { esegue fin tanto che la condizione è true }
		
		boolean condizione = true;
		
		int i = 0;
		
		while(condizione) {
			i++;
			System.out.println("Tentativo n: " + i);
			
			double casuale = Math.random(); //Estre un numero casuale tra 0 e 1
			if(casuale > 0.991) {
				condizione = false;
				System.out.println("Si chiude con: " + casuale);
			}
		}
	
		
//		ESEMPIO 2
		
		int a = 0;
		
		while(a <= 10) {
			System.out.println("Ciao " + a);
			a++;
		}
		
		System.out.println("Stop");
		
//		Scrivi la tabellina del 5
		System.out.println("SOLO WHILE");
		int c = 11;
		
		while(c <= 10) {
			int risultato = c * 5;
			System.out.println("5 x " + c + " = " + risultato );
			c++;
		}
		
		System.out.println("DO - WHILE");
//		Do-while : prima esegue qualcosa SEMPRE poi controlla la condizione
		int d = 11;
		do {
			int risultato = d * 5;
			System.out.println("5 x " + d + " = " + risultato );
			d++;
		}while(d <= 10);
		
		
//		while
		
		Scanner scan = new Scanner(System.in);
		
		int tent = 0;
		
		String parola = "";
		
		while(!parola.equals("ciaobello")) {
			System.out.println("Non puoi accedere se non hai la parola d'ordine");
			tent++;
			parola = scan.nextLine();	
		}
		
		System.out.println("Benvenuto");
		System.out.println("Hai usato " + tent + " tentativi per entrare");
	}
}
