package esercizioLibro;

import java.util.ArrayList;

public class Libreria {
	
	ArrayList<Libro> libreria = new ArrayList<Libro>();
	
	public Libreria() {
		System.out.println("ciao sono inutile");
	}

	public ArrayList<Libro> getLibreria() {
		return libreria;
	}

	public void setLibreria(ArrayList<Libro> libreria) {
		this.libreria = libreria;
	}

	@Override
	public String toString() {
		return "Libreria [libreria=" + libreria + "]";
	}
	
	public void aggiungiLibroBeneee(Libro libro) {
		libreria.add(libro);
	}
	
	public ArrayList<String> trova(String autore) {
		ArrayList<String> titoli = new ArrayList<String>();
		for (Libro libro : libreria) {
			if(autore.equals(libro.getAutore())) {
				titoli.add(libro.getTitolo());
				}
		}
		return titoli;
	}
	
}
