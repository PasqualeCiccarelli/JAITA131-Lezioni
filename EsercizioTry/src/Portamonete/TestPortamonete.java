package Portamonete;

import java.util.Scanner;

public class TestPortamonete {
	
	public static void main(String[] args) {
		
	
//	Creare un programma che simuli un portamonete.
//	Nel portamonete c'è una quantità fissa di monete.
//	Creare un metodo "aggiungi" per mettere dal bancomat e mettere 
//	soldi nel portamonete
//	Creare un metodo "spendi" per far spendere l'utente, con importi 
//	scelti a piacere.
//	Se l'utente spende più della disponibilità del portamonete sollevare
//	una eccezione personalizzata.
	
	
		Scanner s = new Scanner(System.in);
		
		Portamonete p = new Portamonete(500);
		
		while  (true) {
			System.out.println("\nSaldo attuale: " + p.getSaldo() + " euro.");
	        System.out.println("1. Aggiungi dal bancomat al portamonete");
	        System.out.println("2. Spendi dal portamonete");
	        System.out.println("3. Esci");
	        System.out.print("Scegli un'opzione: ");
	        int scelta = s.nextInt();
	        
	        try {
	        	switch (scelta) {
	        	
				case 1: {
					System.out.print("Inserisci l'importo da aggiungere al portamonete: ");
	                double importo = s.nextDouble();
	                p.aggiungi(importo);
				}
				
				case 2 :{
					System.out.print("Inserisci l'importo da spendere: ");
	                double importo = s.nextDouble();
	                p.spendi(importo);
				}
				
				case 3 : {
					System.out.println("Grazie per aver usato il portamonete. Alla prossima!");
	                break;
				}
				default:
					System.out.println("Opzione non valida. Riprova.");
				
	        	}  
	        } catch (ControlloSaldo e) {
	        	System.out.println(e.getMessage());
	        }	finally {
				s.nextLine();
			}
	        
		}
	
	}
	
}
