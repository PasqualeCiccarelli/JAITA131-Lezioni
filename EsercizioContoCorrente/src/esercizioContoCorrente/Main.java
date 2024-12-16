package esercizioContoCorrente;

public class Main {

	public static void main(String[] args) {
		ContoCorrente c1 = new ContoCorrente("Eren Jrgah", 5000);
		
		System.out.println(c1.riepilogo());
		
		c1.preleva(1200.0);
		c1.preleva(1200.0);
		c1.preleva(1200.0);
		c1.preleva(12000.0);
		c1.preleva(1400.0);
		
		System.out.println(c1.riepilogo());
		
		c1.versa(50000);
		
		System.out.println(c1.riepilogo());


	}

}
