package lezione7;

import java.util.Scanner;

public class MetodiAusiliari {
	
	
//	creo il metodo di benvenuto
//	modificatore di accesso(public) - modificatore static (il metodo appartiene alla classe) - tipo di ritorno (void) - nome del metodo
// tutto questo compone la firma del metodo (SIGNATURE)
	
	//	OSS su static: questi metodi possono essere richiamati da altre classi utilizzando il nome della classe nei quali sono dichiarati. Ovviamente questo non è necessario nel caso in cui venga richiamato all'interno della classe che lo dichiara
	public static void benvenuto() {
		System.out.println("Ciao benvenuto"); //scrivere nella console non vuol dire restituire qualcosa
	}
	
	public static String benvenuto2() {
		String saluto = "Ciao, benvenuto 2"; //variabile locale
		return saluto;
	}
	
	public static double calcolaQualcosa() {
		
		double num1 = 9.0;
		double num2 = 7.1;
		double somma = num1 + num2;
		
		return somma;
	}
	
//	num1 e num2 sono chiamati parametri
	public static double calcola(double num1, double num2) {
		double somma = num1 + num2;
		return somma;		
	}
	
//	Non sono obbligato ad avere un return se ho dei parametri in ingresso
	public static void  calcola2(double num1, double num2, String nomeUtente) {
		double somma = num1 + num2;
		System.out.println("Ciao, " + nomeUtente + " la somma è " + somma);
	
	}
	

	
	
	public static void main(String[] args) {
		
		System.out.println("Questo metodo (sotto) stampa un benvenuto");
		
//		Richiamo il metodo
		benvenuto();
		MetodiAusiliari.benvenuto();
		
//		System.out.println(benvenuto2());
		System.out.println("Dammi 2 numeri");
		Scanner scan = new Scanner(System.in);
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		double risultato2 = calcola(num1, num2);
		System.out.println(risultato2);
		
//		posso anche "acchiappare" un valore di restituzione e registrarlo in una variabile
		String saluto = benvenuto2(); //ATT: questo saluto non ha nessun collegamento con saluto della riga 16
		System.out.println(saluto);
		
		double risultato = calcolaQualcosa();
		System.out.println("Il risultato è " + risultato);
//		System.out.println("Il risultato è " + calcolaQualcosa());
	
		
//		richiamo il metodo calcola e gli passo 2 numeri 
		
		calcola2(6.2, 0, "Dario");
		
		
//		Anche se dichiarati, sempre fuori dal main, ma sotto il main posso richiamare un metodo
		double num3Metodi = metodo3(8);  
		System.out.println("il risultato dei 3 metodi è "  +num3Metodi);
		
	}
	
	
//  Metodi che richiamano metodi che richiamano metodi 
	public static int metodo1(int num) {
		return num;
	}
	
	public static int metodo2(int num) {
		return num * 2;
	}
	
	public static double metodo3(int num) {
		int calcolo = metodo1(num) + metodo2(num) + num;
		return calcolo;
	}
	
	
	
	
}
