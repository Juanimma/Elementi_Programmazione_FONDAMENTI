package lezione0;

public class TipiPrimitivi {
	
	public static void main(String[] args) {

		// I TIPI PRIMITIVI
		
		//Sto dichiarando una variabile di tipo byte con nome b e valore 1
		//byte b ---> dichiaro
		// = 15 ---> assegno
		
		//TIPI PRIMITIVI PER NUMERI INTERI
		byte b2;
		b2 = 29;

		byte b = 15;
		System.out.println("Byte: " + b); //Utilizzo il simbolo + per concatenare stringhe
		
		short sh = 23;
		System.out.println("Short: " + sh);
		
		int i = 35;
		System.out.println("Integer: " + i);
		
		long l = 42L;
		System.out.println("Long: " + l);
		
		//TIPI PRIMITIVI PER NUMERI CON LA VIRGOLA
		float f = 5.3f;
		System.out.println("Float: " + f);
		
		double d = 6.39;
		System.out.println("Double: " + d);
		
		
		//ALTRI 2 TIPI PRIMITIVI NON NUMERICI
		char c = 'a'; //carattere UNICODE singolo
		System.out.println("Char: " + c);
		
		boolean bo = true; //true o false, 1 o 0
		System.out.println("Boolean: " + bo);
	}

}
