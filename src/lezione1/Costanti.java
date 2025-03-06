package lezione1;

import java.math.BigDecimal;

public class Costanti {

	public static void main(String[] args) {
		double primoNumero = 42.12;
		System.out.println(primoNumero);
		
		primoNumero = 45.3;
		System.out.println(primoNumero);
		
		//per trasformare una variabile in una costante utilizzo il  final davanti alla dichiarazione del tipo
		//convenzione: solitamente le costanti vengono dichiare tutte in MAIUSC
		final double IVA = 0.22;
		final double PI = 3.14;
		
		final int MAX_VALUE = 100;
		final int MIN_VALUE = 0;
		
//		Non posso variare il valore di una costante ma la posso utilizzare all'interno di un qualsiasi calcolo
		//System.out.println(++MAX_VALUE); //MAX_VALUE = MAX_VALUE + 1
		
		//ESEMPIO semplice: calcolare quanto vale l'iva su 259.34 €
		double costo = 259.34;
		double valoreIVA = costo * IVA;
		BigDecimal val_Iva = new BigDecimal(valoreIVA);
		System.out.println("L'iva su " + costo + "€ vale: " + val_Iva.floatValue());
		
	}
	
}
