package gestioneDelFlusso;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class GestioneDelFlusso {

	public static void main(String[] args) {
		/*
		Scanner s = new Scanner(System.in);
		System.out.println("Inseriscio la tua eta'");
		int eta = s.nextInt();
		s.nextLine()
;
		if (eta>=18) {
			System.out.println("Sei  maggiorenne puoi entrare.");
		
		}else {
			System.out.println("Non sei maggiorenne, non puoi entrare.");
		}
		
		// operatori : > < >= <= == != 
		
		int num=5;
		if (num>5) {
			System.out.println("Il numero e' maggiore di 5.");	
		}else if (num==5) {
			System.out.println("Il numero e' uguale a 5.");
		}else {
			System.out.println("Il numero e' minore di 5.");
		}
		
		int temperatura = s.nextInt();
		if (temperatura>30) {
			System.out.println("Accendi il condizionatore.");
			}else if (temperatura<17) {
				System.out.println("Sccendi il riscaldamento.");
				
			}else {
				System.out.println("Si sta bene.");
			}
		
		System.out.println("Inserisci il primo numero.");
		int num1=s.nextInt();		
		System.out.println("Inserisci il secondo numero.");
		int num2=s.nextInt();
		if (num2!=0) {
			
			System.out.println("la divisione e': "+ (num1/num2));
			System.out.println("il resto e': "+(num1%num2));
		}else {
			System.out.println("Errore. Non puoi dividere per 0.");
		}
	int num3=10;
	if (num3%2==0) {
		System.out.println("Il numero e' pari.");
		
		
	}else {
		System.out.println("Il numero e' dispari.");
	}
		
		//////////////////////////////////////
	
		int orario =LocalTime.now().getHour();// qui mi ricavo solo l'ora
		if (orario<12) {
			System.out.println("Buongiorno!!");
			
			
		}else if (orario <18) {
			System.out.println("Buonpomeriggio!!!");
		}else if (orario<22) {
			System.out.println("Buonasera!!!");
		}else if (orario<5) {
			System.out.println("Vai a dormire!!!!!");
		}
		else{
			System.out.println("Buonanotte!!!");
		}
		
		String saluto;
		if (orario<12) {
			saluto ="Buongiorno!!";
			
			
		}else if (orario <18) {
			saluto ="Buonpomeriggio!!!";
		}else if (orario<22) {
			saluto="Buonasera!!!";
		}else if (orario<5) {
			saluto="Vai a dormire!!!!!";
		}
		else{
			saluto="Buonanotte!!!";
		}
		System.out.println(saluto);
		//////////////////////////////////////////\
		System.out.println("Inseriscci una parola.");
		s.nextLine();
		String parola=s.nextLine();
		
		int lunghezza=parola.length();
		if (lunghezza%2==0) {
			System.out.println("La parola ha un numero pari di lettere.");
		}else {
			System.out.println("La parola ha un numero dispari di lettere.");
		}
		
		/////////////////OPERATORI LOGICI\\\\\\\\\\\\\\\\
		
		boolean sole= false;
		int temperatura2 =25;
		if (sole &&temperatura2 >20) {
			//&& and vuol dire devono essere entrambe vere, sia che sole sia vereo sia che la temperatura sia maggiore di 20 quyindi vere contemporaniamente
			System.out.println("Esco.");			
		}else {
			System.out.println("Sto a casa.");
		}
		
		
		if (sole || temperatura2 >20) {//|| vuol dire or e basta che solo una delle due sia vera 
			System.out.println("Esco.");
		}else {
			System.out.println("Sto a casa.");
		}
		//----------------------------------------\\
		int voto1=6;
		int voto2=5;
		int voto3=6;
		//a prescindere da come la scrivi && ha la priorita' quindi vine letto per primo 
		if (voto1>=6 || voto2>=6 && voto3>=6) {
			System.out.println("Sei promosso!Bavo!!");
		}else {
			System.out.println("Bocciata!Fai schifo!!");
		}
		// cosi viene promosso 
		
		if (voto1>=6 && voto2>=6 || voto3>=6) {
			System.out.println("Sei promosso/a!Bavo/a!!");
		}else {
			System.out.println("Bocciato/a!Fai schifo!!");
		}
		// anche cosi' viene promossa 
		
		// se voglio far eseguire prima l'|| devo mettere le parentesi 
		
		if (voto1>=6 && (voto2>=6 || voto3>=6)) {
			System.out.println("Sei promosso!Bavo!!");
		}else {
			System.out.println("Bocciata!Fai schifo!!");
		}
		// viene sempre promosso 
		// RICORDA la && ha la priorita sulla || RICORDA 
		// se voglio cambiare priorita' metto le parentesi 
		
		
		int voto4 = 8;
		if (voto4>=6) {
			System.out.println("promosso");
			}else {
				System.out.println("bocciato");
				}
		//operstore ternario
		//1 condizione
		//2 cosa fare se la condizione e vera
		// cosa fare se e falso
		
		System.out.println(voto4>=6?"promosso":"bocciato");
		
		int altezza =190;
		String tipologia= (altezza>180)?"alto":"normale";
		System.out.println(tipologia);
		
		if (altezza>180) {
			System.out.println("alto");
		}else {
			System.out.println("normale");
		}
		//----------------------------------------------\\
		int a =10;
		int b = 20;
		
		int max = (a>b)?a:b; //quindi scrivere questo e' equivalente a fare un if
		System.out.println("il maggiore e': "+max);
		
		String maxOuguale= (a>b)?"il piu' grande e': "+ a:(a==b)?" i numeri sono uguali":"il piu grande e': "+b;
		System.out.println(maxOuguale);
		//tutto questo e' equivalente
		if (a>b) {
			System.out.println("il piu' grande e': "+ a);
		}else if (a==b) {
			System.out.println(" i numeri sono uguali");
		}else {
			System.out.println("il piu grande e': "+b);
		}
		
		//--------------------------------------\\
		
		int i = 3;
		switch(i) {
			case 0 :
				System.out.println("i e' uguale a 0");
				break;
			case 1 :
				System.out.println("i vale 1");
				break;
			case 2 :
				System.out.println("i vale 2");
				break;
			default : 
				System.out.println("i e' diverso da 0,1,2");		
		}
		//si usa solo per i tipi di dato int byte short char String long
		//NON si usa per boolean, double e float
		
		//questo serve a darti l'int del giorno della settimana che parte da 1 quindi lunedi = 1 ecc ecc
		int giorno =LocalDate.now().getDayOfWeek().getValue();
		
		switch (giorno) {
		case 1: 
			System.out.println("oggi e' lenedi");
			break;
		case 2: 
			System.out.println("oggi e' martedi");
			break;
		case 3: 
			System.out.println("oggi e' mercoledi");
			break;
		case 4: 
			System.out.println("oggi e' giovedi");
			break;
		case 5: 
			System.out.println("oggi e' venerdi");
			break;
		case 6: 
			System.out.println("oggi e' sabato");
			break;
		case 7: 
			System.out.println("oggi e' domenica");
			break;
		
		default:
			System.out.println("Errore nella scelta del giorno ");
		}
		//-----------------------------------------\\
		
		String lettera = "i";
		switch(lettera) {
		case "a" :
		case "e":
		case "i":
		case "u":
			System.out.println(lettera+" e' una vocale");
			break;
		default:
			System.out.println(lettera + " e' una consonante");
		}
		
		
		switch (lettera) {
			case "a","e","i","o","u"->System.out.println(lettera+" e' una vocale");
			default -> System.out.println(lettera + " e' una consonante");
		}
		// -> lambda expression
		
		String messaggio =switch(lettera) {
							case "a","e","i","o","u"->lettera+" e' una vocale";
							default -> lettera + " e' una consonante";
		};
		System.out.println(messaggio);
		
		//------------------------------------\\
		//chiedi all'utente 2 numeri a,b
		// stampare 1 se a e' maggiore di b
		//stampare 2 se a e' uguale a b
		//altrimenti stampa 3
		*/
		
		Scanner s2 = new Scanner(System.in);
		/*
		System.out.println("Inserisci un numero");
		int numero1 = s2.nextInt();
		System.out.println("Inserisci un altro numero numero");
		int numero2 = s2.nextInt();
		s.nextLine();
		
		if (numero1>numero2) {
			System.out.println("1");
		}else if (numero1==numero2) {
			System.out.println("2");
		}else {
			System.out.println("3");
		}
		*/
// ----------------------\\
		//chiedere all'utente un numero intero 
		
		
		
		/*
		System.out.println("inserisci un numero intero");
		int x = (int)s2.nextInt();
		if(x<=100 && x%2==0) {
			System.out.println(" pari e piccolo");
		}else if(x>100 && x%2!=0) {
			System.out.println(" dispari e grande");
		}else if (x%2!=0 && x<=100) {
			System.out.println("piccolo e dispari");
		}else {
			System.out.println("pari e grande ");
		}
		
		
		
		
		
		System.out.println("inserisci un numero intero positivo(RICORDA!!!! Intero vuol dire senza la virgola,  mi raccomando!!!)");
		int y = (int)s2.nextInt();
		if (y<0) {
			System.out.println("Iniziamo male abbiamo detto che deve essere POSITIVOOOOO!!!");
		}
		else if (y<=100 && y>=0) {
			if (y%2==0) {
				System.out.println("pari e piccolo");
			}else {
				System.out.println("piccolo e dispari");
			}
		}else {
			if (y%2==0) {
				System.out.println("pari e grande");
			}else {
				System.out.println("grande e dispari");
			}
		}*/

		System.out.println("Quanto hai preso all'esame all'univesita'?");
		int voto = (int)s2.nextInt();
		
		if (voto<0 || voto>30) {
			System.out.println("MA che caspio di universita' fai, non prendermi in giro e dimmi quanto hai preso.");
		}else if (voto>=0 && voto<=17) {
			System.out.println("AHHHH allora sei stato boccoato, peccato si da al prossimo appello");
		}else if (voto>=18 && voto<=24) {
			System.out.println("AHHHH ottimo non si rifiuta nulla");
		}else {
				System.out.println("AHHHH ma allora sei stato un grande.");
		}
				
		
		
		System.out.println("Quanto hai preso all'esame all'univesita'?");
		int voto2 = (int)s2.nextInt();
		int registrato;
		if (voto<0 || voto>30) {
			System.out.println("MA che caspio di universita' fai, non prendermi in giro e dimmi quanto hai preso.");
		}else if (voto>=0 && voto<=17) {
			System.out.println("AHHHH allora sei stato boccoato, peccato si da al prossimo appello");
		}
		else  {
			if (voto>=18 && voto<=24) {
				System.out.println("AHHHH ottimo non si rifiuta nulla. Vuoi reggistrare il voto ? (1  pwr si 2 per no)");
				registrato = s2.nextInt();
				if (registrato==1) {
					System.out.println("Voto registrato");
				}else {
					System.out.println("Voto rifiutato");
				}
				
			}else {
					System.out.println("AHHHH ma allora sei stato un grande.Te lo chiedo tanto per vuoi registrarlo?");
					registrato = s2.nextInt();
					if (registrato==1) {
						System.out.println("Voto registrato");
					}else {
						System.out.println("Voto rifiutato");
					}
					
			}
		}
		
		
		
		
		
		
	
	
	}

}
