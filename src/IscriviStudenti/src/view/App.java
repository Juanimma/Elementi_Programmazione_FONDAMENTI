package view;

import model.Corso;
import model.Studente;

public class App {

	public static void main(String[] args) {
		Studente[] studenti = new Studente[100];
		
		Corso corso = new Corso("prog1", "Pierluigi Pierantola");
		
		Studente stud1 = new Studente("Anna", "Rossi", "a.rossi@example.com", 20, corso);
		//Provo ad iscivere stud1 ad un corso ma l'ho creata già con un corso quindi mi darà avviso che è già iscritta
		stud1.iscriviAlCorso(corso);
		studenti[0] = stud1;
		System.out.println(stud1);
		
		
		
		Studente stud2 = new Studente("Luca", "Verdi", "l.verdi@example.com", 26);
		stud2.iscriviAlCorso(corso);
		System.out.println(stud2);
		
	}
}
