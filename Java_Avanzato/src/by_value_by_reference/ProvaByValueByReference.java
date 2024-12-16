package by_value_by_reference;

import Model.Dto.Persona;

public class ProvaByValueByReference {

	public static void main(String[] args) {
		
		//variabili passate per valore e riferimento
		int interoPrimitivo = 3;
		String frase = "Prova a cambiarmi";
		Persona persona = new Persona("mirco", "rossi", 34);
		
		//passaggio variabile per valore 
		cambiaEStampaNumero(interoPrimitivo);
		//qui quanto vale?
		System.out.println(interoPrimitivo);
		
		cambiaString(frase);
		System.out.println(frase);
		
		System.out.println(persona);
		modificaPersona(persona);

	}
	
	
	private static void modificaPersona(Persona persona) {
		System.out.println(persona);
		System.out.println(persona.getNome()+" "+persona.getCognome()+" "+ persona.getEta());
		persona.setNome("Pippo");
		persona.setEta(23);
		
	}


	//Scope della variabile
	//numeroPrimitivo viene creato aa'inizio del metodo e sparisce quando finisce il metodo 
	private static void cambiaEStampaNumero(int numero) {//carica in memoria 
		numero += 10;
		System.out.println(numero);
	}//qui sparisce il parametro/variabile numero
	
	private static void cambiaString(String fraseMetodo) {
		//Stringa immutabile
		//infatti qui crea una nuova stringa
		fraseMetodo += " nel metodo";
		System.out.println(fraseMetodo);
	}

}
