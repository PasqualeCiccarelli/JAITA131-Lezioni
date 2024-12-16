package esercizioTry;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EsercizioTry1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Creare un metodo che faccia la somma di 2 numeri scelti dall'utente.
//		Il programma deve controllare che l'input dello scanner sia numerico, 
//		e deve sollevare una eccezione personalizzata nel caso che uno dei 2 numeri sia zero.
		Scanner s = new Scanner(System.in);
		boolean inputValido = false;
		
		while(!inputValido) {
			try {
				
				System.out.println("inserisci il priomo numero");
				int num1 = s.nextInt();
				
				if (num1 ==0) {
					throw new Controllo("il primo numero non puo essere zero");
				}
				
				System.out.println("inserisci il secondo numero");
				int num2 = s.nextInt();
				
				if (num2 ==0) {
					throw new Controllo("il secondo numero non puo essere zero");
				}
				
				int somma = (num1 + num2);
				System.out.println("la somma dei numeri e "+somma);
				
				inputValido = true;
				
			} catch (Controllo e) {
				System.out.println("errore: "+ e.getMessage());
			} catch (InputMismatchException e ) {
				System.out.println("errore: devi inserire un numero intero valido");
				s.next();
			} catch (Exception e) {
				System.out.println("Errore fatale, avvio autodistruzione");
			}finally {
				s.nextLine();
			}
		}

	}
}
