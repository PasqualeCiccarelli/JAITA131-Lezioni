package esercizioGenerico1;

import java.util.Scanner;

public class TestGenerico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Creare un metodo generico che permetta di trovare
//		un elemento in un array di qualunque tipo(stringhe, numeru, ecc)
//		Il metodo deve restituire l'indice dell'elemento
//		se trovato, altrimenti deve restituire -1
		
		Scanner s = new Scanner(System.in);
		
		Integer[] numeri = {1,2,4,3,5};
		
		System.out.println(ricercaElemento(numeri,3));
		System.out.println(ricercaElemento(numeri,9));
		
		System.out.println("Ora caro telespettatore prova a cercare tu un numero");
		
		int inputN = s.nextInt();
		s.nextLine();
		
		int indiceN = ricercaElemento(numeri, inputN);
		
		if (indiceN != -1) {
			System.out.println("Oddio che culo hai trovato il numero in posizione "+indiceN);
		} else {
			System.out.println("Kehe non e' semplice ci sono solo 5 numeri");
		}
		
		System.out.println();
		
		String[] parole = {"ciccio","Crotalo","GokuSuperSayanSempre"};
		
		System.out.println(ricercaElemento(parole, "ciccio"));
		System.out.println(ricercaElemento(parole, "Giovanni"));
		
		String inputS = s.nextLine();
		
		int indiceS = ricercaElemento(parole, inputS);
		
		if (indiceS != -1) {
			System.out.println("Oddio che culo hai trovato il numero in posizione "+indiceN);
		} else {
			System.out.println("Kehe non e' semplice ci sono solo 3 parole");
		}
		
		System.out.println();
		
		
		String[] facciamoUnPoComeCiPare = {"Precipitevolissimevolmente","Supercalifragilichespiralitoso",null,"Luigi"};
		
		System.out.println(ricercaElemento(facciamoUnPoComeCiPare, null));
		System.out.println(ricercaElemento(facciamoUnPoComeCiPare, "Precipitevolissimevolmente"));

	}
	
	public static<T> int ricercaElemento(T[] a , T e) {
		if(a == null) {
			return -1;
		}
		for (int i =0;i<a.length;i++) {
			if (a[i] == null && e ==null) {
				return i;
			}
			if (a[i] != null && a[i].equals(e)) {
				return i;
			}
		}
		return -1;
	}

}


