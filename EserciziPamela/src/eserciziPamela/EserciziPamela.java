package eserciziPamela;

import java.util.ArrayList;

public class EserciziPamela {

	public static void main(String[] args) {
		/*
		 * Crea un programma che prenda un ArrayList di numeri interi con
		 * potenziali duplicati e rimuova tutti i valori duplicati, lasciando solo i valori unici. 
		 * Cerca di farlo senza usare strutture dati aggiuntive come Set.
		 */
		
		ArrayList<Integer> numeri = new ArrayList<Integer>();
		
		numeri.add(5);
		numeri.add(2);
		numeri.add(3);
		numeri.add(4);
		numeri.add(5); //4
		numeri.add(5);
		numeri.add(2);
		
		
		for(int i=numeri.size()-1; i>0; i--) {
			for(int j=numeri.size()-1; j>i; j--) {
				if(numeri.get(j).equals(numeri.get(i))) {
					numeri.remove(j);
					
				}
			}
		}
		
		
//		for(int i=0; i<numeri.size(); i++) {
//			for(int j=0; j<numeri.size()-1; j++) {
//				if(numeri.get(j) == numeri.get(i)) {
//					numeri.remove(j);
//					
//				}
//			}
//		}
		
		for(int i=0; i<numeri.size()-1; i++) {
			System.out.println(numeri.get(i));
		}
		
		
		
		
		
		
		
		
		
		

	}

}
