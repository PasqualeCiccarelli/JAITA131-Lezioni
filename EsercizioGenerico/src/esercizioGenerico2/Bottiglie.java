package esercizioGenerico2;

public class Bottiglie<T> {
	
	private T contenuto;
	
	public void riempi(T contenuto) {
		this.contenuto = contenuto;
		System.out.println("la sera la riempio con  "+contenuto);
	}
	
	public void svuota() {
		if(contenuto != null) {
			System.out.println("E la mattina la svacanto");
			contenuto = null;
		}else {
			System.out.println("l'ho gia svacantata stamattina");
		}
	}
	
	public boolean eVuota() {
		return contenuto == null;
	}

	public T getContenuto() {
		return contenuto;
	}
	
	
	

}
