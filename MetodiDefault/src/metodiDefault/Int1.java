package metodiDefault;

public interface Int1 {
	
	//puyblic static final
	int x= 10;
	
	//public abstract
	void ciao();
	
	//da java8 sono stati creati i metodi di default
	default void stamapa() {
		System.out.println("ciao da interfaccia1");
	}

}
