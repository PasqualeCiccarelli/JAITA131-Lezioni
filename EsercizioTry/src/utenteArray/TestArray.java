package utenteArray;


import java.util.Scanner;

public class TestArray {
	
	public static void main(String[] args) {
		
//		Creare un programma che permetta all'utente di
//		scegliere la lunghezza di un array, e successivamente 
//		di riempirlo con dei valori a piacere.
//		Il programma deve continuare ad accettare numeri fino 
//		a che l'utente non digita la parola "fine"
//		Gestire l'eccezione in cui l'utente non digiti la parola fine,
//		e metta più valori di quelli ammessi dall'array.
//		In quel caso svuotare l'array e far inserire di nuovo i 
//		valori all'utente.
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("quanto deve essere lungo l'array?");
		int lunghezza = s.nextInt();
		s.nextLine();
		
		int[] arr = new int[lunghezza];
		
		while (true) {
			int count = 0;
			
			try {
				while (count <= lunghezza) {
					System.out.println("inserisci un numero da inserire nell'array o 'fine'se hai intenzione di smettere");
					String input = s.nextLine();
					if (input.equalsIgnoreCase("fine")) {
						System.out.println("hai deciso di uscire");
						for(int i =0; i < count; i++) {
							System.out.println(arr[i]+" ");
						}
						System.out.println();
						return;
					}
					int num = Integer.parseInt(input);
					arr[count] = num;
					count++;
				}
				
			
	
			} catch(ArrayIndexOutOfBoundsException e ) {
				System.out.println("errore: hai inserito piu numeri della lunghezza da te definita. \nL'array si autodistruggera");
				arr = new int[lunghezza];
			} catch(NumberFormatException e ) {
				System.out.println("errore: hai inserito piu numeri della lunghezza da te definita. \nL'array si autodistruggera");
				arr = new int[lunghezza];
			}
			
		}
	
	}

}
