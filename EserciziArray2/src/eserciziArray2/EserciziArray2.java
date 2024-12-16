package eserciziArray2;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class EserciziArray2 {

	public static void main(String[] args) {
		/*
		 *ESERCIZIO 1 
		 *Creare un array di 6 numeri da tastiera
		 *Creare poi un secondo array contenente i numeri al contrario
		 *visualizza tutti e 2 gli array 
		 */
		Scanner s = new Scanner(System.in);
		int[] numeri = new int[6];
		int[] numeriAlContrario = new int[numeri.length];
		for (int i = 0; i<numeri.length; i++) {
			System.out.println("Inserisci un numero da immettere nell'array");
			numeri[i] = s.nextInt();
		}
		
		
		for(int i=0;i<numeri.length;i++) {
		for (int j=numeri.length-1; j>=0; j--) {
			numeriAlContrario[j]=numeri[j];
			}	
		}
		
		System.out.print("il primo array e': ");
		
		for (int numero:numeri) {
			System.out.print(" "+numero);
			}
		
		System.out.println("");
		System.out.print("il primo array al contrario e': ");
		
		for(int numeroAlContrario:numeriAlContrario) {
			System.out.print(" "+numeroAlContrario);
		}
		
		System.out.println();
		
		/*
		 * ESERCIZIO 2
		 * Scrivere il programma che chiede all'utente di inserire 5 numeri seguiti da altri
		 * 5 numeri e stampa quanti numeri sono presenti in entrambi i gruppi e la loro somma 
		 */
		
		int[][] numeri5 = new int[2][5];
		boolean[] giaContati1 = new boolean[5];
		boolean[] giaContati2 = new boolean[5];
		int[] nonCeLaFaccioPiu = new int[10];
		int contatoreComuni = 0;
		int sommaComuni= 0;
		int controllo = 0;
		
		
		System.out.println("Inserisci 5 numeri per il primo gruppo:");
		
        for (int i = 0; i < 5; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeri5[0][i] = s.nextInt();
        }
    
        System.out.println("Inserisci 5 numeri per il secondo gruppo:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeri5[1][i] = s.nextInt();
        }
		
        for (int i = 0; i <numeri5[0].length; i++) { 
        	if(!giaContati1[i]) {
        		for (int j = 0; j < numeri5[1].length; j++) { 
        			if (numeri5[0][i] == numeri5[1][j]  && !giaContati2[j]) {
        				controllo=numeri5[0][i];
        				giaContati1[i]= true;
        				giaContati2[j]=true;
        				
        				}
        			for (int w = 4; w >= 0; w-- ) {
        				if(nonCeLaFaccioPiu[i] == controllo){
        				} else {
        					nonCeLaFaccioPiu[w] = controllo;	
        				}
        			}
        		}
        	}
        }
        
        //System.out.println();
        
//      for(int i=0; i<nonCeLaFaccioPiu.length ;i++){
//          System.out.print(nonCeLaFaccioPiu[i]);
//      }
        
        //System.out.println();
        
        for(int i=0; i<nonCeLaFaccioPiu.length;i++){
        	for (int j =0;j<i;j++) {
        		if(nonCeLaFaccioPiu[i]==nonCeLaFaccioPiu[j]) {
        			nonCeLaFaccioPiu[j]=0;
        		}
        	}
        }
        
        //System.out.println();
        
        //for (int i =0;i < nonCeLaFaccioPiu.length;i++) {
        	//System.out.println(nonCeLaFaccioPiu[i]);
        //}
		
        System.out.print("i numeri in comune sono: ");
        
        for(int i = 0; i < nonCeLaFaccioPiu.length;i++) {
        	if(nonCeLaFaccioPiu[i]==0) {
        		
        	} else {
        		System.out.print(nonCeLaFaccioPiu[i] + " ");
        		sommaComuni += nonCeLaFaccioPiu[i];
        		contatoreComuni++;
        	}
        }
        
        System.out.println("e sono "+ contatoreComuni);
		System.out.println("La somma delle comuni e' = "+sommaComuni);
		
		
		//System.out.println("i numeri in comune sono "+ contatoreComuni+ " e sono: " + Arrays.toString(nonCeLaFaccioPiu));
		

		
		
		
		/*
		 * ESERCIZIO 3
		 * Creare un array di 10 numeri da tastiera, e stampare solo i nuemri 
		 * che sonmo uguali al precedente.
		 * Se non ci sono coppie di valori consecutivi uguali, il programma
		 * non stampa nulla
		 */
		 
	int[] numeri2 = new int[10];
	boolean stampa = false;
	
	System.out.println("inserisci il primo numero");
	numeri2[0]=s.nextInt();
	
	for(int i =1; i<numeri2.length; i++) {
		System.out.println("Scrivi un numero da inserire");
		numeri2[i]=s.nextInt();
		if(numeri2[i]==numeri2[i-1]) {
			System.out.println(numeri2[i]);
			stampa = true;
		}
	}
	
	if (!stampa) {
		System.out.println("non posso stamapre nulla quindi stampo questa stringa che equivale al nulla");
	}

		/*
		 * ESERCIZIO4
		 * Creare un array di 10 numeri casuali da 1 a 10.
		 * Visualizzare i valori degli array senza duplicati.
		 */
		Random r = new Random();
		int[] numeri3 = new int[10];
		
		numeri3[0]= r.nextInt(1,11);
		for(int i = 1; i<numeri3.length;i++) {
			numeri3[i]=r.nextInt(1,11);
			boolean uguale = false;
			for (int j = 0; j<i; j++) {
				if(numeri3[j]==numeri3[i]) {
					uguale = true;
					break;
				}
			}
			if(!uguale) {
				System.out.println(numeri3[i]);
			}
		}
		/*
		 * ESERCIZIO 5
		 * Data una stringa inserita in input, dire se e' palindroma oppure no
		 * Una stringa e' palindroma se la sequenza di caratteri letti da sinistra a destra,
		 * oppure da destra a sinistra e' la stessa.
		 */
		
		System.out.println("Mi inserisci una stinga pls");
		String stringaPrimaria = s.nextLine();
		String stringaPrimariaModificata = stringaPrimaria.replaceAll(" ","").toLowerCase();
		String stringaInversa = "";
		
		for(int i = stringaPrimariaModificata.length() - 1; i>=0; i--) {
			stringaInversa += stringaPrimariaModificata.charAt(i);
		}
		
		if (stringaPrimariaModificata.equals(stringaInversa)){
			System.out.println("Le stringhe sono palindrome");
		} else {
			System.out.println("Le stringe non sono palindrome");
		}
		
		/*
		 * ESERCIZIO 6
		 * Creare un array di 10 numeri da tastiera e cercare se un numero e' 
		 * uguale alla somma del precedente con il successivo, e 
		 * stampare i 3 numeri
		 */
		int[] numeri4 = new int[10];
		boolean trovato = false;
		
		System.out.println("Inserisci 10 numeri:");
		
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeri4[i] = s.nextInt();
        }
        
        for (int i = 1; i < numeri.length - 1; i++) {
            int precedente = numeri[i - 1];
            int successivo = numeri[i + 1];

            if (numeri4[i] == precedente + successivo) {
                System.out.println("Numero trovato: " + numeri[i] + " = " + precedente + " + " + successivo);
                trovato = true;
            }
        }

        if (!trovato) {
            System.out.println("Nessun numero è uguale alla somma del precedente e del successivo.");
        }

 

	}

}
