package lezione6;

import java.util.Scanner;

public class Menu {
// 	METODI AUSILIARI
//	modificatore di accesso - modificatore static - tipo di ritorno - nome del metodo (FIRMA DEL METODO - signature)
	public static void stampaMenu() {
//		corpo del metodo
		System.out.println("----MENU----");
		System.out.println("1. Gioca Tombola (g)");
		System.out.println("2. Calcola (c)");
		System.out.println("3. Gioca ai dadi (d)");
		System.out.println("4. Esci (q)");
		System.out.println("------------");		
	}
	
	public static void giocaTombola() {
	}
	
//	In questo caso il tipo di ritorno è int, questo vuol dire che mi verrà restituito un numero
	
	public static int calcola() {
		int numero = 1; //Variabile locale, vive solo nel metodo nel quale è dichiarata
		return numero;
	}
	
	public static void main(String[] args) {
		
//		System.out.println(numero); //Qui non posso risalire alla variabile numero
		
		Scanner input = new Scanner(System.in);
		
		char scelta;
		
		
		do {
			
//			richiamo il metodo per stampare il menu
			stampaMenu();
			scelta = input.next().toLowerCase().charAt(0); //Raccolgo una stringa con next() ed estraggo la lettera  nella posizione 0 della stringa
			
			
			switch(scelta) {
				case 'g':
				case '1':
					System.out.println("Hai scelto di giocare alla tombola. Abbiamo estratto per te i seguenti numeri...");
					giocaTombola();
				break;
				
				case 'c':
				case '2':
					System.out.println("Hai scelto di calcolare qualcosa. I risultati sono...");
					System.out.println(calcola()); //stampo con il syso il valore restituito dal metodo calcola()
					
				break;
				
				case 'q':
					System.out.println("Stai uscendo dal programma..");
				break;
				
				default:
					System.out.println("Scelta non valida. Riprova.");
			}
			
			System.out.println();
		
		}while(scelta != 'q' && scelta != 'Q'); //quit
		
		System.out.println("Hai chiuso il programma");
	}
}
