package testForme;

public abstract class Forma {
	
	protected int lato;
	protected String tipo;
	
	public Forma(int lato, String tipo) {
		this.lato = lato;
		this.tipo = tipo;
	}
	
	public abstract double perimetro();
	
	public abstract double area();

	@Override
	public String toString() {
		return "Forma:  tipo= " + tipo +" ed ha il lato= " + lato;
	}
	
	
	
	

}
