package org.generation.jpa.restctrl;

import org.springframework.web.bind.annotation.RestController;
import org.generation.jpa.entities.Macchina;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController("/api/macchina")
public class MacchianCtrl {

	@PostMapping("/utente/{id}")								
	public void aggiungiMacchina(@RequestBody Macchina macchina, @PathVariable("id") long id)
	{
		
	}
	
	
}
