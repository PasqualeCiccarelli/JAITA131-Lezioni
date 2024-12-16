package esercizioLamapdina;

public class Main {

	public static void main(String[] args) {
		Lampadina l = new Lampadina(true, false);
		l.stato();
		l.click();
		l.stato();
		l.click();
		l.stato();
		l.click();
		l.stato();
	}

}
