package testPersona;

import java.util.Random;
import java.util.Scanner;

public class TestPersona {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		//creo oggetto di tipo persona
		Persona p = new Persona(); 
		
		p.nome = "mario";
		p.cognome="rossi";
		p.eta=20;
		
		System.out.println(p.nome);
		System.out.println(p.cognome);
		System.out.println(p.eta);
		
		p.mangia("pizza");
		p.mangia("pasta","carne");
		//------------------------------------\\
		Persona p2 = new Persona();
		p2.nome = "giuseppe";
		p2.cognome= "verdi";
		p2.eta= 90;
		
		p2.stampaInfo();
		
		System.out.println(p2.toString());
		
		System.out.println(p2);//->inpli
		
		System.out.println(p.equals(p2));
		
		Persona p3 = new Persona();
		p3.nome ="gino";
		p3.cognome="Latino";
		p3.eta=20;
		
		System.out.println(p3);
		
		//qui creo l'ogetto persona utilizzando il costruttore personalizzato 
		Persona p4 = new Persona("anna","bianchi",30);
		Persona p5 = new Persona("framco","framchi",29);
	
		
		
		

	}

}
