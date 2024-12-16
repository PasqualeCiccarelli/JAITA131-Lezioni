package org.generation.springbasedue.Services.Interfaces;

import java.util.List;

public interface CommonService<T> {
	
	List<T> getTutti();
	T getUnoPerId(int id);

}
