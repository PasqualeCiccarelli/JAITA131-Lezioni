package pila;

import java.util.Stack;

public class Pila {

	public static void main(String[] args) {
		
		//ordinamento
		//LIFO LAst in fist out
		//l'ultimo che entra e il primo che esce 
		
		Stack<String> p = new Stack<String>();
		
		p.push("piatto1");
		p.push("piatto2");
		p.push("piatto3");
		p.push("piatto4");
		
		System.out.println(p.peek());
		p.pop();//rimuove l'elemento in cima alla pila
		
		System.out.println(p);
		

	}

}
