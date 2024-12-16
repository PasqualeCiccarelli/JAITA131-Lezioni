package code;

import java.util.ArrayDeque;

public class Code {

	public static void main(String[] args) {
		// il primo che entra e' il primo che esce 
		//fifo -> first in first out
		
		ArrayDeque<String> q = new ArrayDeque<String>();
		q.add("cane");
		q.add("gatto");
		q.add("pesce");
		
		System.out.println(q.size());//dimensione
		System.out.println(q);//stampa la coda
		System.out.println("la testa = "+q.peek());//il primo in coda da servire
		for( String coda : q) {
			System.out.println(coda);
		}
		//per togliere elemento dalla coda esiste poll
		q.poll();//elimina elemento in testa alla coda
		
		System.out.println(q);
		
		System.out.println("la cosa e' vuota? "+q.isEmpty());
		//getFrit //getLast
		//removeFirst
		//removeLast
		
		

	}

}
