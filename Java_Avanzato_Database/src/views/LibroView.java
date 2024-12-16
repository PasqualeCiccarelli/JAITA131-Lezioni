package views;

import java.util.List;

import model.LibroEntity;

public class LibroView {

	public void stampaLibri(List<LibroEntity> libri) {
		// TODO Auto-generated method stub
		for (LibroEntity libro : libri) {
			System.out.println(libro);
		}
		
	}

	public void stampaLibri(LibroEntity libro) {
		// TODO Auto-generated method stub
		System.out.println(libro);
		
	}



}
