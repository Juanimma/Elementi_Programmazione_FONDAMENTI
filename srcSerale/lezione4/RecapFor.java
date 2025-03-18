package lezione4;

public class RecapFor {
	public static void main (String[] args) {
	
		for(int i = 0; i < 100; i++) {
			if(i == 42) {
				System.out.println("DON'T PANIC");
			}else {
				System.out.println(i);
			}
			
		}
		
//		continue rappresenta un "salto" all'interno del ciclo
		
		for(int i = 0; i < 10; i++) {
			if(i%3==0) {
				continue;  //Questa parola chiave interrompe l'iterazione passando alla successiva
			}
			System.out.println(i);
		}
		
		
		
//		break interrompe completamente il ciclo
		for(int i = 0; i < 10; i++) {
			if(i == 5) {
				break;
			}
			
			System.out.println(i);
		}
		
//		for con 2 variabili istanziate
		for(int a = 0, b = 9; b >= 0 ; b--, a++) {
			System.out.println("a vale: " + a + " - b vale: " + b);
		}
		
	}
}
