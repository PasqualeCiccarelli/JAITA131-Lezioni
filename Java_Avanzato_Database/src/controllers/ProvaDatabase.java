package controllers;

import java.sql.Connection;
import java.util.List;

import javax.xml.stream.events.Comment;

import dal.ConnessioneDatabse;
import dal.LibroDaoImpl;
import model.LibroEntity;
import views.LibroView;

public class ProvaDatabase {
	
	//Simuliamo una struttura di tipo MVC : model-view-controller
	//mvc e un design pattern(come anche REST: api json)
	//che restituisce html
	//la view e l'interfaccia utente (html o console)
	//view e controller in questo caso coincidono
	//model sarebbero i dati presenti su database
	public static void main(String[] args) {
		
		LibroDaoImpl libroDao = new LibroDaoImpl();
//		libroDao.readLibro();//metodo d'esempio
		
		List<LibroEntity> libri = libroDao.getAll();
		
		LibroView lv = new LibroView();
		lv.stampaLibri(libri);
		
		LibroEntity libro = libroDao.getLibroById(4);
		
		//Polimorfismo di compilazione ha 2 metodi con lo stesso nome
		//che accettano un parametro differente
		//noi la conosciamo come overloading del metodo 
		lv.stampaLibri(libro);
		
		libroDao.addLibro(libro);
		
		/*
		ConnessioneDatabse db =new ConnessioneDatabse();//istanza
		Connection conn = db.getConnection();
		
		ConnessioneDatabse db2 =new ConnessioneDatabse();
		Connection conn2= db2.getConnection();
		

		
		db.closeConnection();
		
		ConnessioneDatabse db3 =new ConnessioneDatabse();
		Connection conn3= db3.getConnection();
		

		
		db.closeConnection();
		
		*/
	}
}
