package org.generatio.jpa.repositories;

import org.generatio.jpa.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository Layer == DAL data access layer
 * 
 * JpaRepository e uno delle svariate interffacce che posso estendere
 * 
 * T = generico -> Utente (entita)
 * ID = generico -> tipo della mia chiave primaria @Id - Long con la maiuscola perche i generici usano le classi wrapper 
 * Repository che contiene le query mappate sull'entita utente
 */
@Repository //opzionalale
public interface UtenteRepository extends JpaRepository<Utente, Long> {
	
}
