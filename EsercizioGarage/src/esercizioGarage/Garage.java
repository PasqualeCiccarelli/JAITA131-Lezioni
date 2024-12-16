package esercizioGarage;

import java.util.ArrayList;

public class Garage {
		/*
			Creare un programma che simuli la gestione di un garage:
			Il codice deve permettere di parcheggiare singole macchine o gruppi di
			macchine in un garage, e stampare i veicoli attualmente presenti nel garage.
			Definite la macchina e il garage con gli attributi e i metodi che meglio
			pensate che descrivano una macchina e un garage, ponendo attenzione
			all'incapsulamento.
			Esempio:
			Quanti posti ha il parcheggio? 3
			Che macchina vuoi parcheggiare? Fiat Panda
			Che macchina vuoi parcheggiare? Ford Fiesta
			Che macchina vuoi parcheggiare? Renault Clio
			Il parcheggio x adesso ha questi veicoli:
			Fiat Panda
			Ford Fiesta
			Renault Clio

		 */
	
	ArrayList<Macchine> garage = new ArrayList<Macchine>();
	private int posti = 4;
	
	public String getGarage() {
		return garage.toString();
	}
	public int getPosti() {
		return posti;
	}
	public void setPosti(int posti) {
		this.posti = posti;
	}
	
	public void parcheggiaMacchinaBene(Macchine machina) {
		if(posti> 0) {
			garage.add(machina);
			posti--;
			System.out.println("macchina parcheggiata, ci sono ancora "+ posti + " posti rimanenti");
		} else {
			System.out.println("non ci sono posti mettiti in doppia fila li tanto i vigli non passano");
		}
	}
	
	
	
	
	
}
