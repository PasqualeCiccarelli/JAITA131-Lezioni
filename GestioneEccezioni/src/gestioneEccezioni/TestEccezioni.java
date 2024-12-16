package gestioneEccezioni;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestEccezioni {
	
	public static void main(String[] args) {
		
		/*
		  checked: esprimono condizioni che si riferiscono a condizioni recuperabili, 
		  Danno errore in compilazione, il codice non compila e devono essere gestiti
		  dal programmatore
		  
		  Obbligano il programmatore a gestirla altrimenti il codice non compila
		  
		  IOEXception, FIleNOFoundException
		  Estendono la classe java,lang.Exception
		  
		  unchecked
		  Esprimono condizioni NON recuperabili che avvengono a RUNTINE
		  Non sono controllate dal compilatore, quindi non danno errore
		  e non richiedono una gestione diretta el programmatore
		  NullPointerException, IndexOutBoundException, ArithmeticException
		  Estendono la classe java.lang.RuntimeException
		  
		*/
		
		int a = 10;
		int b=0;
		
		
		
		try {
			int c = a/b;
			System.out.println(c);
		//se noti  un problema esegui quello che c'e nelle {}
		//potete mettere tanti catch quanti volete o mettere un catch con varie eccezioni 
		}catch(ArithmeticException | NullPointerException  e) {
			System.out.println("Nienete panico e solo una divisione per 0 ");
		}catch (Exception e) {
			//questo e l'ultimo da mettere che gestisce tutti i tipi di eccezione 
			System.out.println("Errore che non conosco ma l'ho comunque gestito");
		}finally {
			System.out.println("io vengoi eseguito lo stesso a prescindere anche se ci sono errori");
		}
		
		//System.out.println("il codice puo continuare con c = "+c);
		
		int[] arr = {1,2,3,4,5};
		
		
		try {
			for (int i =0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("hai superato i limiti dell'array "+e.getMessage());
		}
		
		Scanner s = new Scanner(System.in);
		try {
			System.out.println("inserisci uin numero");
			int num = s.nextInt();
			s.nextLine();
		} catch (InputMismatchException e) {
			System.out.println("devi inserire solo numeri");
		}
		
		//possiamo lanciare qualunque tipo di eccezione anche se non c'e un errore 
		try {
			System.out.println("Ciao a tutti");
			throw new Exception("sono un eccezione lanciata a caso");//sto sollevando un eccezione anche se non c'e errore
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ho catturato l'eccezione che hai sollevato a caso");
		}
		
		try {
			System.out.println("inserisci un numero");
			int num2 = s.nextInt();
			if(num2<0) {
				throw new Exception();
			}
			System.out.println("la radice quadrata di "+num2+" e "+Math.sqrt(num2));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("il numero non puo essere negativo");
		}finally {
			s.nextLine();
		}
		
		//l'eccezione si propaga al blocco piu esterno alla ricerca del gestore corretto 
		
		try {
			System.out.println("blocco try esterno");
			try {
				System.out.println("ecco try interno");
				throw new Exception("Eccezione sollevata dl blocco interno"); 
			} catch (ArithmeticException e) {		
				System.out.println("NON sto gestendo l'eccezione del try interno ");
			}finally {
				System.out.println("finally del try interno");
			}
		}catch(Exception e) {
			System.out.println("gestisco l'eccezione del blocco interno che si e propagata al blocco esterno ");
		}
		
//		double ris = dividi(10,0);
//		System.out.println(ris);
		
		int ris;
		try {
			ris = dividi(10,0);
			System.out.println(ris);
		} catch (Exception e) {
			System.out.println("errore nell' esecuzione del metodo");
		}
		
//		int[] anni = {25,-1,250,30};
//		for (int eta : anni) {
//			
//			try {
//				controlloEta(eta);
//				System.out.println(eta +"e un eta valida");
//			} catch (Exception e) {
//				// TODO: handle exception
//				System.out.println(eta+" eta non valida"+e.getMessage());
//			}
//		}
		
		int[] anni = {25,-1,250,30};
		for (int eta : anni) {
			
			try {
				controlloEta(eta);
				System.out.println(eta +"e un eta valida");
			} catch (EtaInvalida e) {
				// TODO: handle exception
				System.out.println(eta+" eta non valida"+e.getMessage());
			}
		}
		
		
	}// fine main
	
//	static double dividi(double i, double i1) {
//		try {
//			return i/i1;
//		} catch (Exception e) {
//			System.out.println("errore metodo");
//			return -1;
//		}
//	}
	
	static int dividi(int i, int i1) throws Exception {
		return i/i1;
	}
	
//	static void controlloEta(int eta) throws Exception {
//		if (eta < 0 || eta >150) {
//			throw new Exception("l'eta deve essere compresa tra 0  e 150");
//		}
//	}
	
	static void controlloEta(int eta) throws EtaInvalida {
		if (eta < 0 || eta >150) {
			throw new EtaInvalida ("l'eta deve essere compresa tra 0  e 150");
		}
	}

}
