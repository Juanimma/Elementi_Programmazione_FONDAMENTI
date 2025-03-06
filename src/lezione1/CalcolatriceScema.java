package lezione1;

import java.math.BigDecimal;

public class CalcolatriceScema {
	
	public static void main(String[] args) {
// 	Dati in input 2 interi, calcola tutte e 4 le operazioni matematiche
		
	int value1 = 52;
	int value2 = 46;
	
	int result1 = value1 + value2;
	System.out.println("Addizione: " + result1);
	
	int result2 = value1 - value2;
	System.out.println("Sottrazione: " + result2);
	
	int result3 = value1 * value2;
	System.out.println("Moltiplicazione: " + result3);
	
	double result4 = (double) value1 / value2;
	System.out.println("Divisione: " + result4);
	
	int result5 = value1 % value2;
	System.out.println("Resto della divisone " + result5);
	
	
//  Dati due valori double calcola tutti i risultati
	
	System.out.println("ADESSO con valori DOUBLE");
	
	double value3 = 5.12;
	double value4 = 8.6;
	
	double result6 = value3 + value4;
	double result7 = value3 - value4;
	double result8 = value3 * value4;
	double result9 = value3 / value4;
	
	System.out.println("Addizione: " + result6);
	System.out.println("Sottrazione: " + result7);
	System.out.println("Moltiplicaizone: " + result8);
	System.out.println("Divisione: " + result9);
	
	
	
	System.out.println("---------Big Decimal------");
	String valoreSomma = Double.toString(result6);
	System.out.println("La somma adesso è " + valoreSomma); //Att: valoreSomma è una String
	
	
	BigDecimal bigDecimaleValore = new BigDecimal(result6);
	System.out.println(bigDecimaleValore.floatValue());
	
	System.out.println("--------Classe Math-------");
	double radQuadRes8 = Math.sqrt(result8);
	System.out.println("Radice di result8: " + radQuadRes8);
	
	double absRes8 = Math.abs(result8);
	System.out.println("Valore assoluto di result8 " + absRes8);
	
	double rand = Math.round(Math.random() * 10);
	System.out.println(rand);
	}
}
