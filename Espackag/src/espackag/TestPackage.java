package espackag;

import testPersona.

public class TestPackage {

	/**
	 * MODIFICATORI DI ACCESSO
	 * PUBLIC: visibile dappertutto anche in altri proggetti
	 * DEFAULT(PACKAGE) visibile all'interno del package
	 * PRIVATE Visibile solo dentro il suo file
	 * PROTECTED (SOLO PER EREDITARIETA) PUBLIC per i figli e PRIRIVATE per gli altri 
	 */
	
	/*
	 JAR -> java archive
	*/
	
	public static void main(String[] args) {
		
		Classe1 c = new Classe1(10, 20);
		System.out.println(c);
		
		Classe2 c2 = new Classe2("a", "b");
		System.out.println(c2);
		
		//System.out.println(c2.c); --> non lo vediamo perche e private

	}

}
