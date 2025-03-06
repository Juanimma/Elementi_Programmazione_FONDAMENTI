package lezione3;

public class IfAnnidati {
	
	public static void main(String[] args) {
		int i = 21;
		
		if(i % 2 == 0) {
			System.out.println(i + " è multiplo di 2");
			if(i % 3 == 0) {
				System.out.println(i + " è anche multiplo di 3");
			}else {
				System.out.println("");
			}
		}else {
			System.out.println("Il numero non è un multiplo di 2");
		}
	}

}
