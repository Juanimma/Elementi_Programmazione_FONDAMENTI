package lezione4;

import java.time.LocalDate;
import java.util.Date;

public class TraduzioneEngItaMesi {

	public static void main(String[] args){
		
		Date data = new Date();
		int giornoSettimana = data.getDay() ;
		System.out.println(giornoSettimana);
		
		String giornoITA = "";
		
		switch (giornoSettimana) {
		case 0: giornoITA = "Domenica"; break;
		case 1: giornoITA = "Lunedì"; break;
		case 2: giornoITA = "Martedì"; break;
		case 3: giornoITA = "Mercoledì"; break;
		default: break;
		}
		
		System.out.println("Oggi è " + giornoITA);
		
		LocalDate adesso = LocalDate.now();
		System.out.println(adesso);
	}
}
