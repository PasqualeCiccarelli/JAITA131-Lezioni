package esercizioLamapdina;

public class Lampadina {
	//puo essere accesa spenta o rotta due opzioni stato restituisce stringa corrispondente allo stato della lampadina
	//click cambia stato da accesa a spenta o viceversa
	//la lampadina si rimpe dopo un tot di click predefinito scelto 
	//deve contenere una o piu variabili d'istanza che descrivono lo stato
	//un ooportuno costruttore
	//metodi chiesti
	
	static int count=0;
	
	private boolean acceso;
	private boolean rotto;
	
	public Lampadina(boolean acceso, boolean rotto) {
		this.acceso =acceso;
		this.rotto=rotto;
	}
	
	public void stato() {
		if  (rotto) {
			System.out.println("la lampadina e rotta");
		} else {
			if (acceso) {
				System.out.println("la lampadina e accesa");
			} else {
				System.out.println("la lampadina e spenta");
			}
		}
		}
	
	public boolean click() {
		count++;
		if(count >= 3) {
			System.out.println("hai rotto la lampadina, si e' una lampadina cinese");
			return rotto = true;
		} else {
			
			if(acceso) {
				return acceso = false;
			} else {
				return acceso = true;
			}
		}
	
	}
	
	
	
	
	
	
	}
	
	


