package numeri;

import java.text.DecimalFormat;
import java.util.Random;

public class Numeri {

	public static void main(String[] args) {
		// Il Math e' una classe gia iportata in java ed e' una classe statica cioe dove non si fa il new (il new intendo nelle classi normali come per esempio DecimalFormat)
		int massimo = Math.max(5, 10);
		System.out.println(massimo);
		
		int minimo = Math.min(5, 10);
		double potenza = Math.pow(2, 3);
		System.out.println(minimo + " " + potenza);
		
		double virgola = Math.round(5.5);//arrotonda per eccesso in questo caso 6
		System.out.println(virgola);
		
		double numero=5.564323;
		DecimalFormat df= new DecimalFormat("0.00");//2 sono le cifre dopo la virgola
		System.out.println(df.format(numero));
		
		System.out.println(Math.ceil(5.4));//mi ritorna il numero dopo quindi 6
		System.out.println(Math.floor(5.8));// mi ritorna il valore basso in questo caso 5
		// come creare numeri casuali
		
		Random r = new Random();
		int casuale = r.nextInt();// genera un numero casuale che va da -2^32 a 2^31 (approssimativamente) cioe gli estremi dell'int
		System.out.println(casuale);
		
		//  numero casuale con estremi che scelgo io 
		
		int limite =r.nextInt(6);//da 0 a 5
		System.out.println(limite);
		
		int estremo=r.nextInt(2,11);//cosi' va da 2 a 10
		System.out.println(estremo);
		
		double estremiVirgola=r.nextDouble(2.5,11.6);
		System.out.println(estremiVirgola);
		
		// non esiste random per i tipi char e String 
		
		boolean casualeBoolean=r.nextBoolean();
		System.out.println(casualeBoolean);
		
		//////////////////////////////////
		////generatore di password
		int nume1=r.nextInt(32,126);
		int nume2=r.nextInt(32,126);
		int nume3=r.nextInt(32,126);
		int nume4=r.nextInt(32,126);
		
		char lettera1 = (char)nume1;
		char lettera2 = (char)nume2;
		char lettera3 = (char)nume3;
		char lettera4 = (char)nume4;
		
		String password=""+lettera1+lettera2+lettera3+lettera4;
		System.out.println("La password generata e' "+password);
		
		// un programma simula il lancio di 2 dadi e mostri il risultato dei due dadi
		//fare la somma dei valori random 
		//dichiarare una variabile booleana che ritorni true se i 2 dadi sono uguali 
		
		int dado1=r.nextInt(1,7);
		int dado2=r.nextInt(1,7);
		int somma= dado1+dado2;
		boolean uguali=(dado1==dado2);
		System.out.println("Dal primo dado e' uscito: "+dado1 + " dal secondo dado e' uscito: " + dado2 + " la loro somma e': " +somma+ " e sono "+ uguali);
		
		
		
		
		
		

	}

}
