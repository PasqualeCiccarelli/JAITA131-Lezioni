package inputUtente;
import java.util.Scanner; //e'la libreria di funzioni per prendere l'input utente

public class InputUtente {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in); // il modo in cui rendiamo disponibile al programma lo scanner 
		 //sistem.in serve a leggere gli import della tastiera
		 
		 System.out.println("Come ti chiami?");
		 String nome =input.nextLine(); // sto prendendo quello che mi scrive l'utente e la salvo nella variabile nome
		 
		 System.out.println("Hai inserito il nome: " + nome);
		 System.out.println("Quale'e' il tuo colore preferito?");
		 String colore = input.nextLine();
		 System.out.println("Il tuo colore preferito e' il: " + colore);
		 System.out.println("Quanti anni hai?");
		 int anni = input.nextInt(); // per i numeri interi si usa nextint
		 input.nextLine();// serve per leggere l'invio e non bloccare 
		 //bisogna metterlo ogni volta che usiamo nextint
		 System.out.println("Hai detto di avere: "+ anni + " anni");
		 boolean maggiorenne=(anni>=18);
		 System.out.println("Sei maggiorenne ?" + maggiorenne);
		 System.out.println("Quale'e' il tuo cibo preferito?");
		 String cibo=input.nextLine();
		 System.out.println("Il tuo cibo preferito e' : " + cibo);
		 System.out.println("Quanto sei alto ?");
		 double altezza=input.nextDouble();
		 input.nextLine();
		 
		 System.out.println("Sei alto " + altezza+ " m");
		 
		 System.out.println("Che lavoro fai?");
		 String lavoro=input.nextLine();
		  
		 System.out.println("Come lavoro fai il: " + lavoro);
		 //input.close(); si chiude lo scanner solo se lo scanner legge file o altre cose non quando legge input dalla tastiera solo se accede a risorse esterne 
		 

		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
