package lezione1;

public class MiaDescrizione {

	public static void main(String[] args) {
		
		String mioNome = "Dario";
		int etaAttuale = 35;
		int prossimaEta = etaAttuale + 10;
		int precedenteEta = etaAttuale - 10;
		
//		nomeVar++ si chiama operatore di post incremento (prima leggo poi incremento la variabile
//		int annoProssEta = etaAttuale++;
		
//		++nomeVar si chiama operatore di pre incremento (prima incremento poi leggo)
//		int annoProssEta = ++etaAttuale;
		
		int annoProssEta = etaAttuale + 1;
		
//		int annoPrecEta = --etaAttuale;
		int annoPrecEta = etaAttuale - 1;
		
		String descrizione = "Ciao mi chiamo " + mioNome + 
		" e ho " + etaAttuale + " anni. Dieci anni fa avevo " + precedenteEta + " anni. Tra dieci anni avrò " + prossimaEta + " anni. Tra un anno avrò " + annoProssEta + ". L'anno scorso avevo " + annoPrecEta + " anni." ;
		
		System.out.println(descrizione);
		
	}
}
