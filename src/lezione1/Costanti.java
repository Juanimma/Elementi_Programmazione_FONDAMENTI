package lezione1;

public class Costanti {
	
	
	public static void main(String[] args) {
	
		/**
		 * COSTANTI
		 * - solitamente si utilizza il MAIUSC nel nome
		 * - per definire una costante uso il modificatore final
		 */
		
		final double PI_GRECO = 3.14;
		
//		PI_GRECO = 3.145697; ATT: NON POSSO RIASSEGNARE UN VALORE AD UNA COSTANTE
		
		final double IVA = 0.22;
		
		final int MAX_VALUE = 100;
		final int MIN_VALUE = 1;
		
		//Voglio calcolare il cose dell'iva su un prodotto
		double costoProd = 25.9;
		
		double costoIva = (costoProd * IVA);
		
		System.out.println("Ho pagato in totale " + costoProd + "€ . L'iva mi è costata: " +costoIva + " €");
//		System.out.format("%.2f", costoIva);
		
		final char INIZIALE_NOME = 'D';
		System.out.println("L'iniziale del mio nome è " + INIZIALE_NOME);
		
	}
}
