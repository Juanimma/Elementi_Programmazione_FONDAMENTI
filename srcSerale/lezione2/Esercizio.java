package lezione2;

public class Esercizio {
	public static void main(String[] args) {
		
//		Dati 2 numeri individua il maggiore tra i 2
// 		Dati 3 numeri individua il minore tra i 3
		
		int num1 = 5;
		int num2 = 6;
		int num3 = 7;
		
		int min;
		
		if(num1 < num2) {
			min = num1;
		}else if(num1 < num3 && num2 > num3) {
			min = num1;
		}
		
	}
}
