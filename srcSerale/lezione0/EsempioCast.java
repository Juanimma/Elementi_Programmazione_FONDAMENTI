package lezione0;

public class EsempioCast {

	public static void main(String[] args) {
//		byte mioNum = 350; // non posso "sfondare" lo slot di memoria che sto utilizzando poiché byte va da -127 a +128
		
		//Soluzione 1, cast del dato. Ovvero forzare una variabile ad essere di un determinato tipo
		
		byte mioNum = (byte)350;
		System.out.println("mioNum vale: " + mioNum);
		
		byte miaEta = 35;
		byte etaStud = 23;
		
		//Anche in questo caso devo fare il cast a byte poiché le operazioni matematiche di base sono "consentite" solo tra int poiché la JVM converte in int prima di eseguire un'operazione. Questo accade perché il rischio di overflow ("sfondare" la memoria) con i byte è dietro l'angolo
		byte diffEta = (byte) (miaEta - etaStud);
		System.out.println("La differenza tra la mia età e quella dello studente è di: " + diffEta +  " anni");
		
		//Altri esempi di casting
		int primoValue = 88;
		int secondoValue = 42;
		
		System.out.println("Cast da int a short");
		short primoValueSh = (short) primoValue;
		short secondoValueSh = (short) secondoValue;
		
		System.out.println("Primo valore: " + primoValueSh + "\nSecondo Valore: " + secondoValueSh);
		
		System.out.println("Cast da int a byte");
		byte primoValueBy = (byte) primoValue;
		byte secondoValueBy = (byte) secondoValue; 
		
		System.out.println("Primo valore: " + primoValueBy + "\nSecondo Valore: " + secondoValueBy);
		
		
		//Shortcut: ALT + CTRL + frecciagiù copia e incolla una riga in basso
		//ALT + frecciasugiù sposta la riga di codice in alto o in basso
		
		System.out.println("Cast da int a double");
		
		int value1 = 54;
		int value2 = 3254;
		
		double value1DB = (double) value1;
		double value2DB = (double) value2;
		System.out.println("Value1: " + value1DB + "\nValue2 " + value2DB);
		
		System.out.println("Cast da double a int");
	
		double mioDB1 = 66.32;
		
		int mioDB1Int = (int) mioDB1;
		System.out.println(mioDB1Int);
		
		//promotion: passo da un tipo più piccolo ad uno più grande
		short mioSh1 = 53;
		int mioInt = mioSh1;
		System.out.println(mioInt);
		
//		var miaEta2 = 35;
//		System.out.println(miaEta);
	}
	
}
