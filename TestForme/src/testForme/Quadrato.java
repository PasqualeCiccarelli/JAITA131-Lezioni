package testForme;

public class Quadrato extends Forma{

	public Quadrato(int lato, String tipo) {
		super(lato, tipo);
	}
	
	@Override
	public double perimetro() {
		return lato*4;
	}
	
	@Override
	public double area() {
		return lato*lato;
	}
	
	

}
