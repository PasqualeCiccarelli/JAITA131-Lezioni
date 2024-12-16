package testForme;

public class Triangolo extends Forma{
	
	private int altezza;

	public Triangolo(int lato, String tipo, int altezza) {
		super(lato, tipo);
		this.altezza = altezza;
	}
	
	@Override
	public double perimetro() {
		return lato*3;
	}
	
	@Override
	public double area() {
		return (lato*altezza)/2;
	}

	@Override
	public String toString() {
		return super.toString()+" altezza=" + altezza;
	}
	
	
}
