package esercizioProdotti2;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestNegozio {

	public static void main(String[] args) {
		
		 Cliente c1 = new Cliente("Gianfraco","Gallinari", 65);
	     Cliente c2 = new Cliente("Dottoressa","Gastani Frinzi", 30);
	    
		
		ArrayList<Prodotto> prodotti = new ArrayList<>();
        
        prodotti.add(new Alimenti("123456", "Latte", 1.50, c1, LocalDate.of(2025, 11, 12)));
        prodotti.add(new Alimenti("789012", "Pane", 2.00, c2, LocalDate.of(2024, 11, 14)));
        prodotti.add(new NonAlimenti("345678", "Bottiglia di Vetro", 5.00, c1, "vetro"));
        prodotti.add(new NonAlimenti("901234", "Sacchetto di Carta", 1.00, c2, "carta"));
        prodotti.add(new NonAlimenti("567890", "Giocattolo in Plastica", 15.00, c2, "plastica"));
        
        
        for (Prodotto prodotto : prodotti) {
            prodotto.sconto();
            System.out.println(prodotto);
            System.out.println();
        }

	}

}
