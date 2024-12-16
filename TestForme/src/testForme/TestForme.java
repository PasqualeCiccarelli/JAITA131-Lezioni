package testForme;

import java.util.ArrayList;

public class TestForme {

	public static void main(String[] args) {
		
//		Realizzare una classe astratta Forma, che rappresenti una forma geometrica,
//		e che preveda un attributo lato e un attributo tipo, che indica il tipo di forma geometrica,
//		e i metodi astratti perimetro e area. 
//
//		Creare a partire della classe astratta Forma, le classi concrete Rettangolo, 
//		Triangolo e Cerchio, e poi derivare dalla classe Rettangolo la classe Quadrato.
//		Realizzare poi una classe TestForme che permetta all'utente di inserire degli 
//		oggetti di tipo Forma in un ArrayList.
//		Stampare sullo schermo il perimetro e l'area di tutte le forme  create.
		
		
		 ArrayList<Forma> forme = new ArrayList<>();
		 
		 forme.add(new Triangolo(5, "triangolo", 8));      
	     forme.add(new Rettangolo(5, "rettangolo", 6));     
	     forme.add(new Quadrato(5, "quadrato"));          
	     forme.add(new Cerchio(3, "cerchio"));
	     
	     System.out.println("dettagli delle forme:");
	     for (Forma forma : forme) {
			System.out.println(forma);
			System.out.println("perimetro= "+forma.perimetro());
			System.out.println("Area= "+forma.area());
			System.out.println();
		}
	     
	}

}
