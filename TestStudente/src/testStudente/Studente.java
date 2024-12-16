package testStudente;
import testPersona.Persona;

public class Studente  extends Persona {
	String materia;

	public Studente(String materia, String nome, String cognome, int eta) {
		super(nome,cognome,eta);
		this.materia = materia;
	}

	@Override
	public String toString() {
		return super.toString() + " studia " + materia ;
	}

	public String getMateria() {
		return materia;
	}
	
	public void dorme() {
		System.out.println("dormo posco");
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	

}
