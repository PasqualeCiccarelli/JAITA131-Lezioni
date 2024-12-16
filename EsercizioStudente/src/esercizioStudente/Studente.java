package esercizioStudente;

import testPersona.Persona;
import java.util.ArrayList;

public class Studente extends Persona{
	
//	Un istituto scolastico deve gestire un registro degli studenti e tenere traccia dei rispettivi voti.
//	Lo studente è sottoclasse della classe persona, con cui condivide il nome, cognome, età e sesso.
//	La classe studente è identificata dai seguenti attributi(oltre a quelli di persona):
//	-matricola(Numero intero progressivo che si incrementa automaticamente)
//	-un elenco di voti presi(ArrayList di tipo Voto)
//	E dal metodo ottieniVoto col quale riceve un voto per ogni materia.
//	La classe Voto è identificata dai seguenti attributi:
//		-materia di tipo String che rappresenta le materie italiano, storia, geografia
//		-il voto di tipo double, che rappresenta il voto preso per quella materia. 
//	Uno studente è promosso se la media complessiva dei suoi voti è>=6
//	Dovete creare la classe studente e la classe voto con i relativi costruttori e metodi get,set e toString.
//	Creare infine la classe TestRegistro in cui create un insieme di studenti, trovare la media dei loro voti 
//	e visualizzare gli studenti promossi e quelli bocciati.
	
	private static int matricolaAumento= 1;
	private int matricola;
	private ArrayList<Voto> voti;
	
	public Studente(String nome, String cognome, int eta) {
		super(nome, cognome, eta);
		this.matricola = matricolaAumento++;
		this.voti = new ArrayList<>();
	}

	public int getMatricola() {
		return matricola;
	}

	public ArrayList<Voto> getVoti() {
		return voti;
	}
	
	public void ottieniVoto(String materia, double voto) {
		this.voti.add(new Voto(materia, voto));
	}
	
	public double calcoloMedia() {
		
		if (voti.isEmpty()) {
			return 0.0;
		}
		
		double somma =0;
		
		for (Voto voto : voti) {
			somma += voto.getVoto();
		}
		
		return somma/voti.size();
	}
	
	public boolean promosso() {
		return calcoloMedia() >= 6.0;
	}

	@Override
	public String toString() {
		return super.toString() + " matricola= " + matricola;
	}
	
	

	
	
	
	

}
