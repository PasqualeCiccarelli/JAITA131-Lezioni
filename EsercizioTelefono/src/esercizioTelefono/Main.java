package esercizioTelefono;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono t= new Telefono("samsung", "note 10 pro max con il pennino bellissimo per fare i disegnini carini" , 10.00);
		t.chiamata(2);
		t.creditoResiduo();
		t.chiamata(30);
		t.creditoResiduo();
		t.chiamata(16);
		t.creditoResiduo();
		t.chiamata(6);
		t.creditoResiduo();
		System.out.println(t.ricaricaCredito(10));
		

	}

}
