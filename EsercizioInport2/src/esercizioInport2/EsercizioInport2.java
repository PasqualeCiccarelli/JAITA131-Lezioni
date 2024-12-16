package esercizioInport2;
import java.util.Scanner;

public class EsercizioInport2 {

	public static void main(String[] args) {
		// SCrivere un programma che chiede all'utente 2 numeri con la virgola
		//li sommate e stampa il risultato come un numero INTERO
		//stampali
		Scanner inport = new Scanner(System.in);
		System.out.println("Scrivi un numero con la virgola");
		double numero1 = inport.nextDouble();
		inport.nextLine();
		System.out.println("Scrivine un altro");
		double numero2 = inport.nextDouble();
		double sommaVirgola = (numero1 + numero2);
		int somma = (int)sommaVirgola;
		System.out.println("la loro somma e': " + somma);
		
		
		

	}

}
