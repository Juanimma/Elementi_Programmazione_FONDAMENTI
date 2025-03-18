package lezione4;

public class ArrayString {

	public static void main(String[] args) {
	
//	Creo un array di stringhe
	
	String[] frutta = new String[3];
	frutta[0] = "Mela";
	frutta[1] = "Pesca";
	frutta[2] = "Kiwi";
	
	
	String[] colori = {"Rosso", "Giallo", "Blu", "Verde", "Rosa"};
	for(int i = 0; i < colori.length; i++) {
		int n = i + 1;
		System.out.println(n + " - " + colori[i]);
	}
	
//	Esempio: lo scontrino della spesa
	String[] cose = {"Acqua", "Carne", "Insalata", "Pesce", "Nutella", "Birra"};
	double[] prezzi = {1.80, 12.4, 0.2, 16.52, 7.5, 3.5};
	
//	Stampo i prodotti con i relativi prezzi e calcolo il totale
	double totale = 0;
	
	for(int i = 0; i < cose.length; i++) {
		String descrizione = cose[i] + " - " + prezzi[i] +  " €";
		totale += prezzi[i];
		System.out.println(descrizione);
	}
	
	System.out.println("Totale: € "+ totale);
	
	
	}
}
