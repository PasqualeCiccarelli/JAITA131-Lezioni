package dal;

import java.util.List;

import model.LibroEntity;

public interface LibroDao {
	
	//questa e la queri da eseguire nel metodo getAll
	String SELECT_ALL ="Select * from libro";
//	String b
	//mancano le altre
	
	//queste sono le CRUD
	List<LibroEntity> getAll();//read
	LibroEntity getLibroById(int id);//read one
	int updateLibro(LibroEntity libro);//update
	int deleteLibroById(int id);//delete
	int addLibro(LibroEntity libro);//create

}
