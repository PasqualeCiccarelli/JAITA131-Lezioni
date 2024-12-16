package metodiDefault;

public interface Int2 {
	
	//ATTENZIONE non si possono usare gli stessi nomi delle variabili ne dei metodi
	//se no se dobbiamo unire due interfacce con gli stessi nomi ti ritorna errore
	int y=20;
	
	default void stamapa2() {
		System.out.println("ciao da interfaccia2");
	}

}
