package testForme;

public class Cerchio extends Forma{
	
	private final double PI = 3.14;

	public Cerchio(int lato, String tipo) {
		super(lato, tipo);
	}
	
	@Override
	public double perimetro() {
		return 2*PI*lato;
	}
	
	@Override
	public double area() {
		return PI*lato*lato;
	}
	
}
