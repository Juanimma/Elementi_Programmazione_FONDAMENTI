package model;

public class Corso {
	String codice;
	String docente;
	
	public Corso(String codice, String docente) {
		this.codice = codice;
		this.docente = docente;
	}

	@Override
	public String toString() {
		return "Corso [codice=" + codice + ", docente=" + docente + "]";
	}
	
	
	
}
