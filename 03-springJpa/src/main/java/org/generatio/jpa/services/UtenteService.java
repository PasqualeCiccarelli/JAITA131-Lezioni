package org.generatio.jpa.services;

import java.util.List;

import org.generatio.jpa.entities.Utente;

public interface UtenteService {
	
	public List<Utente> prendiTutti();

	public Utente cercaPerId(long id);

	public void aggiungi(Utente utente);

}
