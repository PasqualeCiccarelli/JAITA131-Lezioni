package testRiproducibile2;

import java.util.List;

public class Audio implements Riproducibile{
	
	private final List<Canzone> albumCanzoni;
	
	  public Audio(List<Canzone> albumCanzoni) {
	        this.albumCanzoni = albumCanzoni;
	    }

	@Override
	public void play() {
		albumCanzoni.forEach(Canzone::riproduci);
	}
	
	

}
