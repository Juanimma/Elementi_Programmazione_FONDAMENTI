package lezione1;

public class Stringhe {
	public static void main(String[] args) {
		//LE STRINGHE NON APPARTENGONO ALLA FAMIGLIA DEI TIPI PRIMITIVI
		String mioNome = "Dario"; //Di solito si utilizza questa dichiarazione
		String mioCognome = new String("Mennillo"); //Si può anche utilizzare il suo costruttore
		
		
		//voglio unire due stringhe: utilizzo l'operatore + (concatenazione)
		
		String nomeCompleto = mioNome + " " + mioCognome;
		
		System.out.println(nomeCompleto);
		
		
		// Posso anche trasformare i tipi primitivi in stringhe
		int mioValue = 42;
		String daIntAString = Integer.toString(mioValue); //Integer si chiama classe wrapper
		
		System.out.println(daIntAString);
		System.out.println(3+2);
		System.out.println(3 + mioValue);
		System.out.println(3 + daIntAString);
		
		//ESEMPIO
		String corso = "Elementi di Programmazione";
		String nomeDocente = "Dario Mennillo";
		String nomeRespo = "Egle Risola";
		String aziendaForm = "Immaginazione e Lavoro";
		
		String presentazione = "Corso:" + corso + "\nDocente: " + nomeDocente + "\nResponsabile: " + nomeRespo + "\nAzienda di Formazione" + aziendaForm;
		
		System.out.println(presentazione);
		
		
	}
}
