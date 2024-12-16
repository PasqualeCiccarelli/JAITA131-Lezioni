package eserciziCollection2;

import java.util.ArrayDeque;
import java.util.Random;
import java.util.Scanner;

public class EserciziCollection2 {
	
	static int numero = 0;//numero progressivo delle persone in coda

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDeque<Integer> persone = new ArrayDeque<Integer>();
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		//System.out.println("quante persone ci sono in coda?");
		
		int coda = r.nextInt(1,51);
		
		for (int i =0; i <coda;i++) {
			prenota(persone);
		}
		
		//prenota()//schiaccano il pulsante e prendono un numerino 
		//prenota()
		//prenota()
		//prenota()
		//prenota()
		
		while(persone.isEmpty()) {//finche la coda non e vuota
			System.out.println("persone in coda "+numero);
			servi(persone, persone.peek());//peek ritorna il possimo elemento da servire 
		}
		System.out.println("non ci sono piu persone in coda");
		
//		String nome = "mario";
//		String cognome = "rossi";
//		
//		String nome1 = "giuseppe";
//		String cognome2 = "rossini";
		
		
		
	}//fine main
	
	//--------------------inizio metodi-----------------------\\
	
	public static void prenota(ArrayDeque q) {
		//l'utente schiaccia il pulsante e gli viene generato un numero 
		q.add(++numero);//aggiunge un elemento alla fine della coda 
		System.out.println("hai preso il numero "+numero);
	}
	
	public static void servi(ArrayDeque q, int num) {
		System.out.println("tocca a numero "+num);
		q.poll();//elimina l'elemento in cima alla coda il primo che deve essere servito
	}
	

}//fine classe
