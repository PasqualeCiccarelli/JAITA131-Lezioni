package utenteArray;

import java.util.Scanner;

public class prof {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("quanto deve essere lungo l'array?");
		int lunghezza = s.nextInt();
		s.nextLine();
		
		int[] array = new int[lunghezza];
		int indice = 0;
		
		System.out.println("inserisci i valori nell'array o fine per uscire ");
		
		while (true) {
			System.out.println ("inserisci un valore o fine");
			String input=s.nextLine();//per i numeri e per fine

			if (input.equalsIgnoreCase("fine")) {
			break;//esco dal ciclo se l'utente scrive fine
			}

			try {
			int valore=Integer.parseInt(input) ;// "6"->6
			array [indice]=valore;//assegnamo il valore passato dall'utente all'array
			indice++;//incrementiamo l'indice
			} catch (NumberFormatException | IndexOutOfBoundsException e) {
				//e.printStackTrace();
				System.out.println("hai inserito piuu valoru du quelli consentiti ");
				array = new int[lunghezza];
				indice =0;
				System.out.println("array resettato, inserisci di nuovo i valori");
			}
		}
		
		System.out.println("i valori finali dell'array sono:");
		for (int i =0; i < indice; i++) {
			System.out.println(array[i]);
		}
				
			

	}


}
