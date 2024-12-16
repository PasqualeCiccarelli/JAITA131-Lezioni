package org.generation.springbasedue.Services.Interfaces;

import java.util.List;

import org.generation.springbasedue.Model.Dto.StudenteDto;

public interface Studente extends CommonService<StudenteDto>{
	
	String UNA_COSTANTE ="DUE";
	
	StudenteDto aggiungiStudente(StudenteDto s);

	StudenteDto modificaStudente(StudenteDto studente);

	List<StudenteDto> cancellaTutti();

	void cncellaUnoStudente(int id);
	
	
	
//	List<StudenteDto> getTutti();
//	StudenteDto  getUnoPerId(int idStudente);
	
}
