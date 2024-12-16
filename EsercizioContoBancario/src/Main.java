
public class Main {
	 public static void main(String[] args) {
		 
		 ContoCorrente conto1 = new ContoCorrente("1234", "Ciccio Pasticcio", 100.0);
		 
		 try {
			 
			 conto1.deposito(100.0);
			 conto1.prelievo(100.0);
			 conto1.deposito(1000.0);
			 conto1.prelievo(2000.0);
			 
		 }catch (IllegalArgumentException e) {
			
			 System.out.println("ERRORE: "+ e.getMessage());
			 
		}
		 
		 System.out.println("Saldo disponibile: "+conto1.getSaldo());
		 System.out.println("Mostra tutti i movimenti: ");
		 for (Movimento movimento : conto1.getMovimenti()) {
			System.out.println(movimento);
		}
	 }
}
