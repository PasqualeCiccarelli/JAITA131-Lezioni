package org.generation.__SpringBase.Models.Dtos;

import java.util.ArrayList;

/**
 * Dto: data tranfer Object
 * e un oggetto per trasferire dei dati
 * 
 * Dto = modello + trasferimento dati
 * 
 * Model: modello di rappresentazione di un oggetto, cioe una classe
 * 
 * cos'e una CLasse?
 * e un modello di un oggetto(modellino)
 */
public class Studente {
	
	private String name;
	private String cognome;
	private int id;
	
	private ArrayList<String> corsi;
	
	
	public Studente() {
		
	}
		
	
	public Studente(String name, String cognome) {
		this.name = name;
		this.cognome = cognome;
	}


	public Studente(String name, String cognome, ArrayList<String> corsi) {
		this.name = name;
		this.cognome = cognome;
		this.corsi = corsi;
	}



	public Studente(int id, String name, String cognome ) {
		this.name = name;
		this.cognome = cognome;
		this.id = id;
	}
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public ArrayList<String> getCorsi() {
		return corsi;
	}

	public void setCorsi(ArrayList<String> corsi) {
		this.corsi = corsi;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	
	
	

}
