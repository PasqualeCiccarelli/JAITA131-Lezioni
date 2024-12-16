package esercizioArray;

import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;

public class EsercizioArray {

	public static void main(String[] args) {
		// Creare un Array di 10 numeri da tastiera
		// dire se e' maggiore la somma degli elementi di posto pari
		// oppure la somma degli elementi di posto dispari

		Scanner s = new Scanner(System.in);
//		int[] numeri = new int[10];
//		int sommaPari = 0;
//		int sommaDispari = 0;
//		for (int i = 0; i < numeri.length; i++) {
//			System.out.println("dimmi un numero che vuoi inserire nell'array");
//			numeri[i] = s.nextInt();
//			if (numeri[i] % 2 == 0) {
//				sommaPari += numeri[i];
//			} else {
//				sommaDispari += numeri[i];
//			}
//		}
//
//		System.out.println("l'array che hai creato e': ");
//
//		for (int numero : numeri) {
//			System.out.print(" " + numero);
//		}
//		System.out.println("");
//
//		if (sommaPari > sommaDispari) {
//		System.out.println("la somma dei pari e' " + sommaPari+ " ed e' maggiore della somma dei dispari, \nche e' " + sommaDispari);
//		}else if (sommaDispari==sommaPari) {
//			System.out.println("Incredibile la somma dei pari che e': "+ sommaPari+ " e la somma dei dispari, che e': "+sommaDispari+ " sono ugueli.");
//		} else {
//			System.out.println("la somma dei dispari e' " + sommaDispari+ " ed e' maggiore della somma dei pari, \nche e' " + sommaPari);
//		}

		/*
		 * dato un numero casuale da 1 a 20 verificare se questo e' presente in un array di 10 numeri casuali da 1 a 10
		 * se e presente indicare la posizionbe altrimnenti dire che non fa parte dell'array
		 */
		
		Random r = new Random();
		
//		int casuali1 =r.nextInt(1,21);
//		boolean presente = false;
//		int posizione = 0;
//		int[] arrCasuale = new int[10];
//		
//		
//		for (int i =0; i<arrCasuale.length;i++) {
//			arrCasuale[i]=r.nextInt(1,10);
//		}
//		
//		
//		for (int i =0; i<arrCasuale.length;i++) {
//			if (casuali1 == arrCasuale[i]) {
//				presente = true;
//				posizione = i;
//				break;
//			}
//		}
//		
//		
//		if (presente) {
//			System.out.println(" il numero "+ casuali1+ " e' presente nell'array in posizione "+ posizione);
//		} else {
//			System.out.println("il numero "+ casuali1+ " non fa parte dell'array");
//		}
		
	/*
	 * chiedere all'utente 8 nuymeri che siano maggiori di 0 e salvali in un array
	 * 
	 * se viene inserito un numero che non e maggiore di 0 viene fatto reinserire fino a qiando rispetta la condizione 
	 * 
	 * visualizzare a schermo l'array inseritop e quante volte l'utente ha sbagliato ad inserire i dati 	
	 */
		
//		int[] numeri = new int[8];
//		int sbagli=0;
//		int i =0;
//		
//		
//		while(i<numeri.length) {
//			System.out.println("inserisci un numero maggiore di 0");
//			int numero = s.nextInt();
//			
//			if(numero>0) {
//				numeri[i]=numero;
//				i++;
//			} else {
//				System.out.println("il numero inserito non e' maggiore di 0, so che e' molto difficile ma prova non inserire un meno");
//				sbagli++;
//			}
//		}
//		
//		
//		System.out.println("");
//		System.out.println("questi sono i nuemri che hai inserito ");
//		
//		
//		for (int numero : numeri) {
//			System.out.print(" "+numero);
//		}
//		
//		System.out.println("");
//		
//		System.out.println(sbagli +": queste sono le volte in cui hai sbagliato");
		
		
		
		
		/*
		 * creare un array di 10 numeri in inout 
		 * visualizza il valore massimo e il minimo dell'array e dire in che posizione si trovano 
		 */
		
//		int[] numeri = new int[10];
//		for (int i =0; i<numeri.length;i++) {
//			System.out.println("inserisci un numero");
//			numeri[i]=s.nextInt();
//		}
//		
//		for (int i = 0; i < numeri.length; i++) {
//			for (int j = 0; j < numeri.length; j++) {
//				if (numeri[i]<numeri[j]) {
//					int ordinato = numeri[i];
//					numeri[i]=numeri[j];
//					numeri[j]=ordinato;
//				}
//			}
//		}
//		
//		
//		
//		System.out.println("il numero piu piccolo e' in posizione 0 ed e': " + numeri[0]);
//		System.out.println("il numero piu piccolo e' in posizione 10 ed e': " + numeri[numeri.length-1]);
//		
//		
//		
//		int[] numeri2 = new int[10];
//		int massimo = 0;
//		int minimo = 0;
//		int posizioneMassimo= 0;
//		int posizioneMinimo = 0;
//		
//		for (int i =0; i<numeri2.length;i++) {
//			System.out.println("inserisci un numero");
//			numeri2[i]=s.nextInt();
//		}
//		
//		for(int i = 0; i < numeri2.length;i++) {
//			if (numeri2[i]>massimo) {
//				massimo = numeri2[i];
//				posizioneMassimo=i;
//			}
//			if (numeri2[i]<minimo) {
//				minimo=numeri2[i];
//				posizioneMinimo=i;
//			}
//				
//		}
//		 System.out.println("il valore massimo e': "+massimo+" e si trova in posizione "+ posizioneMassimo);
//		 System.out.println("il valore minimo e': "+minimo+" e si trova in posizione "+ posizioneMinimo);
		
		/*
		 * scrivere il programma che chiede all'utente di inbserire 5 numerio seguiti da altri 5 numeri 
		 * e stampa le 5 somme ottenute da un numero del primo grupopo e un numero del secondo gruppo in posizione corrispondente 
		 */
		
		int[][] numeri = new int[2][5];
		int[] somme = new int[5];
		
		System.out.println("ora facciamo un gioco tu mi dirai prima 5 numeri, \npoi me ne dirai altri 5, e io sommero in ordine \nprima i primi di ogni gruppo poi i secondi poi i terzi \ne cosi via finche non le facciamo tutte okkei? bene. \nIniziamo!!!!");
		
		System.out.println("puoi dirmi i primi 5 numeri");
		for(int i =0; i<5;i++) {
		System.out.println("inseriscimi un numero");
		numeri[0][i] = s.nextInt();
		}
		
		
		
		System.out.println("puoi dirmi i secondi 5 numeri");
		for(int i =0; i<5;i++) {
		System.out.println("inseriscimi un numero");
		numeri[1][i] = s.nextInt();
		}
	
		
		for (int i =0; i <5; i++) {
			somme[i] = numeri[0][i] + numeri[1][i];
		}
		
		System.out.println("le somme in ordine sono: ");
		for(int somma:somme) {
			System.out.print(" "+somma);
		}
		
		
		
	}

}
