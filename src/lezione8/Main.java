package lezione8;

public class Main {
	public static void main(String[] args) {
		
//		Istanzio un oggetto di tipo Punto; istanzion un oggetto della classe Punto
		Punto mioPunto = new Punto();
//		Leggo le prop del mioPunto
		System.out.println("La x di mioPunto vale: " + mioPunto.x);
		System.out.println("La y di mioPunto vale: " + mioPunto.y);
		
		
//		Istanzio un altro oggetto di tipo punto
		Punto mioPunto2 = new Punto(7, 9);
//		System.out.println(mioPunto2.toString());
		System.out.println(mioPunto2); //Avendo dichiarato il toString potrei anche non richiamare direttamente il metodo
		
		Rettangolo mioRettangolo = new Rettangolo();
		mioRettangolo.b = 50;
		mioRettangolo.h = 20;
		System.out.println(mioRettangolo.toString());
		
		Rettangolo mioRettangolo2 = new Rettangolo(7.3, 9.6);
		System.out.println(mioRettangolo2);
		
		
		//CREO UN SEGMENTO PARTENDO DA 2 PUNTI
		
		Punto puntoA = new Punto(2,3);
		Punto puntoB = new Punto(1,1);
		
		Segmento segmento = new Segmento(puntoA, puntoB);
		System.out.println(segmento.toString());
		
	
	}
	
}
