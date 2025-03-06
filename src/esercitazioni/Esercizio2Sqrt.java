package esercitazioni;

import java.util.Scanner;

public class Esercizio2Sqrt {

	public static void main(String[] args) {
		System.out.println("Inserisci un numero e io ne calcolerò la radice quadrata");
		
		Scanner mioScan = new Scanner(System.in);
		
		double numero = mioScan.nextDouble();
		
		double radice = Math.sqrt(numero);
		
		System.out.println("Il tuo numero " + numero + " ha radice " + radice);
	}
}
