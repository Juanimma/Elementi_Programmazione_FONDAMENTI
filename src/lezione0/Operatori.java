package lezione0;

public class Operatori {

	public static void main(String[] args) {
	
//		byte num1 = 1;
//		byte num2 = 35;
//		
//		//Cast del dato
//		byte somma = (byte) (num1 + num2);
//		
//		System.out.println(somma);
		
		int num1 = 71;
		int num2 = 4;
		
//		Uso gli operatori matematici per fare le 4 operazioni
		int somma = num1 + num2;
		System.out.println("La somma dei due numeri vale " + somma);
		
		int sottrazione = num1 - num2;
		System.out.println("La differenza tra i due numeri vale " + sottrazione);
		
		int moltiplicazione = num1 * num2;
		System.out.println("Il prodotto tra i due numeri vale " + moltiplicazione);
		
//		int divisione = num1 / num2; //operazione rischiosa
		double divisione = (double) num1 / num2; //CAST del dato
		System.out.println("Il quoziente vale " + divisione);
		
		
//		Esempio con double
		double num3 = 4.7;
		double num4 = 9.4;
		
		double somma2 = (num3 + num4);
		System.out.println(somma2);
		
		double sottr2 = num3 - num4;
		System.out.println(sottr2);
		
		double molt2 = num3 * num4;
		System.out.println(molt2);
		
		double div2 = num3 / num4;
		System.out.println(div2);
		
		
	

	}
}
