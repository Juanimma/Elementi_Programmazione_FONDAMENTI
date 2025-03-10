package lezione0;

public class EsempioCalcolatrice {

	public static void main(String[] args) {
//		Dati 2 numeri interi calcola tutte le operazioni
		
		int num1 = 22;
		int num2 = 9;
		
		int somma = num1 + num2;
		System.out.println("Addizione: " + somma);
		
		int diff = num1 - num2;
		System.out.println("Differenza: " + diff);
		
		int molt = num1 * num2;
		System.out.println("Moltiplicazione: " + molt);
		
		double div = (double) num1 / num2;
		System.out.println("Divisione: " + div);
		
		//STESSO ESEMPIO PARTENDO DA 2 DOUBLE
		double num3 = 47.32;
		double num4 = 9.3;
		
		double somma2 = num3 + num4;
		double diff2 = num3 - num4;
		double molt2 = num3 * num4;
		double div2 = num3 / num4;
		
		System.out.println("Addizione: " + somma2);
		System.out.println("Differenza: " + diff2);
		System.out.println("Moltiplicazione: " + molt2);
		System.out.println("Divisione: " + div2);
		
	}
}
