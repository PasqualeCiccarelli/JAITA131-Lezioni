package metodiDefault;

public class TestDefault {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		A a = new A();
		a.ciao();// --> deriva dal metodo astratto dell'interfaccia
		a.stamapa();// --> default quindi contiene il corpo del metodo
		a.stamapa2();// --> default quindi contiene il corpo del metodo
		System.out.println(a.x);
		System.out.println(a.y);
	}

}
