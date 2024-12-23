package org.generatio.jpa.restctrl;

import java.util.ArrayList;
import java.util.List;

import org.generatio.jpa.entities.Utente;
import org.generatio.jpa.services.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/utente")
public class UtenteCtrl {
	
	/**
	 * IOC - Dependency  injection
	 * IOC = inversion of contol - la dependency injection e un tipo di ioc
	 * cioe invecxe di creare a mano ke classi che mi servono con il costruttore
	 * es UtenteService utenteService = new UtenteServiceImpl()
	 * lo fa Spring
	 */
	@Autowired
	UtenteService utenteService;// -- new UtenteService
	
	
	/**
	 * ResponseEntity e una classe wrapper che puo contenere sia dati sia lo statuscode(200,404,500...)
	 * @return
	 */
	@GetMapping
	public ResponseEntity<List<Utente>>getAll(){
		try {
			
			List<Utente> utenti = utenteService.prendiTutti();
			
//			return new ResponseEntity<List<Utente>>(utenti, HttpStatus.OK);
			//modo 2 
			return ResponseEntity.ok(utenti);
			
		} catch (Exception e) {
			
			return ResponseEntity.internalServerError().body(new ArrayList<Utente>());
			
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Utente> getOneById(@PathVariable("id") long id){
		try {
			Utente u = utenteService.cercaPerId(id);
			if(u !=null) {
				
				return ResponseEntity.ok(u);
			}else {
				
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new Utente());
			}
					
		} catch (Exception e) {
			return ResponseEntity.internalServerError().body(new Utente());
		}
	}
	
	@PostMapping
	public ResponseEntity<Utente> addOne(@RequestBody Utente utente) {
		//TODO: process POST request
		try {
			utenteService.aggiungi(utente); //funziona per riferimentop:
			//l'utente arriva dla client senza id, viene passato al service e poi al repository, quando vienene
			//persistito/salvato mySQL mette un id
			//e me  lo ritrovo valorizzato nell'oggetto
			
			return ResponseEntity.ok(utente);
		} catch (Exception e) {
			return ResponseEntity.internalServerError().body(new Utente());
		}
		
	}
	
	
}
