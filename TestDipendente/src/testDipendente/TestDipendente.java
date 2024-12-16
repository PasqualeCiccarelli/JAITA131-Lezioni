package testDipendente;

import java.util.ArrayList;

public class TestDipendente {

	public static void main(String[] args) {
		
//		Progettare una classe di nome Dipendente, sottoclasse di Persona. 
//		Tale classe prevede tre variabili di istanza, nome, cognome, età da Persona, e stipendio. 
//
//		Scrivere i vari costruttori e i metodi get() e set() per tutti gli attributi, e il toString() .
//		Aggiungere poi un metodo aumento(double percentuale), che incrementi lostipendio del dipendente
//		di una certa percentuale solo se l'età del dipendente è >50.
//		Scrivere una classe col metodo main per testare il programma, 
//		dichiarare un array di dipendenti e calcolare il totale degli stipendi.
		
		ArrayList<Dipendente> d = new ArrayList<Dipendente>();
		double somma =0;
		
		d.add(new Dipendente(2000, "mario","rossi", 30));
		d.add(new Dipendente(5000, "giuseppe","rossinoni", 30));
		d.add(new Dipendente(3000, "marcello","rossini", 30));
		
		for (Dipendente dipendente : d) {
			System.out.println(dipendente);//stampo col toString
			//non ho fatto override, quindi non e polimorfismo
			dipendente.aumenta(10);
			somma+=dipendente.getStipendio();//somma degli stipendi
		}
		System.out.println("somma degli stipendi "+somma);
	}

}
