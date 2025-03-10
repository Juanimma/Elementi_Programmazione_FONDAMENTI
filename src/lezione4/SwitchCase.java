package lezione4;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		
		//switch(valore da controllare){
		// case valore:
		//  codice da eseguire;
		//  break;
		// default:
		
		int giornoSettimana = 7;
		
		switch (giornoSettimana) {
		case 1:
			System.out.println("Buon Lunedì");
			break;
		case 2:
			System.out.println("Buon Martedì");
			break;
		case 3:
			System.out.println("Buon Mercoledì");
			break;
		case 4:
			System.out.println("Buon giovedì");
			break;
		case 5:
			System.out.println(" Buon Venerdì");
			break;
		case 6: 
			System.out.println("Buon Sabato");
			break;
		case 7:
			System.out.println("Buona Domenica");
			Scanner mioScan = new Scanner(System.in);
			
			System.out.println("Se questa è l'ultima domenica del mese scrivi 0");
			int ultimaDomenica = mioScan.nextInt();	
				if(ultimaDomenica == 0) {
					System.out.println("Oggi è l'ultima domenica del mese, esprimi un desiderio");
				}
			
			break;
		default:
			System.out.println("Non riconosco questo valore");
			break;
			
		}
		
		
		//////////////////////////
		String meseAnno = "Giovedì";
		
		switch (meseAnno) {
		case "Gennaio":
			System.out.println("Sei nel primo mese dell'anno");
			break;
		case "Febbraio":
			System.out.println("Sei nel secondo mese dell'anno");
			break;
		case "Marzo":
			System.out.println("Sei nel terzo mese dell'anno");
			break;
		default:
			System.out.println("Non capisco quello che hai scritto, devi inserire il nome di un mese");
			break;
		}
		
		////Calcolo dei trimestri
		int meseCorrente = 10;
		
		switch (meseCorrente){
		case 1:
		case 2:
		case 3:
			System.out.println("Sei nel primo trimeste");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("Sei nel secondo trimeste");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("Sei nel terzo trimestr");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("Sei nel quarto trimestre");
			break;
		default:
			System.out.println("Non capisco il valore che mi hai fornito");
			break;
		}
		
	
		
		
	}
}
