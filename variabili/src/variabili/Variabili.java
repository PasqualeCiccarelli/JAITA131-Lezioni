package variabili;

import javax.lang.model.element.ModuleElement.DirectiveVisitor;

public class Variabili {

	public static void main(String[] args) {
		
		/// VARIABILI NUMERICHE
		// numeriche intere  
		// qui dichiaro 3 variabili b,sh e i
		// dichiarare significa indicare il tipo e il nome della variabile 
		byte b=1; // -128 +127
		short sh=1; //-32768 +32768
		int i=1; // tipo predefinito per gli interi -2miliardi a +2miliardi
		
		System.out.println(b);// qui stampo il valore della vaiabile 
		b=25;
		System.out.println(b);
		System.out.println("123");// stampa 123 come parola
		System.out.println(123);// stampa 123 come numero
		
		System.out.println(sh);
		
		System.out.println(i);
		System.out.println("il valore di i e' " + i);
		System.out.println("cambio il valore");
		i=50;//qui cambio il valore di i 
		System.out.println("Adesso il valore di i e' " + i);
		
		int primo =10;
		int secondo =5;
		
		int somma =primo+secondo;
		System.out.println(somma);
		int sottrazione=primo-secondo;
		System.out.println(sottrazione);
		int moltiplicazione=primo*secondo;
		System.out.println(moltiplicazione);
		int divisione=primo/secondo;
		System.out.println(divisione);
		
		System.out.println(10*10/5+3-1*4/2);
		
		//int a="ciao";
		
		long lungo=66L;// la L obbliga java a considerare la variabile di tipo long
		System.out.println(lungo);
		
		// variabili numeriche con la virgola
		
		float f=1.5F;//per variabili con la virgola, ma con meno cifre dopo la virgola 
		double d=2.5;//tipo predefinito di variabili con la virgola
				
		// tipi di dato carattere
		char carattere='a';// si usa ''
		char carattere2='b';
		System.out.println(carattere+ " " +carattere2);
		char aMaiuscola=65;//il char considera la tabella degli ashi quindi se gli diamo un numero traschrivera il codice ashi relativo a quel numero
		System.out.println(aMaiuscola);//A 
		aMaiuscola++;//e' uguale a scrivere +1
		System.out.println(aMaiuscola);
		aMaiuscola++;
		System.out.println(aMaiuscola);
		//post incremento 
		System.out.println(aMaiuscola++);//stampa C ma vale D (perche' prima lo stampoa e poi lo incrementa)
		System.out.println(aMaiuscola);//D
		//pre incremento 
		System.out.println(++aMaiuscola);//prima incrementa e poi stampa E
		
		String parola="ciao ";
		System.out.println(parola);
		
		
		String parola2="a tutti";
	    String parola3=parola+parola2;
	    System.out.println(parola3);
	    
		
		boolean vero=true;
		boolean falso=false;
		
		int eta=12;
		boolean maggiorenne= eta>=18;
		System.out.println(maggiorenne);
		
		//per dichiarare una cosatante bisogna usare il comando final
		//per convenzione le costanti vanno chiamate tutte in maiuscolo 
		final double PIGRECO=3.14;
		
		
		int var=56;
		long lung=var; //cast (implicito)
		// si ha un cast quando mischio due tipi di dati diversi
		// implicito vuol dire che java riesce perche' long e' piu' grande degli int 
		int x=10;
		double dbl=x; //cast implicito (sempre perche' il double e' piu' grande degli int)
		 
		long l2=56L;
		//int i2=12; cosi non si riesce
		int i2=(int)l2;// cast esplicito abbiamo trasformato un long in un int
		
		double d3=3.999999;
		int intera=(int)d3;//cast espolicito ma da double a int perdo i valori dopo la virgola
		System.out.println(intera);
		
		byte mioByte=12;
		byte mioByte2=15;
		
		//byte tot=mioByte+mioByte2; scrivendo cosi' ci sa errore perche' java va in automatico a creare int e non ci entra in un byte
		// il tipo predefinito e' int, anche se a volte usiamo un nuovo tipo di dato
		byte tot=(byte)(mioByte+mioByte2);// cosi' forzo l'utilizzo del byte
		
		char lettera='a';
		int ascii=(int)lettera;
		System.out.println(ascii);
		
		char carattere3=(char)100;
		System.out.println(carattere3);
		
		int w=10;
		System.out.println(w++);// post incremento quindi prima stampa e poi incrementa
		//il risultato della stampa quindi e' 10 ma w vale gia' 11.
		//infatti se ora stampiamo w senza incremento ne nulla ci uscira' 11
		System.out.println(w);
		
		System.out.println(++w);//questo invece e' un post icremento cioe' prima incrementa e poi stampa
		//quindi appuntto in questo caso la console mostrera' il numero 12
		
		
		var miaVariabile=10;//prende il tipo dal valore che assegno in questo caso un int 
		//var serve a dichiarare una variabile come in javascript cioe' prende qualsiasi valore
		//miaVariabile= "ciao";//non posso pero' poi cambiare il tipo di dato 
		//----------------------------------------------\\
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
