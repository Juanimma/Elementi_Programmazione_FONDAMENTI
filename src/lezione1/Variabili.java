package lezione1;

public class Variabili {

	public static void main(String[] args) {
//		La variabile è un'area di memoria alla quale diamo un nome ed associamo un valore
/**
 * 		Regole per la dichiarazione di variabili
 * 		- Non possono cominciare con numeri
 * 		- possono contenere lettere, numeri, _ 
 * 		- NON possono avere il nome delle keyword di java (int, byte, final, public)
 * 		- solitamente si utilizza il camelCase
 * 		- la dichiarazione è indipendente dall'assegnazione di un valore
 * 		- ATT: prima di utilizzare una variabile la devo prima dichiarare
 */

//		//DICHIARO UNA VARIABILE
//		int base;
//		int altezza;
//		
//		//ASSEGNO UN VALORE
//		base = 5;
//		altezza = 6;
		
//		//DICHIARO E ASSEGNO IN UNA SOLA RIGA
//		int base = 5;
//		int altezza = 6;

		
//		//DICHIARO SULLA STESSA RIGA
//		int base, altezza; //entrambe le mie variabili sono degli interi
//		base = 5;
//		altezza = 6;
		
//		DICHIARO E ASSEGNO SULLA STESSA RIGA
		int base = 5, altezza = 6;
		
		int perimetro = (base + altezza) * 2;
		int area = base * altezza;
		
		System.out.println("Perimetro: " + perimetro + "\nArea: " + area);
		
//		ADESSO RI-ASSEGNO UN VALORE ALLE MIE VARIABILI
		System.out.println("--------------------------");
		base = 9;
		altezza = 12;
		
		int perimetro2 = (base + altezza) * 2;
		int area2 = (base*altezza);
		
		System.out.println("Nuovo perimetro: " + perimetro2);
		System.out.println("Nuova Area: " + area2);
		
		
//		RI-ASSEGNO UN VALORE ALLE MIE VARIABILI
		System.out.println("--------------------------");
		base = 11;
		altezza = 18;
		
		perimetro = (base + altezza)*2;
		area = base * altezza;
		
		System.out.println("Nuovo Perimetro3: " + perimetro );
		System.out.println("Nuova Area3: " + area);
		
	}
}
