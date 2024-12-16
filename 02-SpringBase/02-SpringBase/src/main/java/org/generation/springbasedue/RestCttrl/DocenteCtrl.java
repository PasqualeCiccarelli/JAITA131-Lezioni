package org.generation.springbasedue.RestCttrl;

import java.util.List;

import org.generation.springbasedue.Model.Dto.DocenteDto;
import org.generation.springbasedue.Services.DocenteSrv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/docente")
public class DocenteCtrl {
	
	@Autowired
	private DocenteSrv srv;
	
	@GetMapping
	public List<DocenteDto> getAll(){
		return srv.getTutti();
	}
	
	@GetMapping("/id={id}")
	public DocenteDto getById(@PathVariable("id") int id) {
		return srv.getPerId(id);
	}
	
	@GetMapping("/materia={materia}")
	public DocenteDto getByMAteria(@PathVariable("materia") String materia) {
		return srv.getPerMateria(materia);
	}
}
