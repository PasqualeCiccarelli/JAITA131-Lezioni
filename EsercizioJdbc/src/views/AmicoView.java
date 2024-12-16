package views;

import java.util.List;

import models.entity.AmicoEntity;

public class AmicoView {
	
	
	public void  stampaAmico(AmicoEntity amico) {
		System.out.println(amico);
	}
	
	public void stampaAmici(List<AmicoEntity> amici) {
		for (AmicoEntity amico : amici) {
			System.out.println(amico);
		}
	}

}
