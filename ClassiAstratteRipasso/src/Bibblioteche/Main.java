package Bibblioteche;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro l1 = new Libro("Harry Potter e la camera di fuoco", "Rowling", true, 1000, "Fantasy");
		DVD d1 = new DVD("Inception", "Nolan", true, 148, "fantascienza");
		Rivista r1 = new Rivista("Focus", "Marco Casareto", true, 2024, "mensile");
		
		System.out.println(l1);
		System.out.println(d1);
		System.out.println(r1);
		
		l1.prestito();
		d1.prestito();
		r1.prestito();
		
		System.out.println(l1);
		System.out.println(d1);
		System.out.println(r1);
		
		l1.restituzione();
		d1.restituzione();
		r1.restituzione();
		
		System.out.println(l1);
		System.out.println(d1);
		System.out.println(r1);
	}

}
