package cicli;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Cicli {

	public static void main(String[] args) {
		// inizializzazione int i = 0;
		//condizione di permanenza nel ciclo i<10; fino a quando deve ciclare
		//incremento i++
//		for (int i=0; i<10;i++) {
//			System.out.println(i+" ciao");
//		}
//		for(int i=10;i>0;i--) {
//			System.out.println(i);
//		}
//		//partendo da 0 prendo solo i pari
//		for(int i=0;i<10;i+=2) {
//			System.out.println(i);
//		}
//		//for per stampare tutti i caratteri
//		for(int i =37; i<127;i++) {
//			System.out.println(i+": "+(char)i);
//		}
//		
//		//for destrutturato
//		//serve quando hai una variabile gia creata e vogliamo usarla come indice di partenza 
//		int contatore=0;
//		for(;contatore<10;) {
//			System.out.println(contatore);
//			contatore++;
//		}
//		//ciclo con due variabili dove una sale e una scende
//		for(int i=0,j=10;i<10;i++,j--) {
//			System.out.println("i= "+i+ " j= "+j);
//		}
//		//stampiamo ogni lettera di una stringa
//		String a="ciao a tutti";
//		for(int i=0;i<a.length();i++) {
//			System.out.println(a.charAt(i));
//		}
//		//contiamo numero spazi
//		int numeroSpazi=0;
//		for(int i=0;i<a.length();i++) {
//			if (a.charAt(i)==' ') {
//				numeroSpazi++;
//			}
//		}
//		System.out.println("spazi= "+numeroSpazi);
		
		
		Random r =new Random();
		
//		boolean trovato = false;
//		
//		int casuale = r.nextInt(1,21);
//		System.out.println("il numero casuale e' "+casuale);
//		
//		for(int i=1;i<=10;i++) {
//			if (casuale==i) {
//				System.out.println("trovato in posizione "+i);
//				trovato=true;
//				break;
//			}
//			
//		}
//			if (!trovato) {
//				System.out.println("il numero non e' stato trovato ");
//			}
		
		//oppure
		//quell'ulteriore oarametro si chiama sentinella e dice di fermare il ciclo una volta trovato quello che ci serve 
//		for(int i=1;i<=10 && trovato==false ;i++) {
//			if (casuale==i) {
//				System.out.println("trovato in posizione "+i);
//				trovato=true;
//				
//			}
//			
//		}
//			if (!trovato) {
//				System.out.println("il numero non e' stato trovato ");
//			}
//
//		
//		for (int i=1;i<=10;i++) {//per ogni valore di i
//			for(int j=1;j<=10;j++) {//lo moltiplico per il valore di j
//				//ogni giro di 1 j ne fa 10
//				System.out.print("\t"+i*j);
//				//\t serve per tabulare
//			}
//			System.out.println("");
//		}
//		
//		for(int i=0;i<5;i++) {
//			System.out.println("ciclo esterno");
//			for(int j = 0; j<3;j++) {
//				System.out.println("\t ciclo interno");
//			}
//		}
//		
//		int contatore2 = 0;
//		while(contatore2<10) {
//			System.out.println(contatore2);
//			contatore2++;
//		}
//		contatore2=10;//nel ciclo while normale non entrebbe proprio invece nel do while prima lo fai poi conttolla se rispetta la condizione continua se no si fema 
//		do {
//			System.out.println(contatore2);
//			contatore2++;
//		}while(contatore2<10);
		
		//esempio
		Scanner s = new Scanner(System.in);
//		int valore = s.nextInt();
//		while(valore!=0){
//		System.out.println("inserisci un valore e metti 0 per uscire");
//		valore=s.nextInt();
//		}
//		
//		do {
//			System.out.println("inserisci un valore e metti 0 per uscire");
//			valore=s.nextInt();
//		}while(valore!=0);
//		
//		
//		
//		
//		char lettera='a';
//		while(lettera<='z') {
//			System.out.println(lettera);
//			lettera++;
//		}
//		
//		int vocali=0;
//		int consonanti=0;
//		
//		
//		for(char lettera2='a'; lettera2<='z';lettera2++){
//			switch (lettera2) {
//			case 'a','e','i','o','u':
//				System.out.println(lettera2+ " e' una vocale");
//			vocali++;
//			break;
//			default:
//				System.out.println(lettera2+" e' una consonante");
//				consonanti++;
//			}
//		}
//		System.out.println("vocali " + vocali+ "consonanti "+consonanti);
//		
//		for(int i = 0; i<10; i++) {
//			if(i==5) {
//				continue;//continue salta un giro senza romperlo (in questo caso stampa tutti i numeri tranne il 5)
//			}
//			if (i==7) {
//				break;//questi invece serve a dire che quando trova questo valore rompe il ciclo
//			}
//			System.out.println(i);
//		}
//		// ciclo infinito con il for
//		
//		int val=0;
//		for(;;) {
//			if (val==10) {
//				break;
//			}
//			val++;
//		}
//		
//		//ciclo infinito con while
//		while(true) {
//			System.out.println("inserisci un numero, 7 per uscire");
//			int numero2 = s.nextInt();
//			System.out.println("hai inserito "+numero2);
//			if(numero2==7) {
//				System.out.println("ciao");
//				break;
//			}
//		}
//		
//		Scanner s2 = new Scanner(System.in);
//		System.out.println("fino a che numero vuoi scrivere ? Il numero deve essere positivo");
//		int arrivo = s2.nextInt();
//		if (arrivo<0) {
//			System.out.println("errore, positivo vuol dire maggiore di 0.");
//		}else {
//			for (int i=0;i<=arrivo;i++) {
//			System.out.println(i);
//		}
//		}
//		
//		
//		
//		
//		
//		
//		int somma=0;
//		System.out.println("quanti numeri vuoi sommare ?");
//		int tot = s2.nextInt();
//		for(int i=1;i<=tot;i++) {
//			System.out.println("dimmi un numero da sommare");
//			somma +=s.nextInt();
//		}
//		
//		System.out.println(somma);
//		
//		
//		Random r2 = new Random();
//		int n = r2.nextInt(1,101);
//		int cauntPari =0;
//		int cauntDispari =0;
//		System.out.println(n);
//		for(int i=0;i<=n;i++) {
//			if(i%2==0){
//				cauntPari++;
//			}else {
//				cauntDispari++;
//			}
//		}
//		System.out.println(cauntDispari + ", " +cauntPari);
//		
//		
//		
//		int boh=0;
//		System.out.println(n);
//		while (boh<=n) {
//			if(boh%2==0){
//				cauntPari++;
//			}else {
//				cauntDispari++;
//			}
//			boh++;
//		}
//		System.out.println(cauntPari +", " + cauntDispari);
		
		
		
		
		
		
		
//		int casuale2 =r.nextInt(0,11);
//		System.out.println("prova ad indovinare il numero che ho pensato");
//		for(int i=0;i<10;i++) {
//			int risposta=s2.nextInt();
//			if(risposta==casuale2) {
//				System.out.println("Esatto!!! \nMi dovresti dare il numero,la scadenza e il dodice della tua carta, \ncosi ti do il premio in denaro che hai vinto.");
//				System.out.println("inserire numero carta");
//				int numeroCarta=s2.nextInt();
//				System.out.println("inserire scadenza");
//				int scadenza=s2.nextInt();
//				System.out.println("inserire codice di sicurezza");
//				int codice =s2.nextInt();
//				System.out.println("bene i tuoi dati sono stati salvati. Addioooooo, impara a non lasciare i tuoi dati inh giro babbo");
//				break;
//			}
//			else {
//				if(risposta < casuale2) {
//					System.out.println("il numero che cerchi e' piu' grande di "+ risposta);
//				}else if (risposta >casuale2){
//					System.out.println("il numero che cerchi e' piu' piccolo di "+ risposta);
//				}else {
//					System.out.println("errore");
//				}
//			}
//		}
		
//		

		int caramelle = 50;
		double prezzoCaramelle = 0.5;
		double prezzo =0;
		while(caramelle > 0) {
			System.out.println("Buongiorno, quante caramelle vuole?");
			int numeroCaramelle= s.nextInt();
			if(numeroCaramelle<=0) {
				System.out.println("Caspio sei entrato a fare allora.");
			}
				else if(caramelle>0 && numeroCaramelle<caramelle) {
			prezzo = (prezzoCaramelle * numeroCaramelle);
			System.out.println("Bene, lei paga "+ prezzo+ " euro");
			caramelle = caramelle - numeroCaramelle;
			}
			else if (caramelle>0 && numeroCaramelle>caramelle){
				System.out.println("non sono disponibili tutte queste caramelle, ma ce ne sono anco "+caramelle);
			}
			else if (caramelle>=0 && numeroCaramelle==caramelle) {
				prezzo = (prezzoCaramelle * numeroCaramelle);
				System.out.println("Bene, lei paga "+ prezzo+ " euro. Le caramelle sono finite");
				caramelle = caramelle - numeroCaramelle;
			}
			
			else {
				System.out.println("le caramelle sono finite");
			}
		}
	
	
	
		
		
		
		
		
	}

}
