package org.generatio.jpa.services;

import java.util.List;
import java.util.Optional;

import org.generatio.jpa.entities.Utente;
import org.generatio.jpa.repositories.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtenteServiceImpl implements UtenteService {
	
	//Spring inietta un'istanza di una classe concreta che implementa UtenteRepository
	@Autowired
	UtenteRepository utenteRepository; //= new SimpleJpaRepossitory<Utente, long>() questo lo fo autoweired che ci permette poi di usare findAll()

	@Override
	public List<Utente> prendiTutti() {
		// TODO Auto-generated method stub
		List<Utente> utenti = utenteRepository.findAll();
		for (Utente utente : utenti) {
			utente.setCognome(utente.getCognome().toUpperCase());
			utente.setPassword("************");
		}
		return utenti;
	}

	@Override
	public Utente cercaPerId(long id) {
		Optional<Utente> optional = utenteRepository.findById(id);
		if(optional.isPresent()){
			return optional.get();
		}else {
			return null;
		}
		
	}

	@Override
	public void aggiungi(Utente utente) {
		//save vuole un entita (non un dto)
		utenteRepository.save(utente);
		
	}

}
