package lezione8;

public class Segmento {

	Punto a;
	Punto b;
	
	//ATT: a e b sono 2 oggetti di tipo Punto
	public Segmento(Punto a, Punto b) {
		this.a = a;
		this.b = b;
	}

	
	@Override
	public String toString() {
		return "Segmento [a=" + a + ", b=" + b + "]";
	}
	
}
