package org.generation.__SpringBase.RESTControllers;


import java.util.ArrayList;
import java.util.Arrays;

import org.generation.__SpringBase.Models.Dtos.Studente;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
//@RequestMapping("/api/base")
@RequestMapping(path = "/api/base")//ho scritto la stessa cosa di prima 
public class BaseMappingController {

	//MAPPATURA:
	//associazione con un url
	//se mappo/associo associo questo controller
	//o i suoi metodi a un o piu Url, le richieste relative
	//a questi Url verranno indirizzate a questo controller
	//e i suoi metodi
	
	//INTRO Json Array ["corso Java","corso Database"]
//	@RequestMapping(path = "/elenco-corsi", method = RequestMethod.GET)
//	@GetMapping("/elenco-corsi")//equivalente a quello scritto sopra
	@GetMapping(path = "/elenco-corsi", produces = MediaType.APPLICATION_JSON_VALUE)
	public ArrayList<String> getcorsi() {
		ArrayList<String> corsi = new ArrayList<String>();
		corsi.add("Corso Java");
		corsi.add("Corso Database");
		
		return corsi;
	}
	
	//Json Object
//	@GetMapping("/studente")
	@GetMapping(path = "/studenti", produces = MediaType.APPLICATION_JSON_VALUE)
	public Studente getUnoStudente() {
		Studente studente = new Studente("Flavio", "Rossi");
		return studente;
	}
	
	@GetMapping("/studenti")
	public ArrayList<Studente> getTuttiStudente() {
		
		ArrayList<String> corsi = new ArrayList<String>();
		corsi.add("Corso Java");
		corsi.add("Corso Database");
		
		ArrayList<Studente> tutti = new ArrayList<Studente>();
//		tutti.add(new Studente("Flavio", "Rossi"));
//		tutti.add(new Studente("Mario", "verdi"));
		Studente uno = new Studente("Flavio","Rossi");
		uno.setCorsi(corsi);
		
		Studente due = new Studente("Mario","Verdi");
		ArrayList<String> corsi2 = new ArrayList<String>();
		corsi2.add("Corso Java");
		corsi2.add("Corso Database");
		due.setCorsi(corsi2);
		
		tutti.add(uno);
		tutti.add(due);
		
		
		return tutti;
	}
	
	/**
	 * {id} e un segnaposto che viene castato(convertito) da String a Tipo indicato nelle parentesi()
	 * in questo caso un intero che indica lo studente che sto cercando 
	 * 
	 * path: /api/base/studente/1
	 * variabile di percorso
	 * @PathVariable prende ilo valore scritto nella stringa url
	 * e lo mette nella variabile int nelle ("nomeVariabie")
	 * 
	 * @return
	 */
	@GetMapping("/studente/{id}")
	public Studente getStudenteById(@PathVariable("id") int id) 
	{
//		int risultato = Integer.parseInt("1");
		ArrayList<Studente> studenti = new ArrayList<Studente>();
		studenti.add(new Studente(1,"Mario", "Rossi"));
		studenti.add(new Studente(2,"Paolo", "Verdi"));
		
		Studente studenteTrovato =new Studente();
		
		try {
			for (Studente studente : studenti) {
				// status 200
				if (studente.getId() == id) {
					studenteTrovato = studente;
				}
			}
			
		} catch (Exception e) {//viene sollevata un eccezione 
			//status 500
			studenteTrovato = new Studente();
		}
		
		//status 404
		return studenteTrovato;
	}
	
	
	
	/**
	 * QueryString
	 * url che contiene un elenco di paramentri dopo il ?
	 * path: /api/base/studente-param?id=1
	 * @param id
	 * @return
	 */
	@GetMapping("/studente-param")
	public Studente getUnoStudenteByIdParameter(@RequestParam("id") int id) {
		
		ArrayList<Studente> studenti = new ArrayList<Studente>();
		studenti.add(new Studente(1,"Mario", "Rossi"));
		studenti.add(new Studente(2,"Paolo", "Verdi"));
		
		Studente studenteTrovato =new Studente();
		
		try {
			for (Studente studente : studenti) {
				// status 200
				if (studente.getId() == id) {
					studenteTrovato = studente;
				}
			}
			
		} catch (Exception e) {//viene sollevata un eccezione 
			//status 500
			studenteTrovato = new Studente();
		}
		
		//status 404
		return studenteTrovato;
	}
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//---------------------INTRO BASE---------------\\
	//commento classico
	/**
	 * questo e un commento di un metodo o meglio un java doc
	 * DEPRECATO: perche i RestFul dovrebbero restituire un json
	 * getBase e solo il nome del metodo potete chiamarlo come preferite <br>
	 * ma sarebbe meglio dargli un nome sensato <br>
	 * mappatura: "/api/base/string" + GET
	 * cioe la somma della mappatura in testa al controller piu la mappatura del metodo <br>
	 * GET: prendi/cerca/ottieni (come getter di java) ti restituisce un dato
	 * @return String
	 */
	//@RequestMapping(path = "/string") 
	@RequestMapping(path = "/string", method = RequestMethod.GET) //la stessa cosa scritta prima
	public String getBase() {
		return "base";
		
	}
	
	/**
	 * DEPRECATO: non e il modo migliore, ma e possibile
	 * mappatura/path(percorso): /api/base/html +get 
	 * @return string html
	 */
	@RequestMapping(path = "/html", method = RequestMethod.GET)
	public String getHtmlBrutto() {
		return "<html><head></head><body><h1> html brutto</h1> </body></html>";
	}
	
	
	

	/**
	 * Post: aggiungi un dato, ma puo anche restituisce un dato
	 * mappatura: "/api/base/string" + POST
	 * @return
	 */
	@RequestMapping(path = "/string", method = RequestMethod.POST)
	public String getBase2() {
		return "base2";
		
	}

}
	

