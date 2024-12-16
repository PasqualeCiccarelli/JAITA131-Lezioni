package testRiproducibile2;

import java.util.List;

public class Video implements Riproducibile{
	
	private final List<Film> elencoFilm;
	
	 public Video(List<Film> elencoFilm) {
	        this.elencoFilm = elencoFilm;
	    }

	@Override
	public void play() {
		elencoFilm.forEach(Film::riproduci);
	}

}
