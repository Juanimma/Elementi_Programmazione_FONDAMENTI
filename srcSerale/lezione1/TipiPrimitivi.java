package lezione1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TipiPrimitivi {
	public static void main(String[] args) {
		
		int num1 = 54;
		int num2 = 47;
		
//		Operazioni di base
		int somma = num1 + num2;
		int diff = num1 - num2;
		int molt = num1 * num2;
		double div = (double) num1 / num2; //Cast del dato da int a double
		
		System.out.println("Addizione: " + somma);
		System.out.println("Sottrazione: " + diff);
		System.out.println("Moltiplicazione: " + molt);
		System.out.println("Divisione: " + div);
		
//		Per ottenere la precisione che voglio devo utilizzare l'oggetto BigDecimal
		BigDecimal bD = new BigDecimal(div);
		System.out.println("Divisione con precisione: " + bD.floatValue());
		
		
	}
}
