package esercizioLibro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Libro l1 = new Libro("Franco", "Giuseppe",999.9999);
		Libro l2 = new Libro("Franco il ritorno", "Giuseppe il ritorno",999.9999);
		Libro l3 = new Libro("Franco la Vendetta", "Giuseppe",999.9998);
		Libro l4 = new Libro("Franco reboot", "Giuseppe Paolo Secondo",999.9999);
		Libro l5 = new Libro("Franco e la notte dei morti viventi 8", "Giuseppe il figlio pero di quello il ritorno",999.9999);
		Libro l6 = new Libro("Harry potter e la Pietra del calice di fuoco prigioniera dell'ordine della fenice che ha i doni della morte", "Giuseppe",1000.01);
		Libreria libreria = new Libreria();
		
		libreria.aggiungiLibroBeneee(l1);
		libreria.aggiungiLibroBeneee(l2);
		libreria.aggiungiLibroBeneee(l3);
		libreria.aggiungiLibroBeneee(l4);
		libreria.aggiungiLibroBeneee(l5);
		libreria.aggiungiLibroBeneee(l6);
		
		System.out.println(libreria.trova("Giuseppe"));
		

	}

}
