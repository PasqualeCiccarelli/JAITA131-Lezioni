package esercizioContoCorrente;


public class ContoCorrente {
	private String nome;
	private double depositoIniziale;
	private int numeroConto;
	
	public static int generatoreNumeroConti = 2354345;
	
	public ContoCorrente(String nome, double depositoIniziale) {
		this.nome=nome;
		this.depositoIniziale=depositoIniziale;
		this.numeroConto=generatoreNumeroConti++;
		
	}
	
	public void preleva(double prelievo) {
        if (prelievo > this.depositoIniziale) {
            System.out.println("Operazione non permessa: saldo insufficiente.");
        } else {
            this.depositoIniziale -= prelievo;
            System.out.println("Prelievo di " + prelievo + " completato.");
        }
    }
	
	public void versa(double versamento) {
        depositoIniziale += versamento;
        System.out.println("Versamento di " + versamento + " completato.");
    }

	public String riepilogo() {
        return "Cliente: " + nome + " - Saldo: " + depositoIniziale;
    }
	
	
}
