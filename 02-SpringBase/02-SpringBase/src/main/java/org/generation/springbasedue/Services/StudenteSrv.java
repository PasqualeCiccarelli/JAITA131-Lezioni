package org.generation.springbasedue.Services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.generation.springbasedue.Model.Dto.CorsoDto;
import org.generation.springbasedue.Model.Dto.StudenteDto;
import org.generation.springbasedue.Services.Interfaces.Studente;
import org.springframework.stereotype.Service;

/**
 * questo layer/strato si occupa della logica Buisness
 * cioe tutto il codice (o quasi) dell'appliocazione che riguarda le operazioni sugli studenti
 * 
 * perche si fa cosi?
 * perche cosi posso riutilizzare questi metodi per molteplici controllers
 * 
 * @Service indica che questa classe appartiene allo stato dei servizi e contiene la logica buisness
 */
@Service
public class StudenteSrv implements Studente{
	
	private List<StudenteDto> studenti;
	private static int id = 0;//condiviso da tutte le istanze di Studente
	
	public StudenteSrv() {
		studenti = new ArrayList<StudenteDto>(); //inizializzo la collezione 
		this.caricaStudenti();
	}
	
	public List<StudenteDto> getTutti() {
		return studenti;
	}
	
	public StudenteDto getUnoPerId(int idStudente) {
		for (StudenteDto s : studenti) {
			if(s.getId()==idStudente) {
				return  s;
			}
		}
		return new StudenteDto();
	}
	
	/**
	 * metodo ausiliario:
	 * pvivate ed e utilizzabile solo da questa classe
	 */
	private void caricaStudenti() {
		CorsoDto c1 = new CorsoDto(1,"Java");
		CorsoDto c2 = new CorsoDto(2,"JavaScript");
		CorsoDto c3 = new CorsoDto(3,"Database");
		CorsoDto c4 = new CorsoDto(4,"HTML");
		
		StudenteDto s1 = new StudenteDto(1, "Enrico", "Cairo"); 
		s1.aggiungiCorso(c1);
		s1.aggiungiCorso(c2);
		s1.aggiungiCorso(c3);
		studenti.add(s1);
			
		StudenteDto s2 = new StudenteDto(2, "Franco", "Baresi"); 
		s2.aggiungiCorso(c4);
		s2.aggiungiCorso(c2);
		studenti.add(s2);
		
	}
	
	public void altroMetodo() {
		System.out.println("non fa nulla");
	}
	
	public StudenteDto aggiungiStudente(StudenteDto s) {
		s.setId(++id);
		studenti.add(s);
		return s;
	}
	
	@Override
	public StudenteDto modificaStudente(StudenteDto studente) {
		// TODO Auto-generated method stub
		for (StudenteDto studenteDb : studenti) {
			if(studenteDb.getId() == studente.getId()) {
				studenteDb.setNome(studente.getNome());
				studenteDb.setCognome(studente.getCognome());
				studenteDb.setCorsi(studente.getCorsi());
				
//				studenteDb = studente;
				
				return studenteDb;
			}
		}
		return null;
	}
	
	@Override
	public List<StudenteDto> cancellaTutti(){
		studenti = new ArrayList<StudenteDto>();
		return studenti;
	}

	@Override
	public void cncellaUnoStudente(int id) {
		int index = -1;
		int i =0;
		for (StudenteDto studenteDto : studenti) {
			if(studenteDto.getId() == id) {
				index= i;
			}
			i++;
		}
		studenti.remove(index);
		
	}

	
}
