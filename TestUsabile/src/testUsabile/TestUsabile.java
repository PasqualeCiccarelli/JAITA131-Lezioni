package testUsabile;

public class TestUsabile {
	
	public static void main(String[] args) {
	
		Usabile[] arrUsabili = {new Computer(), new Macchina(), new Martello()};
		
		for (Usabile usabile : arrUsabili) {
			usabile.usa();
		}
		
		Computer c = new Computer();
		Martello m = new Martello();
		utilizza(c);
		utilizza(m);
	
	

	}//main 
	
	public static void utilizza(Usabile u) {
		u.usa();
	}
	
	
	
}
