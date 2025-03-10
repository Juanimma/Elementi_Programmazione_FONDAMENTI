package lezione2;

import java.util.Scanner;

public class IfStatement {
	public static void main(String[] args) {
		
//		If statement
/**
 * 		if (condizione){
 * 			codice da eseguire se la condizione è TRUE
 * 		}else{
 * 			codice da eseguire se la condizione è FALSE
 * 		}
 */
		
		int num1 = 10;
		int num2 = 9;
		
		boolean c = (num1 == num2);
		
		if(c) {
			System.out.println("I numeri " + num1 + " e " + num2 + " sono uguali");
		}else {
			System.out.println("I numeri " + num1 + " e " + num2 + " sono diversi");
		}
		
//		/////////////////////
		
		double b1 = 0.23;
		double b2 = 0.23;
		
		if(b1 == b2) {
			System.out.println("I numeri " + b1 + " e " + b2 + " sono uguali");
		}else {
			System.out.println("I numeri " + b1 + " e " + b2 + " sono diversi");
		}
		
		
//		Esempio patente di Guida
		System.out.println("Quanti anni hai ?");
		Scanner mioScan = new Scanner(System.in);
		
		int etaUser = mioScan.nextInt();
		
		if(etaUser < 15) {
			System.out.println("Mi spiace, non puoi guidare nulla");
		}else if(etaUser < 18) {
			System.out.println("Non puoi guidare l'auto");
		}else if (etaUser < 21) {
			System.out.println("Puoi guidare l'auto ma non la moto");
		}else {
			System.out.println("Puoi guidare l'auto e la moto");
		}
	
	}
}
