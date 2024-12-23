package controllers;

import java.util.ArrayList;
import java.util.List;

import dals.AmicoDaoImpl;
import models.entity.AmicoEntity;
import views.AmicoView;

public class AmicoCtrl {
	
	public static void main(String[] args) {
	
		AmicoDaoImpl amicoDao = new AmicoDaoImpl();
		
		List<AmicoEntity> amici = amicoDao.getAllAmici();
		
		AmicoView av = new AmicoView();
		av.stampaAmici(amici);
		
		AmicoEntity amico = amicoDao.getAmicoById(2);
		
		av.stampaAmico(amico);
		
		AmicoEntity amico2 = new AmicoEntity("Giuseppe", "Giovanni", "giovanni@gmail.com");
//		amicoDao.addAmico(amico2);
		
		AmicoEntity amico3 = new AmicoEntity("Giuseppe3", "Giovanni3", "giovanni3@gmail.com");
//		amicoDao.addAmico(amico3);
//		AmicoEntity amicoNuovo = new AmicoEntity("Giovanni", "Giuseppe", "ggg@ggg.com");
//		int boh = amicoDao.addAmico(amicoNuovo);
		AmicoEntity amicoCambiato = amicoDao.getAmicoById(11);
		amicoCambiato.setNome("Giuseppe2");
		amicoDao.updateAmico(amicoCambiato);
//		System.out.println(boh > 0 ? "Inserito":"Errore inserimento nuovo libro");
		
		
//		amicoDao.delateAmico(4);
		
		
		
		
		
		
		
		
		
		
	}
}
