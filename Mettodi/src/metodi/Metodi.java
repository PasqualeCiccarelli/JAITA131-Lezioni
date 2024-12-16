package metodi;

import java.util.ArrayList;
import java.util.Scanner;

public class Metodi {
	
	static int x = 0; //ststiuc mantine il valore della variabile
	static String s ="*";

	public static void main(String[] args) {
		// metodo statico (static) puo chiamare solo metodi statici
		
		//in questo modo sto "richiamando il metodo nel main cioe sto portando quello scritto nel metodo all'interno del main per poterlo usare e fargli svolgere la sua funzione 
		stampa();
		stampaConParametriIngresso("ciao", "a tutti");
		String output = stampaConParametriUscita("xx", "yy");
		int risultato = somma(2, 2);
		System.out.println("il metodo mi ha restituito questo: "+risultato);
		
		risultato = somma(10, 4);
		System.out.println("Adesson inveceil metodo mi ha restituito questo: "+risultato);
		
		Scanner s =new Scanner(System.in);
//		System.out.println("inserisci il primo numero: ");
//		int num1 = s.nextInt();
//		System.out.println("inserisci il secondo numero: ");
//		int num2 = s.nextInt();
//		
//		risultato = somma(num1, num2);
//		System.out.println("hai inserito nel metodo "+num1+ " e "+num2+ " il metodo ha restituito "+risultato);
		
		
		boolean divisivileOne = isDivisibile(10, 3);
		System.out.println("e divisibile? "+divisivileOne);
		
		System.out.println(isDivisibile(10, 3)?"si":"no");

		String[] paperopoli = {"qui","quo","qua"};
		leggiArray(paperopoli);
		
		//chiamo il metodo creaArray, passo 3 stringhe e ricevo in oputput un array
		String[] paperi =creaArray("paperino", "gastone", "nonna papera");
		
		//-- leggiamo l'arry che ci ha restituito il metodo
		for (String p : paperi) {
			System.out.println(p);
		}
		//ma aabbiamom il metodo leggi array quindi usiamo quello
		leggiArray(paperi);
		
		int ris = somma(1, 2, 3);
		System.out.println("la versione con 3 parametri mi restituisce  "+ris);
		
		ris = somma(1, 2, 3,4);
		System.out.println("la versione con 3 parametri mi restituisce  "+ris);
		
		double risult = somma(2.5, 3.4);
		System.out.println("la versione con due double mi restituisce "+risult);
		
		ris = somma("1", "2");
		System.out.println("la versione con due stringhe mi  restituisce "+ris);
		
		String pap=somma("qui","quo","qua");
		System.out.println(" "+pap);
		
		ris = varArgs(1,2,3,4);
		System.out.println("la somma e "+ris);
		
		ArrayList elenco = new ArrayList<>();
		elenco.add("aaa");
		elenco.add(true);
		elenco.add(157);
		elenco.add(3.14);
		
		stampa(elenco);
		
		statico();
		statico();
		statico();
		
		aggiungiAsterischi();
		aggiungiAsterischi();
		aggiungiAsterischi();
		
		eseguiTotVolte(5);
		
		
		
		
	}//fine main
	
	//------------------INIZIO METODI--------------------------\\
	//i metodi vanno scritti fuori dal main e poi riischiamti all'interno
	
	
	
	//COSE OBBLIGATORIE
	//il noe con le parentesi
	//il tipo di dato che il metodo deve ritornare, se non esiste dato si mette void
	//static se il metodo viene chiamato da un altro metodo statico
	
	
	public static void stampa () {
	//pubblico perche riconosciuto all'esterno
	// statico perche rtichiamato da metodi statici
	//void perche non restituisce alcun valore
	//stampa nome del metodo
	//dentro le parentesi graffe il corpo del metodo 
		System.out.println("ciao");
	}
	
	//metodo con parentesi di ingresso
	public static void stampaConParametriIngresso(String par1, String par2) {
		System.out.println("ho ricevuto i seguenti parametri "+ par1 +" e  "+par2);
	}
	
	

	//---------------METODI CON VALORI DI RITORNO----------------\\
	
	public static String stampaConParametriUscita(String a, String b) {
		String frase = "ho ricevuto i seguenti parametri "+a+" e "+ b;
		return frase;
	}
	
	//metodo che prende gli input due numeri interi e ne restituisce la somma
	public static int somma(int a, int b) {
		return a+b;
	}
	
	//metodo che prende due numeri e restituisce true se il resto e 0 altrimenti false 
	public static boolean isDivisibile(int num1, int num2) {
		return(num1%num2==0);
	}
	
	//metodo che prende in input array e stampa i valori
	public static void leggiArray(String[] arr) {
		for (String elemento : arr) {
			System.out.println(elemento);		
		}
	}
	
	//metodo che restituisce in output un array di Stringhe a partite da 3 stringhe in input
	public static String[] creaArray(String uno, String due, String tre) {
		String[] arr = {uno, due, tre};
		return arr;
	}
	
	//-----------------------OVERLOAD-----------------------\\
	
	//metodi che hanno lo stesso nome ma parametri diversi
	
	public static int somma (int a, int b, int c) {
		System.out.println("overload metodo somma con 3 parametri");
		return a+b+c;
	}
	
	public static int somma(int a, int b, int c, int d) {
		System.out.println("overload metodo somma con 4 parametri");
		return a+b+c+d;
	}
	
	public static double somma(double a,double b) {
		return a+b;
	}
	
	public static int somma(String a, String b) {//ovviamente non possiamo trasformare in int una stringa fatta cosi "ciao"  ma solo fatta a numero
		int num1 =Integer.parseInt(a);
		int num2 =Integer.parseInt(b);
		return num1+num2;
		
	}
	
	public static String somma(String a, String b, String c) {
		System.out.println("overload che restituisce 3 stringhe");
		return a+" "+b+" "+c;
	}
	
	//-------------------------VARAGS---------------------------\\
	
	public static int varArgs(int...x) {//i ... rappresentano qualunque numero di argomenti 
		//tratto la variabile di ingresso come se fosse un array
		int tot = 0;
//		for (int numero : x) {
//			System.out.println(numero);
//			tot+=numero;
//		}
		for (int i =0; i<x.length;i++) {
			System.out.println(i);
			tot +=x[i];
		}
		return tot;
		
	}
	
	//-----------------------------------------------------\\
	public static void stampa(ArrayList parole) {
		
		for (Object elemento : parole) {
			System.out.println(elemento);
		}
	}
	
	//-----------------------------------------------------\\
	
	
	public static void statico() {
		//int x = 0;
		System.out.println(++x);
	}
	
	public static void aggiungiAsterischi() {
		System.out.println(s);
		s+="*";
	}
	
	//--------------------------------------------------------\\
	
	//funzioni ricorsive-->quando una funzione direttamente o indiretamente chiama se stessa 
//	public static void esegui() {
//		esegui();
//	}
	
	public static void eseguiTotVolte(int quanto) {
		
		if(quanto>0) {
			System.out.println("Sto chiamando me stesso "+quanto+" volte");
			quanto--;
			eseguiTotVolte(quanto);
		}
	}
	
//	public static void fattoriale(long x) {
//		if(x==0) {
//			return 1;
//		} else {
//			return x*fattoriale(x-1);
//		}
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
