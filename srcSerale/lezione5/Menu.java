package lezione5;

import java.util.Random;
import java.util.Scanner;

public class Menu {

//	Metodo Ausiliario
//	modificatore di accesso (public), static, tipo di ritorno(void), nome del metodo (giocaDadi()) - SIGNATURE del metodo
	
	public static void giocaDadi() {
		System.out.println("Hai scelto di giocare ai dadi");
		int facce = 6;
		int numero = 0; //Questo sono variabili LOCALI, ovvero con uno scope ben definito, ovvero vivono solo ed esclusivamente in questo metodo
		Random rand = new Random();
		numero = rand.nextInt(facce) + 1; // nextInt(10) tira fuori un numero da 0 a 9
		System.out.println("Il programma ha estratto il numero " + numero);
	}
	
	public static int estrai() {	
		return 150;
	}
	
//	fornisco dei parametri in ingresso. Quando richiamerò il metodo sono OBBLIGATO a passare in ingresso 2 numeri
	public static double calcola(double num1, double num2) {
		double divisione = num1 / num2;
		
		return (divisione);
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		char scelta;
		
		do {
			
			System.out.println("----MENU----");
			System.out.println("1. gioca (g)");
			System.out.println("2. calcola (c)");
			System.out.println("3. estrai numero > 100 e < 200 (s)");
			System.out.println("4. Esci (e)");
			System.out.println("------------");
			
			scelta = scan.next().toLowerCase().charAt(0);
			
			switch(scelta) {
			case 'g':
			case '1':
//			in questo case gioco con i dadi
				giocaDadi();

			break;
			case 'c':
			case '2':
				System.out.println("Hai scelto di calcolare qualcosa");
				
				System.out.println("Inserisci il primo numero: ");
				double x = scan.nextDouble();
				
				System.out.println("Inserisci il secondo numero");
				double y = scan.nextDouble();
				
				double risultato = calcola(x, y);
				System.out.println("Il risultato è " + risultato);
				
			break;
			case 's':
			case '3':
				System.out.println("Hai scelto di estarre un numero tra 100 e 200");
//				System.out.println(estrai());
//				Posso anche salvare all'interno di una variabile il risultato del metodo 
				int numeroEstratto = estrai(); 
				System.out.println("Il tuo numero estratto è: " + numeroEstratto);
			break;
			
			case 'e':
			case '4':
				System.out.println("Hai scelto di uscire dal programma");
			break;
			
			default:
				System.out.println("Non capisco il comando. Riprova!");
			}
			
			
		}while(scelta != 'e' && scelta != 'E');
		
	}
}
