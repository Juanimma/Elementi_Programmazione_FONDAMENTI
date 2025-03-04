package lezione1;

public class Caratteri {
	public static void main(String[] args) {
		
		char c1 = 'a';
		char dollaro = '\u0024'; //dollaro
		char mR = '\u00AE'; // marchio registrato
		
		System.out.println(c1);
		System.out.println(dollaro);
		System.out.println(mR);
		
//		Voglio rendere maiuscolo un carattere
		System.out.println(Character.toUpperCase(c1));
		
	}
}
