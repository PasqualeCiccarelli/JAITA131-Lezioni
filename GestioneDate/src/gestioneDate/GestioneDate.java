package gestioneDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class GestioneDate {

	public static void main(String[] args) {
		// Possiamo anche creare prima la classe per poi cliccarci sopra e lo importiamo automaticamente 
		Date oggi = new Date();
		System.out.println(oggi);
		//int giorno =oggi.getDate() // deprecato non si usa piu'
		LocalDate data = LocalDate.now();
		//se usiamo il suggerimento ce lo importa automaticamente
		System.out.println(data);// ci stampa la data in questo formato anno-mese-giorno
		LocalTime ora = LocalTime.now();
		System.out.println(ora);
		LocalDateTime dataConOra = LocalDateTime.now();
		System.out.println(dataConOra);
		DateTimeFormatter formato= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss\n" +"EEEE MMMM\n" + "'Oggi e il' EEEE dd MMMM Y");//dd giorni MM mesi yyyy anno HH ore mm minuti ss secondi EEEE giorno in lettere MMMM mese in lettere
		System.out.println(dataConOra.format(formato));
		
		// Stampare la data di oggi con il formato "Oggi e' il giorno**mese**anno "
		// sono le ore ora**minuti**secondi* di giovedi
		
		DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("'Oggi e il ' dd**MM**yyyy\n'Sono le ore ' HH**mm**ss 'di ' EEEE");
		System.out.println(dataConOra.format(formato2));
		 
		
		
		
		
		
		
		
		

	}

}
