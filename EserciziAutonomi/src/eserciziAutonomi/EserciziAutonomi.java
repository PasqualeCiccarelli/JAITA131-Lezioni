package eserciziAutonomi;

import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.metal.MetalTabbedPaneUI;

public class EserciziAutonomi {

	public static void main(String[] args) {
		//-------------------------------ESERCIZI-------------------------------------------\\
		/*
		 * Esercizio 1
		 * si scriva un programma che chiede all'utente peso e altezza e calcola il BMI
		 * e indichi se la persona A nella norma, sovrappeso o sottopeso.
		 * BMI =peso / (altezza*altezza) (altezza in metri)
		 *  Secondo l’Organizzazione mondiale della sanità (OMS), il valore soglia del BMI nell'adulto è 25 per il sovrappeso e 30 per l’obesità. Il normopeso è indicato da un BMI compreso tra 18,5 e 24,9 e, infine, nella condizione di sottopeso, il BMI non raggiunge il valore di 18,5
		 */
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ciao oggi saro' il tuo dietologo. Potresti dirmi la tua altezza in metri?(Ricorda di usare la virgola e non il punto.)");
		double altezza = s.nextDouble();
		System.out.println("Benissimo. Ora, so che e' una domanda indelicata, ma potresti dirmi il tuo peso?");
		double peso = s.nextDouble();
		double bmi = (peso/(altezza*altezza));
		if (bmi>=0 && bmi<=18.4) {
			System.out.println("Attenzione, sei in sottopeso, dovresti mangiare di piu'. Ecco a te la tua dieta ci rivediamo tra due setimane ");
			}else if (bmi>=18.5 && bmi<=24.9) {
				System.out.println("Benissimo, sei nel tuo peso forma continua cosi'.");
				}else {
					System.out.println("Attenzione, sei in sovrappeso. Ecco a te la tua dieta ci rivediamo tra due settimane.");
				}
		
		
		
		/*
		 * Esercizio 2
		 * Realizzare un programma che permetta di giocare a morra cinese contro il computer
		 */
	
		System.out.println("");
		Random random = new Random();
		int computer = random.nextInt(1,4);
		System.out.println("Ciao, sei pronto a giocare contro di me? \nBene ti spiego le regole, scrivi 1 se vuoi giocare sasso, scrivi 2 se vuoi giocare carta, scrivi 3 se vuoi giocare forbici. \nTutto chiaro? Spero di si \nBenisasimo allra scegli cosa lanciare e iniziamo!!");
		int giocatore = s.nextInt();
		if (computer==giocatore) {
			System.out.println("JAAAAAN.....KEEEEEEN.......POOOOHH!..... E' un pareggio!!!");
		}else if ((computer==1 && giocatore==3)||(computer==2 && giocatore==1) || (computer==3 && giocatore==2)) {
			System.out.println("JAAAAAN.....KEEEEEEN.......POOOOHH!..... Ho vinto io!! Mi dispiace per te, ti andra' meglio la prossima volta.");
		}else if ((giocatore==1 && computer==3)||(giocatore==2 && computer==1) || (giocatore==3 && computer==2)) {
			System.out.println("JAAAAAN.....KEEEEEEN.......POOOOHH!..... Hoi vinto tu!! Complimenti!!!.");
		}else {
			System.out.println("Ayoh nella morra cinese esistono solo tre mose e te le ho spiegate le regole, \nsta tutto nella traccia leggi meglio la prossima volta tacci tua.");
		}
		
		/*
		 * Esercizio 3
		 * Realizzare con lo switch un programma che:
		 * chiede all'utente 2 numeri e l'operatore da eseguire sui 2 numeri (+ - * /)
		 * gestire nel caso della divisione che il divisore sia DIVERSO da 0
		 * esempio: inserisci il primo numero:3
		 *          inserisci il secondo numero: 4
		 *          inserisci operazione:+
		 *          output programma: 3 + 4 = 7
		 * 
		 */
		System.out.println("");
		System.out.println("Ciao, sono una calcolatrice. Mi potresti dare il primo numero che vuoi usare ?");
		int num1 = s.nextInt();
		System.out.println("Okkei. Mi potresti dare anche il secondo numero che vuoi usare ?");
		int num2 = s.nextInt();
		s.nextLine();
		System.out.println("Okkei ora parliamo delle operazioni. \nIo sono una calcolatrice un po stupidina, quindi so fare solo le operazioni di base. \nC'e' l'addizione (+), la sottrazione(-), la moltiplicazione(*) e la divisione(/). \nUsa il simbolo per indicarmi quale operazione vuoi fare con i due numeri prima. \n(ricorda di usare il simbolo giusto e che il primo numero viene diviso dal secondo. \n e anche che non puoi dividere per 0.");
		String operazione = s.nextLine();
		System.out.println(operazione);
		switch (operazione) {
		case "+": 
			System.out.println(num1+" + "+num2+" = "+(num1 + num2));
			break;
		case "-": 
			System.out.println(num1+" - "+num2+" = "+(num1 - num2));
			break;
		case "*": 
			System.out.println(num1+" * "+num2+" = "+(num1 * num2));
			break;
		case "/": 
			if (num2 != 0) {
                System.out.println(num1+" / "+num2+" = "+((double) num1 / num2)); 
            } else {
                System.out.println("Errore: te lo avevo anche detto che non puoi dividere per 0!");
            }
            break;
		default:
			System.out.println("Errore nella digitazione ");
		}

		/*
		 * Esercizio 4
		 * Realizzare con lo switch un programma che chiede il nome del mese e restituisce il numero dei giorni
		 * 
		 * Esempio: inserisci il mese: Marzo
		 * output: Marzo ha 31 giorni.
		 * nonn considerare gli anni bisestili
		 */
		System.out.println("");
		System.out.println("Ciao, dimmi il nome del mese di cui vuoi conoscere i giorni.");
		String mese = s.nextLine();
		mese = mese.toLowerCase();
		switch (mese) {
		case "gennaio","marzo","maggio","luglio","agosto","ottobre","dicembre":
			System.out.println( mese + " ha 31 giorni");
		break;
		case "febbraio" :
			System.out.println( mese + " ha 28 giorni");
			break;
		case "aprile","giugno","settembre", "novembre":
			System.out.println( mese + " ha 30 giorni");
		break;
		default:
			System.out.println("Errore nella digitazione del mese \n(Ti capisco e' veramente difficile scrivere un mese.)");
			break;
		}
		
	}

}
