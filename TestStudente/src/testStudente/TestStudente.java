package testStudente;

import testPersona.Persona;

public class TestStudente {

	public static void main(String[] args) {
		
		Studente s = new Studente("Java", "MArio","Rossi",32);
		
		System.out.println(s);
		s.dorme();
		
		Persona p = new Persona("Giuseppe","Verdi", 40);
		p.dorme();
		
		System.out.println(s instanceof Studente);//true
		System.out.println(p instanceof Studente);//folse
		System.out.println(s instanceof Persona);//true
		
		Persona ps = new Studente("Java", "Giuseppe", "neri", 31);
		//OIbject ops= new Studente ("Java", "Giuseppe", "neri", 31);
		//ps.studia(); --> non esiste il metodoi studia dentro persona 
		
		Persona[] elenco = {p,s};
		
		//POLIMORFISMO
		for (Persona X : elenco) {
			X.dorme();
		}

	}

}
