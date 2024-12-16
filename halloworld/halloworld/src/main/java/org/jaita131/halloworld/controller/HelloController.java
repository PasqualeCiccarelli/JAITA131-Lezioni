package org.jaita131.halloworld.controller;

import java.util.ArrayList;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello") // rotta o azione del controller
public class HelloController {
	
	@GetMapping
	public ArrayList<String> getAll(){
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Ciao Paolo");
		lista.add("Ciao Gemma");
		return lista;
	}
}
