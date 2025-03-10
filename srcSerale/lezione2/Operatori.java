package lezione2;

public class Operatori {
	public static void main(String[] args) {
	
//		Operatori matematici + - * /  % 
		
//		Operatore di assegnazione =, +=, -=, *=, /=
		
//		Operatori di confronto o relazionali == (uguale) , != (diverso), > (maggiore), < (minore), >= (maggiore uguale), <= (minore uguale) ATT: tutte le volte che confronto qualcosa utilizzando questi operatori mi viene SEMPRE restituito un boolean
		
		
		int num1 = 1;
		int num2 = 2;
		
		boolean c1 = (num1 == num2); //False
		boolean c2 = (num1 != num2); //True
		boolean c3 = (num1 > num2); //False
		boolean c4 = (num1 < num2); //True
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		int num3 = 5;
		int num4 = 5;
		
		boolean c5 = (num3 >= num4);
		boolean c6 = (num3 <= num4);
		
		System.out.println(c5);
		System.out.println(c6);
		
	}
}
