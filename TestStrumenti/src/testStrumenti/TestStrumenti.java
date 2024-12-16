package testStrumenti;

public class TestStrumenti {

	public static void main(String[] args) {
		
		Strumento s = new Strumento("generico");
		
		Chitarra c = new Chitarra("Ferder", 6);
		Tromba t = new Tromba("t1",3);
		
//		s.suona();
//		c.suona();
//		t.suona();
		
		Strumento[] arrS = {s,c,t};
		
		for (Strumento strumento : arrS) {
			strumento.suona();
		}
	
	}
	
	static void suonaMain(Strumento strumento) {
		strumento.suona();
	}

}
