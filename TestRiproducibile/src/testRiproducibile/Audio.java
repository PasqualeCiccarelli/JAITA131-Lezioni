package testRiproducibile;

public class Audio implements Riproducibile{
	
	private Canzone[] albumCanzoni;
	
	public Audio(Canzone[] albumCanzoni) {
		this.albumCanzoni= albumCanzoni;
	}

	@Override
	public void paly(Multimedia[] list) {
		// TODO Auto-generated method stub
		System.out.println("Stai ascoltando l'album di canzoni: ");
		for (Multimedia media : list) {
			if(media instanceof Canzone) {
				Canzone c = (Canzone) media;
				System.out.println("titolo: "+c.titolo+" di "+ c.getAutore()+" della durata di "+c.durata+" secondi");
			c.riproduci();
			}
			
		}
		
	}
	
	

}
