package testForme;

public class Rettangolo extends Forma{
	
	private int altezza;

	public Rettangolo(int lato, String tipo, int altezza) {
		super(lato, tipo);
		this.altezza = altezza;
	}
	
	@Override
	public double perimetro() {
		return (lato + altezza)*2;
	}
	
	@Override
	public double area() {
		return lato * altezza;
	}

	@Override
	public String toString() {
		return super.toString()+", altezza=" + altezza;
	}
	
	

}
