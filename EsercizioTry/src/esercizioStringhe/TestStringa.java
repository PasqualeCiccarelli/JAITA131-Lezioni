package esercizioStringhe;

import java.util.Scanner;

public class TestStringa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Creare un metodo che accetti in input una stringa e un numero.
//		Chiedere all'utente una stringa e un numero, e ritornare la parte di 
//		stringa che va da quel numero(posizione) in poi.
//		Se la lunghezza della stringa è minore di 2, sollevare una eccezione personalizzata.
//		Se il numero è più grande della lunghezza della stringa sollevare un'altra eccezione personalizzata.
//		Sollevare l'eccezione giusta se i tipi di dati inseriti non sono rispettivamente una stringa o un numero.

		Scanner s = new Scanner(System.in);
		boolean inputI = false;
		
		while(!inputI) {
			try {
				System.out.println("inserisci una frase:");
				String inputS = s.nextLine();
				
				System.out.println("inserisci un numero:");
				int inputN = s.nextInt();
				s.nextLine();
				
				String ris = estraiStringaBeneee(inputS, inputN);
				System.out.println("La parte di stringa dalla posizioni indicata in poi e: " + ris);
				
				if(inputS.length() < 2) {
					throw new StringaCorta("la stringa deve essere di almeno 2 caratteri");
				}
				
				if (inputN >= inputS.length()) {
					throw new StringaLunga("Il numero e maggiore o uguale della lunghezza della stringa");
				}
			}catch (StringaCorta | StringaLunga e ){
				System.out.println("Errore: "+e.getMessage());
			}catch (NumberFormatException e) {
				System.out.println("Errore: il numero da leiselezionato non e al momento raggiungibile, \nsi prega di riprovare piu tardi");
			
			}
		
		}
	
	}
	
	public static String estraiStringaBeneee(String s, int numero) throws StringaCorta, StringaLunga {
		if(s.length() < 2) {
			throw new StringaCorta("la stringa deve essere di almeno 2 caratteri");
		}
		
		if (numero >= s.length()) {
			throw new StringaLunga("Il numero e maggiore o uguale della lunghezza della stringa");
		}
		return s.substring(numero);
		
	}

}
