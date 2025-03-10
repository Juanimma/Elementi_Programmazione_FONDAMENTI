package lezione2;

public class OperatoriLogici {
	public static void main(String[] args) {
//	OPERATORI LOGICI && (AND) , || (OR) , ! (NOT)
//  mi permettono di mettere assieme più condizioni
		
	// Mesi e trimestri
		
	int mese = 10;
	
	if(mese >= 1 && mese <= 3) {
		System.out.println("Sei nel primo trimestre");
	}else if(mese >= 4 && mese <= 6) {
		System.out.println("Sei nel secondo trimestre");
	}else if(mese >= 7 && mese <= 9) {
		System.out.println("Sei nel terzo trimestr");
	}else if(mese >= 9 && mese <= 12) {
		System.out.println("Sei nel quarto trimestre");
	}else {
		System.out.println("Non posso valutare questo mese");
	}
		
//	Night Club: per entrare al Club Javisti Anonimi devi essere maggiorenne e avere l'invito scritto 
	
	int etaUser = 35;
	boolean invito = true;
	
	if(etaUser >= 18 && invito) {
		System.out.println("Benvenuto, puoi entrare!!");
		
	}else if(etaUser < 18 && invito) {
		System.out.println("Mi spiace, anche se hai l'invito non puoi comunque entrare");
		
	}else if(etaUser >= 18 && !invito) { //!invito nega la condizione --> invito == false
		System.out.println("Mi spiace, hai l'eta giusta ma non hai l'invito per poter entrare");
	}
	else {
		System.out.println("Mi spiace, non puoi entrare. Non hai l'invito e non sei maggiorenne");
	}
	
	
	
	}
}
