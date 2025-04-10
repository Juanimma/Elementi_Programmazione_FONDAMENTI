package model;

public class Studente {
	
	String nome;
	String cognome;
	String email;
	Integer eta;
	
	Corso corso;

	public Studente(String nome, String cognome, String email, Integer eta, Corso corso) {
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.eta = eta;
		this.corso = corso;
	}

	
	public Studente(String nome, String cognome, String email, Integer eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.eta = eta;
	}
	
	
	public void iscriviAlCorso(Corso corso) {
		if(this.corso == null) {
			System.out.println("Hai appena iscritto lo studente " + this.nome + " al corso " + corso.codice);
			this.corso = corso;			
		}else {
			System.out.println("Lo studente " + this.nome + " è già iscritta/o ad un corso");
		}
	}


	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", email=" + email + ", eta=" + eta + ", corso="
				+ corso + "]";
	}
	
	
	
}
