package org.generation.springbasedue.RestCttrl;



import java.util.ArrayList;
import java.util.List;

import org.generation.springbasedue.Model.Dto.StudenteDto;
import org.generation.springbasedue.Services.StudenteSrv;
import org.generation.springbasedue.Services.Interfaces.Studente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/studente")//path(mappatura) radice 
public class StudenteCtrl {
	/*
	 * DEpendency Injection - inversion of control
	 * 
	 * inversion of control:
	 * le classi invece che istanziarle io, voglio che le crei e gestisca Spring
	 * 
	 * Dependency Injection:
	 * e il framework che determina (su nostra indicazione) quali dipendenze inietttare(aggiungere o inserire)
	 * nella nostra classe
	 * 
	 * @Autowired inietta la dipendenza nella classe, cioe crea l'istanza e la assegna alla variabile
	 * StudenteSrv srv = new StudenteSrv(); //istanza
	 * 
	 * Dipende == ha bisogno di un istanza(la inizializza)
	 */
	@Autowired
	private Studente srv;
	
	/*
	 * Stessa cosa ma con un costruttore
	*/
//	@Autowired
//	public StudenteCtrl(StudenteSrv srv) {
//		this.srv = srv;
//	}
	
	
	/**
	 * path:/studente + GET
	 * @return
	 */
	@GetMapping
	public List<StudenteDto> getAll(){
		// non fate cosi e solo un esempio
		//StudenteSrv srv = new StudenteSrv(); //istanza
		return srv.getTutti();
	}
	
	/**
	 * {id} e un segnaposto
	 * path: /api/studente/2
	 * 
	 * @PathVariable prende il valore nell'url e lo assegana alla variabile idStudente 
	 * @return
	 */
	@GetMapping("/{id}")
	public StudenteDto getById(@PathVariable("id") int idStudente) {
		return srv.getUnoPerId(idStudente);
	}
	
	/**
	 * rotta: api/studente +POST
	 */
	@PostMapping(consumes= MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public StudenteDto addOne(@RequestBody StudenteDto studente) {
		srv.aggiungiStudente(studente);
		return studente;
	}
	
	/**
	 * path: api/studente + PUT
	 */
	@PutMapping
	public StudenteDto updateOne(@RequestBody StudenteDto studente) {
		
		StudenteDto trovato = srv.getUnoPerId(studente.getId());
		if(trovato.getId()==0) {
			return studente;  
			//non ho trovato lo studente da modificare, restituisco il json della request
		}
		
		return srv.modificaStudente(studente);
	}
	
	
	/**
	 * cancellane solo 1 
	 * path: api/studente/2 + delete
	 * @return
	 */
	@DeleteMapping("/{id}")
	public int deleteOne(@PathVariable("id")int id) {
		StudenteDto trovato = srv.getUnoPerId(id);
		if(trovato.getId() == 0) {
			
			return 0;
		}
		srv.cncellaUnoStudente(id);
		return 1;
	}
	
	/**
	 * cancello tutti
	 * path: api/studente + delate
	 * @return
	 */
	@DeleteMapping
	public List<StudenteDto> delateTutti(){
		return srv.cancellaTutti();
	}
	
	
	/**
	 * path:/api/studente/querystring?nome=ciccio&cognome=pasticcio
	 * @param nome
	 * @param cognome
	 * @return
	 */
	@PostMapping("querystring")
	public StudenteDto addOneQueryString(
			@RequestParam("nome") String nome,
			@RequestParam("cognome") String cognome
			) {
		StudenteDto s = new StudenteDto();
		s.setNome(nome);
		s.setCognome(cognome);
		return s;
	}
	

}
