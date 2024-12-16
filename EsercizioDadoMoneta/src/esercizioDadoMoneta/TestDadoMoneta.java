package esercizioDadoMoneta;

import java.util.ArrayList;

public class TestDadoMoneta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scrivere un programma che simuli il lancio di un dado e di una moneta.
//		Il dado e la moneta implementano entrambi l'interfaccia lanciabile, che possiede il metodo lancia().
//		Nel main creare un arrayList di lanciabile con 2 dadi e 2 monete e stampare i risultati dei lanci.
//		Se viene 2 volte testa oppure 2 volte il numero 6, comunicare che si ha vinto.
		
		ArrayList<Lanciabile> lanciabili = new ArrayList<Lanciabile>();
		
		Dado d1 = new Dado();
		Dado d2 = new Dado();
		Moneta m1 = new Moneta();
		Moneta m2 = new Moneta();
		
		lanciabili.add(d1);
		lanciabili.add(d2);
		lanciabili.add(m1);
		lanciabili.add(m2);
		
		int vittorieTesta= 0;
		int vittorieSei = 0;
		
		System.out.println("i risultati dei lanci sono");
		for (Lanciabile lanciabile : lanciabili) {
			lanciabile.lancia();
		}
		
		if(d1.seSei())vittorieSei++;
		if(d2.seSei())vittorieSei++;
		if(m1.seTesta())vittorieTesta++;
		if(m2.seTesta())vittorieTesta++;
		
		if(vittorieSei >=2) {
			System.out.println("hai vinto e uscito due volte 6");
		} else if (vittorieTesta >= 2) {
			System.out.println("hai vinto e uscito due volte testa");
		} else {
			System.out.println("hai perso ");
		}
		
		
		

	}

}
